/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;
import TELAS.TelaMenu;

/**
 *
 * @author victorambiel
 */
public class ProxyMenu extends TelaMenu {
    
    public static ProxyMenu instancia;
    
    protected ProxyMenu(){}
    
    public static ProxyMenu getInstancia() {
        if (instancia == null)
            instancia = new ProxyMenu();
        return instancia;
    }
    
    public void qualPermissao(String permissao){
        
        if(permissao.equals("Comite de Programa")){
            super.setBtnArtigos(true);
            super.setBtnCongressos(true);
            super.setBtnEditoras(true);
            super.setBtnPessoas(true);
            super.setBtnArtigos(true);
            super.setBtnJulgar(true);
            super.setBtnSessoes(true);
            super.setBtnPatrocinadores(false);
            super.setBtnPublicacoes(true);
            super.setBtnFinanceiro(false);
            super.setBtnConvites(false);
            super.setBtnUser(false);
            super.setBtnSair(true);
        } 
        
        else if (permissao.equals("Comite Organizador")){
            super.setBtnArtigos(false);
            super.setBtnCongressos(false);
            super.setBtnEditoras(false);
            super.setBtnPessoas(true);
            super.setBtnArtigos(true);
            super.setBtnJulgar(false);
            super.setBtnSessoes(false);
            super.setBtnPatrocinadores(true);
            super.setBtnPublicacoes(false);
            super.setBtnFinanceiro(true);
            super.setBtnConvites(true);
            super.setBtnUser(false);
            super.setBtnSair(true);
        
        } else if (permissao.equals("admin")){
            super.setBtnArtigos(true);
            super.setBtnCongressos(true);
            super.setBtnEditoras(true);
            super.setBtnPessoas(true);
            super.setBtnArtigos(true);
            super.setBtnJulgar(true);
            super.setBtnSessoes(true);
            super.setBtnPatrocinadores(false);
            super.setBtnPublicacoes(true);
            super.setBtnFinanceiro(false);
            super.setBtnConvites(false);
            super.setBtnUser(false);
            super.setBtnSair(true);
        }
    }
}
