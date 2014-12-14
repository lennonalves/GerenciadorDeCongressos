/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.BuscaPers;
import VO.BuscaVO;

/**
 *
 * @author lennonalves
 */
public class BuscaRN {
    
    public static BuscaRN instancia;
    
    protected BuscaRN(){}
    
    public static BuscaRN getInstancia() {
        if (instancia == null)
            instancia = new BuscaRN();
        return instancia;
    }
    
    public String fazerBusca (BuscaVO bvo) {
        BuscaPers bpers = BuscaPers.getInstancia();
        String mensagem = bpers.fazerBusca(bvo);
        return mensagem;
    }
    
}
