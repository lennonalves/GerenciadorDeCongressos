/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.PatrocinadoresVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class PatrocinadoresPers {
    
    public static PatrocinadoresPers instancia;
    
    protected PatrocinadoresPers(){}
    
    public static PatrocinadoresPers getInstancia() {
        if (instancia == null)
            instancia = new PatrocinadoresPers();
        return instancia;
    }
    
    public String editarPatrocinador (PatrocinadoresVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE PATROCINADOR SET "
                    + "NOME = '" + pvo.getNome() + "', "
                    + "CNPJ = '" + pvo.getCnpj() + "', "
                    + "ENDERECO = '" + pvo.getEndereco() + "', "
                    + "TELEFONE = '" + pvo.getTelefone() + "', "
                    + "EMAIL = '" + pvo.getEmail() + "', "
                    + "VALORPATROCINIO = '" + pvo.getValor() + "' "
                    + "WHERE IDPATROCINADOR = " + pvo.getId());
            cx.desconectar();
            
            mensagem = "Patrocinador editado com sucesso!";
            
        } catch (SQLException e){
            
            mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
    public String cadastrarPatrocinador (PatrocinadoresVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO PATROCINADOR "
                    + "(NOME, CNPJ, ENDERECO, TELEFONE, EMAIL, VALORPATROCINIO) "
                    + "VALUES "
                    + "('" + pvo.getNome() + "', "
                    + "'" + pvo.getCnpj() + "', "
                    + "'" + pvo.getEndereco() + "', "
                    + "'" + pvo.getTelefone() + "', "
                    + "'" + pvo.getEmail() + "', "
                    + "'" + pvo.getValor() + "')");
            cx.desconectar();
            
            mensagem = "Patrocinador cadastrado com sucesso!";
            
        } catch (SQLException e){
            
            mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
    public String atualizaCampos (PatrocinadoresVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM PATROCINADOR WHERE IDPATROCINADOR = " + pvo.getId());
            
            if (resultado.next()) {
                
                pvo.setNome(resultado.getString("NOME"));
                pvo.setCnpj(resultado.getString("CNPJ"));
                pvo.setEndereco(resultado.getString("ENDERECO"));
                pvo.setTelefone(resultado.getString("TELEFONE"));
                pvo.setEmail(resultado.getString("EMAIL"));
                pvo.setValor(Double.parseDouble(resultado.getString("VALORPATROCINIO")));
                
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
            mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
    }
    
}
