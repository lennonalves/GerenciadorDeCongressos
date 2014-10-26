/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.SubmeterArtigoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class SubmeterArtigoPers {
    
    public static SubmeterArtigoPers instancia;
    
    protected SubmeterArtigoPers(){}
    
    public static SubmeterArtigoPers getInstancia() {
        if (instancia == null)
            instancia = new SubmeterArtigoPers();
        return instancia;
    }
    
    public String atualizaCampos (SubmeterArtigoVO savo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM PESSOA WHERE IDPESSOA = " + savo.getId());

            if (savo.getNautor() == 1) {
                if (resultado.next()) {
                    savo.setNomeAutor1(resultado.getString("NOME"));
                }
            }
            if (savo.getNautor() == 2) {
                if (resultado.next()) {
                    savo.setNomeAutor2(resultado.getString("NOME"));
                }
            }
            if (savo.getNautor() == 3) {
                if (resultado.next()) {
                    savo.setNomeAutor3(resultado.getString("NOME"));
                }
            }

            cx.desconectar();
            
        } catch (SQLException e) {
            
            mensagem = "ERRO: " + e.getMessage();
            
        }
        
        return mensagem;
        
    }
    
}
