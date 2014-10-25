/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class ProxyAcesso {
	
	private String usuario, senha;
	 
    public ProxyAcesso(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public boolean temPermissaoDeAcesso() {
    	Conexao cx = Conexao.getInstancia();
        
        try {
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN");
            while (resultado.next()){
                if (this.usuario.equals(resultado.getString("USUARIO")) && this.senha.equals(resultado.getString("SENHA"))){
                    return true;
                } else {
                    return false;
                }
            }
            cx.desconectar();
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
		return false;
    }
}