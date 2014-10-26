/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.UsuariosVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class UsuariosPers {
    
    public static UsuariosPers instancia;
    
    protected UsuariosPers(){}
    
    public static UsuariosPers getInstancia() {
        if (instancia == null)
            instancia = new UsuariosPers();
        return instancia;
    }
    
    public String editaUsuario (UsuariosVO uvo) {
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE LOGIN SET "
                    + "NOME = '" + uvo.getNome() + "', "
                    + "USUARIO = '" + uvo.getUsuario() + "', "
                    + "SENHA = '" + uvo.getSenha() + "', "
                    + "FUNCAO = '" + uvo.getFuncao() + "' "
                    + "WHERE IDLOGIN = " + uvo.getId());
            
            cx.desconectar();
            
            mensagem = "Usuário editado com sucesso!";
            
        } catch (SQLException e){
        
            mensagem = "ERRO: " + e.getMessage();
        
        }
        
        return mensagem;
    }
    
    public String cadastraUsuario (UsuariosVO uvo) {
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO LOGIN "
                    + "(NOME, USUARIO, SENHA, FUNCAO) "
                    + "VALUES "
                    + "('" + uvo.getNome() + "', "
                    + "'" + uvo.getUsuario() + "', "
                    + "'" + uvo.getSenha() + "', "
                    + "'" + uvo.getFuncao() + "')");
            
            cx.desconectar();
            
            mensagem = "Usuário cadastrado com sucesso!";
            
        } catch (SQLException e){
        
            mensagem = "ERRO: " + e.getMessage();
        
        }
        
        return mensagem;
    }
    
    public String atualizaCampos (UsuariosVO uvo) {
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN WHERE IDLOGIN = " + uvo.getId());

            if (resultado.next()){
                uvo.setNome(resultado.getString("NOME"));
                uvo.setUsuario(resultado.getString("USUARIO"));
                uvo.setSenha(resultado.getString("SENHA"));
                uvo.setFuncao(resultado.getString("FUNCAO"));
            }

            cx.desconectar();
            
        } catch (SQLException e){
        
            mensagem = "ERRO: " + e.getMessage();
        
        }
        
        return mensagem;
    }
    
}
