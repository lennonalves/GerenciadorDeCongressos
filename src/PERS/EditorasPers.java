/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.EditorasVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class EditorasPers {
    
    public static EditorasPers instancia;
    
    protected EditorasPers(){}
    
    public static EditorasPers getInstancia() {
        if (instancia == null)
            instancia = new EditorasPers();
        return instancia;
    }
    
    public String editarEditoras (EditorasVO evo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE EDITORA SET "
                    + "NOME = '" + evo.getNome() + "', "
                    + "CNPJ = '" + evo.getCnpj() + "', "
                    + "ENDERECO = '" + evo.getEndereco() + "', "
                    + "TELEFONE = '" + evo.getTelefone() + "', "
                    + "EMAIL = '" + evo.getEmail() + "' "
                    + "WHERE IDEDITORA = " + evo.getId());
            cx.desconectar();
            
            mensagem = "Editora editada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String cadastrarEditoras (EditorasVO evo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO EDITORA "
                    + "(NOME, CNPJ, ENDERECO, TELEFONE, EMAIL) "
                    + "VALUES "
                    + "('" + evo.getNome() + "', "
                    + "'" + evo.getCnpj() + "', "
                    + "'" + evo.getEndereco() + "', "
                    + "'" + evo.getTelefone() + "', "
                    + "'" + evo.getEmail() + "')");
            cx.desconectar();
            
            mensagem = "Editora cadastrada com sucesso!";
            
        } catch (SQLException e){
            
            mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String atualizaCampos (EditorasVO evo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM EDITORA WHERE IDEDITORA = " + evo.getId());
            if (resultado.next()){
                evo.setNome(resultado.getString("NOME"));
                evo.setCnpj(resultado.getString("CNPJ"));
                evo.setEndereco(resultado.getString("ENDERECO"));
                evo.setTelefone(resultado.getString("TELEFONE"));
                evo.setEmail(resultado.getString("EMAIL"));
            }
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
}
