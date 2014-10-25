/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.BuscaVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class BuscaPers {
    
    public static BuscaPers instancia;
    
    protected BuscaPers(){}
    
    public static BuscaPers getInstancia() {
        if (instancia == null)
            instancia = new BuscaPers();
        return instancia;
    }
    
    public String fazerBusca (BuscaVO bvo) {
        
        bvo.dtm.setNumRows(0);
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        if (bvo.getDefinirTela() == 1){
            //CONGRESSOS
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM CONGRESSO ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDCONGRESSO"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 2){
            //EDITORAS
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM EDITORA ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDEDITORA"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 3){
            //PESSOAS
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM PESSOA ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDPESSOA"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 4){
            //PATROCINADORES
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM PATROCINADOR ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDPATROCINADOR"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 5){
            //LOGIN
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN WHERE FUNCAO <> 'admin' ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDLOGIN"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 6){
            //AUTORES
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM PESSOA WHERE FUNCAO = 'Autor' ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDPESSOA"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 7){
            //SESSAO
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM SESSAO ORDER BY AREA");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDSESSAO"), resultado.getString("AREA")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 8){
            //MODERADOR
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM PESSOA WHERE FUNCAO = 'Moderador' ORDER BY NOME");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDPESSOA"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 9){
            //ARTIGOS
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM ARTIGO WHERE STATUS = 4 ORDER BY TITULO");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDARTIGO"), resultado.getString("TITULO")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 10){
            //EDITORAS
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM EDITORA");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDEDITORA"), resultado.getString("NOME")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        if (bvo.getDefinirTela() == 11){
            //ARTIGOS //JULGAR
            try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM ARTIGO WHERE STATUS = 3 AND DATAJULGAMENTOARTIGO IS NULL");
                while (resultado.next()){
                    bvo.dtm.addRow(new Object[] {resultado.getString("IDARTIGO"), resultado.getString("TITULO")});
                }
                cx.desconectar();
            } catch (SQLException e){
                return mensagem = "ERRO: " + e.getMessage();
            }
        }
        return mensagem;
    }
}
