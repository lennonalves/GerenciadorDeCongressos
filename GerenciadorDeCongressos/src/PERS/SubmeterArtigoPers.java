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
    
    public String submeteArtigo (SubmeterArtigoVO savo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            Statement consulta = con.createStatement();
            ResultSet autor1 = consulta.executeQuery("SELECT IDPESSOA FROM PESSOA "
                    + "WHERE NOME = '" + savo.getNomeAutor1() + "'");
            ResultSet autor2 = consulta.executeQuery("SELECT IDPESSOA FROM PESSOA "
                    + "WHERE NOME = '" + savo.getNomeAutor2() + "'");
            ResultSet autor3 = consulta.executeQuery("SELECT IDPESSOA FROM PESSOA "
                    + "WHERE NOME = '" + savo.getNomeAutor3() + "'");
            
            if (autor1.next()){
                //int status = 0;
                if (!"".equals(savo.getNomeAutor2())){
                    if (!"".equals(savo.getNomeAutor2())){
                        //autor 1, 2 e 3
                        if (autor2.next()){
                            if (autor3.next()){
                                query.executeUpdate("INSERT INTO ARTIGO "
                                + "(TITULO, TEMA, AREA, AUTOR1, AUTOR2, AUTOR3, DATASUBMISSAO, STATUS) "
                                + "VALUES "
                                + "('" + savo.getTituloArtigo() + "', "
                                + "'" + savo.getTemaArtigo() + "', "
                                + "'" + savo.getAreaArtigo() + "', "
                                + "'" + autor1.getString("IDPESSOA") + "', "
                                + "'" + autor2.getString("IDPESSOA") + "', "
                                + "'" + autor3.getString("IDPESSOA") + "', "
                                + "'" + savo.getDataSQL() + "', "
                                + "" + 0 + ")");
                            }
                        }
                    }
                    else {
                        //autor 1 e 2
                        if (autor2.next()){
                            query.executeUpdate("INSERT INTO ARTIGO "
                            + "(TITULO, TEMA, AREA, AUTOR1, AUTOR2, DATASUBMISSAO, STATUS) "
                            + "VALUES "
                            + "('" + savo.getTituloArtigo() + "', "
                            + "'" + savo.getTemaArtigo() + "', "
                            + "'" + savo.getAreaArtigo() + "', "
                            + "'" + autor1.getString("IDPESSOA") + "', "
                            + "'" + autor2.getString("IDPESSOA") + "', "
                            + "'" + savo.getDataSQL() + "', "
                            + "" + 0 + ")");
                        }
                    }
                } else {
                    //somente autor 1
                    query.executeUpdate("INSERT INTO ARTIGO "
                    + "(TITULO, TEMA, AREA, AUTOR1, DATASUBMISSAO, STATUS) "
                    + "VALUES "
                    + "('" + savo.getTituloArtigo() + "', "
                    + "'" + savo.getTemaArtigo() + "', "
                    + "'" + savo.getAreaArtigo() + "', "
                    + "'" + autor1.getString("IDPESSOA") + "', "
                    + "'" + savo.getDataSQL() + "', "
                    + "" + 0 + ")");
                }
            }
            
            cx.desconectar();
            
            mensagem = "Artigo submetido com sucesso!";
            
        } catch (SQLException e) {
            
            mensagem = "ERRO: " + e.getMessage();
            
        }
        
        return mensagem;
        
    }
    
}
