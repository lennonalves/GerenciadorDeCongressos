/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import VO.AvaliadorVO;
import java.util.Date;

/**
 *
 * @author lennonalves
 */
public class AvaliadorPers {
    
    public static AvaliadorPers instancia;
    
    protected AvaliadorPers(){}
    
    public static AvaliadorPers getInstancia() {
        if (instancia == null)
            instancia = new AvaliadorPers();
        return instancia;
    }
    
    Date data = new Date();
    java.sql.Date dataSQL = new java.sql.Date(data.getTime());
    
    public String avaliaArtigo (AvaliadorVO avo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            
            Statement consulta = con.createStatement();
            ResultSet idArtigo = consulta.executeQuery("SELECT * FROM ARTIGO WHERE TITULO = '" + avo.getTituloArtigo() + "'");
            ResultSet idAvaliador = consulta.executeQuery("SELECT * FROM PESSOA WHERE NOME = '" + avo.getNomeAvaliador() + "'");
            
            if (idArtigo.next()){
                if (idAvaliador.next()){
                    query.executeUpdate("INSERT INTO AVALIACAO "
                    + "(IDARTIGO, PARECER, DATAENTREGA, IDPESSOA) "
                    + "VALUES "
                    + "(" + idArtigo.getString("IDARTIGO") + ", "
                    + "'" + avo.getAvaliacaoArtigo() + "', "
                    + "'" + dataSQL + "', "
                    + "'" + idAvaliador.getString("IDPESSOA") + "')");
                    
                    int statusArtigo = (int) (Integer.valueOf(idArtigo.getString("STATUS")));
                    
                    query.executeUpdate("UPDATE ARTIGO SET "
                    + "STATUS = " + (statusArtigo + 1) + " "
                    + "WHERE IDARTIGO = " + idArtigo.getString("IDARTIGO"));
                }
            }
            
            if (!avo.getTituloArtigo().equals("Nenhum artigo na fila.")) {
                mensagem = "Dados cadastrados com sucesso!";
            }
                        
            cx.desconectar();
            
        } catch (SQLException e){
            mensagem = "ERRO: " + e.getMessage();
        }
        return mensagem;
    }
    
    public String atualizarCampos(AvaliadorVO avo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet login = consulta.executeQuery("SELECT * FROM LOGIN WHERE IDLOGIN = " + avo.getIdAvaliador());
            
            ResultSet buscarArtigos = consulta.executeQuery("SELECT * "
                    + "FROM ARTIGO "
                    + "WHERE STATUS >= 0 "
                    + "AND STATUS <= 2 "
                    + "AND DATAJULGAMENTOARTIGO IS NULL");

            if (login.next()){
                avo.setNomeAvaliador(login.getString("NOME"));
            }
            
            while (buscarArtigos.next()){
                int statusArtigo = (int) (Integer.valueOf(buscarArtigos.getString("STATUS")));
                if (statusArtigo == 1 || statusArtigo == 2){
                    //1 parecer          //2 pareceres
                    ResultSet idAvaliador = consulta.executeQuery("SELECT * FROM PESSOA WHERE NOME = '" + avo.getNomeAvaliador() + "'");
                    
                    if (idAvaliador.next()){
                        ResultSet artigoCruzado = consulta.executeQuery("SELECT TITULO "
                                + "FROM ARTIGO "
                                + "WHERE STATUS >= 0 "
                                + "AND STATUS <= 2 "
                                + "AND DATAJULGAMENTOARTIGO IS NULL "
                                + "AND IDARTIGO <> ALL "
                                + "(SELECT AR.IDARTIGO "
                                + "FROM ARTIGO AR "
                                + "JOIN AVALIACAO AV "
                                + "ON AR.IDARTIGO = AV.IDARTIGO "
                                + "WHERE AV.IDPESSOA = " + idAvaliador.getString("IDPESSOA") + ")"); 
                    
                        if (artigoCruzado.next())
                            avo.setTituloArtigo(artigoCruzado.getString("TITULO"));
                        else
                            avo.setTituloArtigo("Nenhum artigo na fila.");
                    }
                } else {
                    //0 parecer
                    avo.setTituloArtigo(buscarArtigos.getString("TITULO"));
                }                
            }
            cx.desconectar();
        } catch (SQLException e){
                mensagem = "ERRO: "+ e.getMessage();
        }
        return mensagem;
    }
}
