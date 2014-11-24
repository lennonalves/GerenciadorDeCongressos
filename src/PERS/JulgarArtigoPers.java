/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.JulgarArtigoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class JulgarArtigoPers {
    
    public static JulgarArtigoPers instancia;
    
    protected JulgarArtigoPers(){}
    
    public static JulgarArtigoPers getInstancia() {
        if (instancia == null)
            instancia = new JulgarArtigoPers();
        return instancia;
    }
    
    public String julgarArtigo(JulgarArtigoVO javo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            
            if (javo.getSituacao().equals("Aprovado")){
                query.executeUpdate("UPDATE ARTIGO SET "
                    + "STATUS = " + 4 + ", "
                    + "DATAJULGAMENTOARTIGO = '" + javo.getDataSQL()+ "' "
                    + "WHERE IDARTIGO = " + javo.getId());
            } else {
                query.executeUpdate("UPDATE ARTIGO SET "
                    + "DATAJULGAMENTOARTIGO = '" + javo.getDataSQL() + "' "
                    + "WHERE IDARTIGO = " + javo.getId());
            }
            
            cx.desconectar();
            
            mensagem = "Artigo julgado com sucesso!";
                
            } catch (SQLException e){
                
                    mensagem = "ERRO: "+ e.getMessage();
                    
            }
        
        return mensagem;
        
    }
    
    public String atualizaCampos(JulgarArtigoVO javo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
                Connection con = cx.conectar();
                Statement consulta = con.createStatement();
                ResultSet titulo = consulta.executeQuery("SELECT TITULO FROM ARTIGO WHERE IDARTIGO = " + javo.getId());
                ResultSet parecer = consulta.executeQuery("SELECT PARECER FROM ARTIGO AR "
                        + "JOIN AVALIACAO AV "
                        + "ON AR.IDARTIGO = AV.IDARTIGO "
                        + "WHERE AR.IDARTIGO = " + javo.getId());
                
                if (titulo.next()){
                    
                    javo.setTitulo(titulo.getString("TITULO"));
                    
                    if (parecer.next())
                        javo.setAvaliacao1(parecer.getString("PARECER"));
                    
                    if (parecer.next())
                        javo.setAvaliacao2(parecer.getString("PARECER"));
                    
                    if (parecer.next())
                        javo.setAvaliacao3(parecer.getString("PARECER"));
                    
                }
                
                cx.desconectar();
                
            } catch (SQLException e){
                
                    mensagem = "ERRO: "+ e.getMessage();
                    
            }
        
        return mensagem;
        
    }
    
}
