/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author lennonalves
 */
public class AvaliadorVO {
    
    public static AvaliadorVO instancia;
    
    protected AvaliadorVO(){}
    
    public static AvaliadorVO getInstancia() {
        if (instancia == null)
            instancia = new AvaliadorVO();
        return instancia;
    }
    
    private String nomeAvaliador, tituloArtigo, avaliacaoArtigo;
    private int idAvaliador;

    /**
     * @return the nomeAvaliador
     */
    public String getNomeAvaliador() {
        return nomeAvaliador;
    }

    /**
     * @param nomeAvaliador the nomeAvaliador to set
     */
    public void setNomeAvaliador(String nomeAvaliador) {
        this.nomeAvaliador = nomeAvaliador;
    }

    /**
     * @return the tituloArtigo
     */
    public String getTituloArtigo() {
        return tituloArtigo;
    }

    /**
     * @param tituloArtigo the tituloArtigo to set
     */
    public void setTituloArtigo(String tituloArtigo) {
        this.tituloArtigo = tituloArtigo;
    }

    /**
     * @return the avaliacaoArtigo
     */
    public String getAvaliacaoArtigo() {
        return avaliacaoArtigo;
    }

    /**
     * @param avaliacaoArtigo the avaliacaoArtigo to set
     */
    public void setAvaliacaoArtigo(String avaliacaoArtigo) {
        this.avaliacaoArtigo = avaliacaoArtigo;
    }

    /**
     * @return the idAvaliador
     */
    public int getIdAvaliador() {
        return idAvaliador;
    }

    /**
     * @param idAvaliador the idAvaliador to set
     */
    public void setIdAvaliador(int idAvaliador) {
        this.idAvaliador = idAvaliador;
    }
}
