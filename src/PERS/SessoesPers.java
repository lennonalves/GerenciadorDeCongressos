/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.SessoesVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class SessoesPers {
    
    public static SessoesPers instancia;
    
    protected SessoesPers(){}
    
    public static SessoesPers getInstancia() {
        if (instancia == null)
            instancia = new SessoesPers();
        return instancia;
    }
    
    public String editarSessao (SessoesVO svo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            Statement consulta = con.createStatement();
            ResultSet moderador = consulta.executeQuery("SELECT P.IDPESSOA FROM PESSOA P JOIN SESSAO S "
                    + "ON P.IDPESSOA = S.IDPESSOA WHERE P.NOME = '" + svo.getModerador() + "'");
            
            if (moderador.next()){
                query.executeUpdate("UPDATE SESSAO SET "
                    + "IDPESSOA = '" + moderador.getString("IDPESSOA") + "', "
                    + "AREA = '" + svo.getArea() + "', "
                    + "HORARIO = '" + svo.getHorario() + "' "
                    + "WHERE IDSESSAO = " + svo.getId());
            }
            
            cx.desconectar();
            
            mensagem = "Sessao editada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String cadastrarSessao (SessoesVO svo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            Statement consulta = con.createStatement();
            ResultSet moderador = consulta.executeQuery("SELECT IDPESSOA FROM PESSOA "
                    + "WHERE NOME = '" + svo.getModerador() + "'");
            
            if (moderador.next()){
                query.executeUpdate("INSERT INTO SESSAO "
                    + "(IDPESSOA, AREA, HORARIO) "
                    + "VALUES "
                    + "(" + moderador.getString("IDPESSOA") + ", "
                    + "'" + svo.getArea() + "', "
                    + "'" + svo.getHorario() + "')");
            }
            
            cx.desconectar();
            
            mensagem = "Sessao cadastrada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String atualizaCampos (SessoesVO svo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM SESSAO WHERE IDSESSAO = " + svo.getId());
            ResultSet moderador = consulta.executeQuery("SELECT NOME FROM PESSOA P JOIN SESSAO S "
                    + "ON P.IDPESSOA = S.IDPESSOA WHERE IDSESSAO = " + svo.getId());

            if (resultado.next()){
                if (moderador.next()){
                    svo.setModerador(moderador.getString("NOME"));
                    svo.setArea(resultado.getString("AREA"));
                    svo.setHorario(resultado.getString("HORARIO"));
                }
            }

            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String atualizaModerador (SessoesVO svo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet moderador = consulta.executeQuery("SELECT NOME FROM PESSOA P JOIN SESSAO S "
                    + "ON P.IDPESSOA = S.IDPESSOA WHERE IDSESSAO = " + svo.getId());
            
            if (moderador.next()){
                
                    svo.setModerador(moderador.getString("NOME"));
                    
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
}
