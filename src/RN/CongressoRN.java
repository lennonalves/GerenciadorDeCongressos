/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.CongressoPers;
import VO.CongressoVO;

/**
 *
 * @author lennonalves
 */
public class CongressoRN {
    
    public static CongressoRN instancia;
    
    protected CongressoRN(){}
    
    public static CongressoRN getInstancia() {
        if (instancia == null)
            instancia = new CongressoRN();
        return instancia;
    }
    
    public String cadastraCongresso (CongressoVO cvo) {
        CongressoPers cpers = CongressoPers.getInstancia();
        String mensagem = cpers.cadastraCongresso(cvo);
        return mensagem;
    }
    
    public String editaCongresso (CongressoVO cvo) {
        CongressoPers cpers = CongressoPers.getInstancia();
        String mensagem = cpers.editaCongresso(cvo);
        return mensagem;
    }
    
    public String atualizaCampos (CongressoVO cvo) {
        CongressoPers cpers = CongressoPers.getInstancia();
        String mensagem = cpers.atualizaCampos(cvo);
        return mensagem;
    }
            
}
