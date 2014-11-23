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
public class BuscaVO {
    
    public static BuscaVO instancia;
    
    protected BuscaVO(){}
    
    public static BuscaVO getInstancia() {
        if (instancia == null)
            instancia = new BuscaVO();
        return instancia;
    }
    
    private int definirTela = 0, linha, nautor;
    
    public DefaultTableModel dtm = new DefaultTableModel();

    /**
     * @return the definirTela
     */
    public int getDefinirTela() {
        return definirTela;
    }

    /**
     * @param definirTela the definirTela to set
     */
    public void setDefinirTela(int definirTela) {
        this.definirTela = definirTela;
    }

    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return the nautor
     */
    public int getNautor() {
        return nautor;
    }

    /**
     * @param nautor the nautor to set
     */
    public void setNautor(int nautor) {
        this.nautor = nautor;
    }

    /**
     * @return the dtm
     */
    public DefaultTableModel getDtm() {
        return dtm;
    }

    /**
     * @param dtm the dtm to set
     */
    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }
    
}