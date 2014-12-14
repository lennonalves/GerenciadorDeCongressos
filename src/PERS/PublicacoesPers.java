/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.PublicacoesVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class PublicacoesPers {
    
    public static PublicacoesPers instancia;
    
    protected PublicacoesPers(){}
    
    public static PublicacoesPers getInstancia() {
        if (instancia == null)
            instancia = new PublicacoesPers();
        return instancia;
    }
    
    public String atualizaTitulo (PublicacoesVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM ARTIGO WHERE IDARTIGO = " + pvo.getId());
            
            if (resultado.next()){
                
                pvo.setTitulo(resultado.getString("TITULO"));
                
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String atualizaEditora (PublicacoesVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM EDITORA WHERE IDEDITORA = " + pvo.getId());
            
            if (resultado.next()){
                
                pvo.setEditora(resultado.getString("NOME"));
                
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String publicar (PublicacoesVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            Statement consulta = con.createStatement();
            ResultSet tituloartigo = consulta.executeQuery("SELECT IDARTIGO FROM ARTIGO "
                    + "WHERE TITULO = '" + pvo.getTitulo() + "'");
            ResultSet editora = consulta.executeQuery("SELECT IDEDITORA FROM EDITORA "
                    + "WHERE NOME = '" + pvo.getEditora() + "'");
            
            if (tituloartigo.next()){
                if (editora.next()){
                    query.executeUpdate("INSERT INTO PUBLICACOES "
                    + "(TITULOARTIGO, EDITORA) "
                    + "VALUES "
                    + "(" + tituloartigo.getString("IDARTIGO") + ", "
                    + "'" + editora.getString("IDEDITORA") + "')");
                }
            }
            
            cx.desconectar();
            
            mensagem = "Publicacao cadastrada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
}
