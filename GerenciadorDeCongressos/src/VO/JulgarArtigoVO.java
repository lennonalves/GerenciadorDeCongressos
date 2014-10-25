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
public class JulgarArtigoVO {
    
    public static JulgarArtigoVO instancia;
    
    protected JulgarArtigoVO(){}
    
    public static JulgarArtigoVO getInstancia() {
        if (instancia == null)
            instancia = new JulgarArtigoVO();
        return instancia;
    }
    
    private int id = 0;
    
    private String titulo, avaliacao1, avaliacao2, avaliacao3, situacao;
    
    private Date data = new Date();
    private java.sql.Date dataSQL = new java.sql.Date(data.getTime());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(String avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public String getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(String avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public String getAvaliacao3() {
        return avaliacao3;
    }

    public void setAvaliacao3(String avaliacao3) {
        this.avaliacao3 = avaliacao3;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

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
}
