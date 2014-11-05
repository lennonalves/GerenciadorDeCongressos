/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat.Pers;

import ServidorDeChat.VO.ClientesVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class ClientesPers {
    
    public static ClientesPers instancia;
    
    protected ClientesPers(){}
    
    public static ClientesPers getInstancia() {
        if (instancia == null)
            instancia = new ClientesPers();
        return instancia;
    }
    
    public String adicionaCliente (ClientesVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO CLIENTES "
                    + "(CLI_NOME, CLI_IP, CLI_PORTA) "
                    + "VALUES "
                    + "('" + cvo.getHostName()+ "', "
                    + "'" + cvo.getHostAddress()+ "', "
                    + "'" + cvo.getHostPort()+ "')");
            
            cx.desconectar();
            
            mensagem = cvo.getHostId() + cvo.getHostName();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
    public String removeCliente (ClientesVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            System.out.println(cvo.getHostName());
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("DELETE FROM CLIENTES WHERE CLI_IP = '" + cvo.getHostAddress()+ "'");
            cx.desconectar();
            
            mensagem = cvo.getHostId();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
    public String atualizaClientes (ClientesVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM CLIENTES ORDER BY CLI_NOME");
            
            while (resultado.next()){
                
                cvo.dtm.addRow(new Object[] {resultado.getString("CLI_IP"), resultado.getString("CLI_PORTA"), resultado.getString("CLI_NOME")});
            
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
            return mensagem = "ERRO: " + e.getMessage();
            
        }
        
        return mensagem;
    }
    
    public void zerarClientes (ClientesVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        
        try {
            
            System.out.println(cvo.getHostName());
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("DELETE FROM CLIENTES WHERE CLI_IP IS NOT NULL");
            cx.desconectar();
            
        } catch (SQLException e){
            
                System.out.println("ERRO: " + e.getMessage());
                
        }
    }
    
    public String listarClientes (ClientesVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        mensagem = "2";
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM CLIENTES");
            
            while (resultado.next()){
                
                mensagem = mensagem + "#" + resultado.getString("CLI_IP") + "#" + resultado.getString("CLI_PORTA") + "#" + resultado.getString("CLI_NOME");
            
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
            mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
}
