/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.PessoasVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennonalves
 */
public class PessoasPers {
    
    public static PessoasPers instancia;
    
    protected PessoasPers(){}
    
    public static PessoasPers getInstancia() {
        if (instancia == null)
            instancia = new PessoasPers();
        return instancia;
    }
    
    public String editaPessoas (PessoasVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE PESSOA SET "
                    + "NOME = '" + pvo.getNome() + "', "
                    + "ENDERECO = '" + pvo.getEndereco() + "', "
                    + "TELEFONE = '" + pvo.getTelefone() + "', "
                    + "EMAIL = '" + pvo.getEmail() + "', "
                    + "FUNCAO = '" + pvo.getFuncao() + "', "
                    + "INSTITUICAO = '" + pvo.getInstituicao() + "', "
                    + "AREA1 = '" + pvo.getArea1() + "', "
                    + "AREA2 = '" + pvo.getArea2() + "', "
                    + "AREA3 = '" + pvo.getArea3() + "' "
                    + "WHERE IDPESSOA = " + pvo.getId());
            cx.desconectar();
            
            mensagem = "Pessoa editada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String cadastraPessoas (PessoasVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO PESSOA "
                    + "(NOME, ENDERECO, TELEFONE, EMAIL, FUNCAO, INSTITUICAO,"
                    + "AREA1, AREA2, AREA3) "
                    + "VALUES "
                    + "('" + pvo.getNome() + "', "
                    + "'" + pvo.getEndereco() + "', "
                    + "'" + pvo.getTelefone() + "', "
                    + "'" + pvo.getEmail() + "', "
                    + "'" + pvo.getFuncao() + "', "
                    + "'" + pvo.getInstituicao() + "', "
                    + "'" + pvo.getArea1() + "', "
                    + "'" + pvo.getArea2() + "', "
                    + "'" + pvo.getArea3() + "')");
            cx.desconectar();
            
            mensagem = "Pessoa cadastrada com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String atualizaCampos (PessoasVO pvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM PESSOA WHERE IDPESSOA = " + pvo.getId());
            if (resultado.next()){
                pvo.setNome(resultado.getString("NOME"));
                pvo.setEndereco(resultado.getString("ENDERECO"));
                pvo.setTelefone(resultado.getString("TELEFONE"));
                pvo.setEmail(resultado.getString("EMAIL"));
                pvo.setFuncao(resultado.getString("FUNCAO"));
                pvo.setInstituicao(resultado.getString("INSTITUICAO"));
                pvo.setArea1(resultado.getString("AREA1"));
                pvo.setArea2(resultado.getString("AREA2"));
                pvo.setArea3(resultado.getString("AREA3"));
            }
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
}
