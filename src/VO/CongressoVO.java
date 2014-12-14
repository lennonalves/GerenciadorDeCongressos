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
public class CongressoVO {
    
    public static CongressoVO instancia;
    
    protected CongressoVO(){}
    
    public static CongressoVO getInstancia() {
        if (instancia == null)
            instancia = new CongressoVO();
        return instancia;
    }
    
    private String nome, cnpj, tema, edicao, area, endereco, 
            prazoinscricao, valorinscricao, prazosubmissao, iniciocongresso, prazoavaliacao, fimcongresso; 
    private int id = 0, nparticipantes;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the edicao
     */
    public String getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the prazoinscricao
     */
    public String getPrazoinscricao() {
        return prazoinscricao;
    }

    /**
     * @param prazoinscricao the prazoinscricao to set
     */
    public void setPrazoinscricao(String prazoinscricao) {
        this.prazoinscricao = prazoinscricao;
    }

    /**
     * @return the valorinscricao
     */
    public String getValorinscricao() {
        return valorinscricao;
    }

    /**
     * @param valorinscricao the valorinscricao to set
     */
    public void setValorinscricao(String valorinscricao) {
        this.valorinscricao = valorinscricao;
    }

    /**
     * @return the prazosubmissao
     */
    public String getPrazosubmissao() {
        return prazosubmissao;
    }

    /**
     * @param prazosubmissao the prazosubmissao to set
     */
    public void setPrazosubmissao(String prazosubmissao) {
        this.prazosubmissao = prazosubmissao;
    }

    /**
     * @return the iniciocongresso
     */
    public String getIniciocongresso() {
        return iniciocongresso;
    }

    /**
     * @param iniciocongresso the iniciocongresso to set
     */
    public void setIniciocongresso(String iniciocongresso) {
        this.iniciocongresso = iniciocongresso;
    }

    /**
     * @return the prazoavaliacao
     */
    public String getPrazoavaliacao() {
        return prazoavaliacao;
    }

    /**
     * @param prazoavaliacao the prazoavaliacao to set
     */
    public void setPrazoavaliacao(String prazoavaliacao) {
        this.prazoavaliacao = prazoavaliacao;
    }

    /**
     * @return the fimcongresso
     */
    public String getFimcongresso() {
        return fimcongresso;
    }

    /**
     * @param fimcongresso the fimcongresso to set
     */
    public void setFimcongresso(String fimcongresso) {
        this.fimcongresso = fimcongresso;
    }

    /**
     * @return the nparticipantes
     */
    public int getNparticipantes() {
        return nparticipantes;
    }

    /**
     * @param nparticipantes the nparticipantes to set
     */
    public void setNparticipantes(int nparticipantes) {
        this.nparticipantes = nparticipantes;
    }
    
}
