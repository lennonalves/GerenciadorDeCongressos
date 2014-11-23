/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.ConvitesVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author lennonalves
 */
public class ConvitesPers {
    
    public static ConvitesPers instancia;
    
    protected ConvitesPers(){}
    
    public static ConvitesPers getInstancia() {
        if (instancia == null)
            instancia = new ConvitesPers();
        return instancia;
    }
    
    public String enviarConvite (ConvitesVO cvo) {
        
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication("lennonalvesdias@gmail.com", "senha");
             }
        });
        
        session.setDebug(true);
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet destinatarios = consulta.executeQuery("SELECT * FROM PESSOA");
            ResultSet nomeCongresso = consulta.executeQuery("SELECT * FROM CONGRESSO");
            
            if (nomeCongresso.next()){
                
                while (destinatarios.next()){
                    
                    try {
                        
                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("lennonalvesdias@gmail.com"));
                        
                        Address[] toUser = InternetAddress.parse( destinatarios.getString("EMAIL") );
                        
                        message.setRecipients(Message.RecipientType.TO, toUser);
                        message.setSubject("Voce foi convidado para participar do " + nomeCongresso.getString("NOME"));
                        message.setText( cvo.getMensagem() );
                        
                        Transport.send(message);
                        
                    } catch (MessagingException e) {
                        
                        throw new RuntimeException(e);
                        
                    }
                }
            }
            
            cx.desconectar();
            
            mensagem = "Email(s) enviado(s) com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
    }
    
}
