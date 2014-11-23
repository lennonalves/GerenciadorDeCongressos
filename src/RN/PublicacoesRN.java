/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.PublicacoesPers;
import VO.PublicacoesVO;

/**
 *
 * @author lennonalves
 */
public class PublicacoesRN {
    
    public static PublicacoesRN instancia;
    
    protected PublicacoesRN(){}
    
    public static PublicacoesRN getInstancia() {
        if (instancia == null)
            instancia = new PublicacoesRN();
        return instancia;
    }
    
    public String atualizaTitulo (PublicacoesVO pvo) {
        PublicacoesPers ppers = PublicacoesPers.getInstancia();
        String mensagem = ppers.atualizaTitulo(pvo);
        return mensagem;
    }
    
    public String atualizaEditora (PublicacoesVO pvo) {
        PublicacoesPers ppers = PublicacoesPers.getInstancia();
        String mensagem = ppers.atualizaEditora(pvo);
        return mensagem;
    }
    
    public String publicar (PublicacoesVO pvo) {
        PublicacoesPers ppers = PublicacoesPers.getInstancia();
        String mensagem = ppers.publicar(pvo);
        return mensagem;
    }
    
}
