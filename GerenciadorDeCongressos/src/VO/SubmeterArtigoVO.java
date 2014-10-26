/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VO;

import java.util.Date;

/**
 *
 * @author lennon
 */
public class SubmeterArtigoVO {
    
    public static SubmeterArtigoVO instancia;
    
    protected SubmeterArtigoVO(){}
    
    public static SubmeterArtigoVO getInstancia() {
        if (instancia == null)
            instancia = new SubmeterArtigoVO();
        return instancia;
    }
    
    private int id, nautor;
    private String tituloArtigo, temaArtigo, areaArtigo, nomeAutor1, nomeAutor2, nomeAutor3;
    
    private Date data = new Date();
    private java.sql.Date dataSQL = new java.sql.Date(data.getTime());

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public java.sql.Date getDataSQL() {
        return dataSQL;
    }

    public void setDataSQL(java.sql.Date dataSQL) {
        this.dataSQL = dataSQL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNautor() {
        return nautor;
    }

    public void setNautor(int nautor) {
        this.nautor = nautor;
    }

    public String getTituloArtigo() {
        return tituloArtigo;
    }

    public void setTituloArtigo(String tituloArtigo) {
        this.tituloArtigo = tituloArtigo;
    }

    public String getTemaArtigo() {
        return temaArtigo;
    }

    public void setTemaArtigo(String temaArtigo) {
        this.temaArtigo = temaArtigo;
    }

    public String getNomeAutor1() {
        return nomeAutor1;
    }

    public void setNomeAutor1(String nomeAutor1) {
        this.nomeAutor1 = nomeAutor1;
    }

    public String getNomeAutor2() {
        return nomeAutor2;
    }

    public void setNomeAutor2(String nomeAutor2) {
        this.nomeAutor2 = nomeAutor2;
    }

    public String getNomeAutor3() {
        return nomeAutor3;
    }

    public void setNomeAutor3(String nomeAutor3) {
        this.nomeAutor3 = nomeAutor3;
    }

    public String getAreaArtigo() {
        return areaArtigo;
    }

    public void setAreaArtigo(String areaArtigo) {
        this.areaArtigo = areaArtigo;
    }

}
