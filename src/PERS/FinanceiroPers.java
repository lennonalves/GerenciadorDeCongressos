/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import VO.FinanceiroVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class FinanceiroPers {
    
    public static FinanceiroPers instancia;
    
    protected FinanceiroPers(){}
    
    public static FinanceiroPers getInstancia() {
        if (instancia == null)
            instancia = new FinanceiroPers();
        return instancia;
    }
    
    public String atualizaCampos (FinanceiroVO fvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            
            ResultSet qtdinscricao = consulta.executeQuery("SELECT COUNT(*) AS QTD_INSCRICAO FROM PESSOA WHERE FUNCAO = 'Participante'");
            ResultSet valorpatro = consulta.executeQuery("SELECT SUM(VALORPATROCINIO) AS VALOR_TOTAL FROM PATROCINADOR");
            ResultSet valorcongresso = consulta.executeQuery("SELECT VALORINSCRICAO FROM CONGRESSO WHERE IDCONGRESSO = 1");
            ResultSet gastototal = consulta.executeQuery("SELECT SUM(VALOR) AS GASTO_TOTAL FROM GASTOS");
            
            if (qtdinscricao.next() && valorpatro.next() && valorcongresso.next() && gastototal.next()){
                
                fvo.setQtdinscricoes(Double.valueOf(qtdinscricao.getString("QTD_INSCRICAO")));
                fvo.setQtdpatrocinadores(Double.valueOf(valorpatro.getString("VALOR_TOTAL")));
                fvo.setValorinscricao(Double.valueOf(valorcongresso.getString("VALORINSCRICAO")));
                
//                double qtdinscricoes = (double) (Double.valueOf(lblQtdInscricoes.getText()));
//                double valorinscricao = (double) (Double.valueOf(valorcongresso.getString("VALORINSCRICAO")));
//                lblQtdEntrada.setText(Double.toString(qtdinscricoes * valorinscricao));
                
                fvo.setQtdentrada(fvo.getQtdinscricoes() * fvo.getValorinscricao());
                fvo.setQtdsaida(Double.valueOf(gastototal.getString("GASTO_TOTAL")));
                
//                lblQtdSaida.setText(gastototal.getString("GASTO_TOTAL"));
                
//                double entrada = (double) (Double.valueOf(lblQtdEntrada.getText()));
//                double saida = (double) (Double.valueOf(lblQtdSaida.getText()));
//                lblQtdLucro.setText(Double.toString(entrada - saida));
                
                fvo.setQtdlucro(fvo.getQtdentrada() - fvo.getQtdsaida());
            }  
            
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: " + e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String buscarGastos (FinanceiroVO fvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM GASTOS");
            while (resultado.next()){
                fvo.dtm.addRow(new Object[] {resultado.getString("DESCRICAO"), resultado.getInt("VALOR")});
            }
            
            cx.desconectar();
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
    public String cadastrarFinanca (FinanceiroVO fvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;
        
        try {
            
            Connection con = cx.conectar();
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO GASTOS "
                    + "(DESCRICAO, VALOR) "
                    + "VALUES "
                    + "('" + fvo.getDescricaoItem() + "', "
                    + "'" + fvo.getCustoItem() + "')");
            
            cx.desconectar();
            
            mensagem = "Dados cadastrados com sucesso!";
            
        } catch (SQLException e){
            
                mensagem = "ERRO: "+ e.getMessage();
                
        }
        
        return mensagem;
        
    }
    
}
