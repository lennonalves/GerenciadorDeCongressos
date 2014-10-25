/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.Conexao;
import TELAS.TelaLogin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author victorambiel
 */
public class ProxyLogin extends TelaLogin {
    
    private String usuario, senha;
    
//    public static TelaLoginProxy instancia;
//
//    protected TelaLoginProxy(){}
    
    public ProxyLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
//    public static TelaLoginProxy getInstancia() {
//        if (instancia == null)
//            instancia = new TelaLoginProxy();
//        return instancia;
//    }
    
    public boolean temPermissaoDeAcesso() {
    	Conexao cx = Conexao.getInstancia();
        
        try {
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN");
            
            while(resultado.next()){
                if (this.getUsuario().equals(resultado.getString("USUARIO")) && this.getSenha().equals(resultado.getString("SENHA"))){
                    return true;
                }
            }
            return false;
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        cx.desconectar();
		return false;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
