/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.CongressoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class CongressoPers {
    
    public static CongressoPers instancia;
    
    protected CongressoPers(){}
    
    public static CongressoPers getInstancia() {
        if (instancia == null)
            instancia = new CongressoPers();
        return instancia;
    }
    
    public String cadastraCongresso (CongressoVO cvo) {
        
        String mensagem = null;
        Conexao cx = Conexao.getInstancia();
        
        try {
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO CONGRESSO "
                    + "(NOME, CNPJ, TEMA, EDICAO, AREA, NUMPARTICIPANTES, ENDERECO, DATAPRAZOINSCRICAO, "
                    + "DATAPRAZOSUBARTIGO, DATAPRAZOAVALIACAO, VALORINSCRICAO, DATAREALIZACAO, DATATERMINO) "
                    + "VALUES "
                    + "('" + cvo.getNome() + "', "
                    + "'" + cvo.getCnpj() + "', "
                    + "'" + cvo.getTema() + "', "
                    + "'" + cvo.getEdicao() + "', "
                    + "'" + cvo.getArea() + "', "
                    + cvo.getNparticipantes() + ", "
                    + "'" + cvo.getEndereco() + "', "
                    + "'" + cvo.getPrazoinscricao() + "', "
                    + "'" + cvo.getPrazosubmissao() + "', "
                    + "'" + cvo.getPrazoavaliacao() + "', "
                    + "'" + cvo.getValorinscricao() + "', "
                    + "'" + cvo.getIniciocongresso() + "', "
                    + "'" + cvo.getFimcongresso() + "')");
            cx.desconectar();
            
            mensagem = "Congresso cadastrado com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    
    public String editaCongresso (CongressoVO cvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("UPDATE CONGRESSO SET "
                    + "NOME = '" + cvo.getNome() + "', "
                    + "CNPJ = '" + cvo.getCnpj() + "', "
                    + "TEMA = '" + cvo.getTema() + "', "
                    + "EDICAO = '" + cvo.getEdicao() + "', "
                    + "AREA = '" + cvo.getArea() + "', "
                    + "NUMPARTICIPANTES = '" + cvo.getNparticipantes() + "', "
                    + "ENDERECO = '" + cvo.getEndereco() + "', "
                    + "DATAPRAZOINSCRICAO = '" + cvo.getPrazoinscricao() + "', "
                    + "DATAPRAZOSUBARTIGO = '" + cvo.getPrazosubmissao() + "', "
                    + "DATAPRAZOAVALIACAO = '" + cvo.getPrazoavaliacao() + "', "
                    + "VALORINSCRICAO = '" + cvo.getValorinscricao() + "', "
                    + "DATAREALIZACAO = '" + cvo.getIniciocongresso() + "', "
                    + "DATATERMINO = '" + cvo.getFimcongresso() + "' "
                    + "WHERE IDCONGRESSO = " + cvo.getId());
            cx.desconectar();
            
            mensagem = "Congresso editado com sucesso!";
            
        } catch (SQLException e){
        
            mensagem = "ERRO: " + e.getMessage();
        
        }
        
        return mensagem;
        
    }
    
    public String atualizaCampos (CongressoVO cvo) {
        
        String mensagem = null;
        Conexao cx = Conexao.getInstancia();
        
        try {
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet resultado = consulta.executeQuery("SELECT * FROM CONGRESSO WHERE IDCONGRESSO = " + cvo.getId());
                if (resultado.next()){
                    cvo.setNome(resultado.getString("NOME"));
                    cvo.setCnpj(resultado.getString("CNPJ"));
                    cvo.setTema(resultado.getString("TEMA"));
                    cvo.setEdicao(resultado.getString("EDICAO"));
                    cvo.setArea(resultado.getString("AREA"));
                    cvo.setNparticipantes(Integer.parseInt(resultado.getString("NUMPARTICIPANTES")));
                    cvo.setEndereco(resultado.getString("ENDERECO"));
                    cvo.setPrazoinscricao(resultado.getString("DATAPRAZOINSCRICAO"));
                    cvo.setPrazosubmissao(resultado.getString("DATAPRAZOSUBARTIGO"));
                    cvo.setPrazoavaliacao(resultado.getString("DATAPRAZOAVALIACAO"));
                    cvo.setPrazoinscricao(resultado.getString("VALORINSCRICAO"));
                    cvo.setIniciocongresso(resultado.getString("DATAREALIZACAO"));
                    cvo.setFimcongresso(resultado.getString("DATATERMINO"));
                }
                cx.desconectar();
                
            } catch (SQLException e){
                
                    mensagem = "ERRO: "+ e.getMessage();
                    
            }
        
        return mensagem;
        
    }
    
}
