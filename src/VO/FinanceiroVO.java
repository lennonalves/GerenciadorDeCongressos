/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lennonalves
 */
public class FinanceiroVO {
    
    public static FinanceiroVO instancia;
    
    protected FinanceiroVO(){}
    
    public static FinanceiroVO getInstancia() {
        if (instancia == null)
            instancia = new FinanceiroVO();
        return instancia;
    }
    
    public DefaultTableModel dtm = new DefaultTableModel();
    
    private double qtdinscricoes, qtdpatrocinadores,
            qtdentrada, qtdsaida, qtdlucro, valorinscricao, custoItem;
    
    private String descricaoItem;

    /**
     * @return the qtdinscricoes
     */
    public double getQtdinscricoes() {
        return qtdinscricoes;
    }

    /**
     * @param qtdinscricoes the qtdinscricoes to set
     */
    public void setQtdinscricoes(double qtdinscricoes) {
        this.qtdinscricoes = qtdinscricoes;
    }

    /**
     * @return the qtdpatrocinadores
     */
    public double getQtdpatrocinadores() {
        return qtdpatrocinadores;
    }

    /**
     * @param qtdpatrocinadores the qtdpatrocinadores to set
     */
    public void setQtdpatrocinadores(double qtdpatrocinadores) {
        this.qtdpatrocinadores = qtdpatrocinadores;
    }

    /**
     * @return the qtdentrada
     */
    public double getQtdentrada() {
        return qtdentrada;
    }

    /**
     * @param qtdentrada the qtdentrada to set
     */
    public void setQtdentrada(double qtdentrada) {
        this.qtdentrada = qtdentrada;
    }

    /**
     * @return the qtdsaida
     */
    public double getQtdsaida() {
        return qtdsaida;
    }

    /**
     * @param qtdsaida the qtdsaida to set
     */
    public void setQtdsaida(double qtdsaida) {
        this.qtdsaida = qtdsaida;
    }

    /**
     * @return the qtdlucro
     */
    public double getQtdlucro() {
        return qtdlucro;
    }

    /**
     * @param qtdlucro the qtdlucro to set
     */
    public void setQtdlucro(double qtdlucro) {
        this.qtdlucro = qtdlucro;
    }

    /**
     * @return the valorinscricao
     */
    public double getValorinscricao() {
        return valorinscricao;
    }

    /**
     * @param valorinscricao the valorinscricao to set
     */
    public void setValorinscricao(double valorinscricao) {
        this.valorinscricao = valorinscricao;
    }

    /**
     * @return the custoItem
     */
    public double getCustoItem() {
        return custoItem;
    }

    /**
     * @param custoItem the custoItem to set
     */
    public void setCustoItem(double custoItem) {
        this.custoItem = custoItem;
    }

    /**
     * @return the descricaoItem
     */
    public String getDescricaoItem() {
        return descricaoItem;
    }

    /**
     * @param descricaoItem the descricaoItem to set
     */
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    
}
