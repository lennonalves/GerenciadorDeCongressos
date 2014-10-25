/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.FinanceiroPers;
import VO.FinanceiroVO;

/**
 *
 * @author lennonalves
 */
public class FinanceiroRN {
    
    public static FinanceiroRN instancia;
    
    protected FinanceiroRN(){}
    
    public static FinanceiroRN getInstancia() {
        if (instancia == null)
            instancia = new FinanceiroRN();
        return instancia;
    }
    
    public String atualizaCampos (FinanceiroVO fvo) {
        FinanceiroPers fpers = FinanceiroPers.getInstancia();
        String mensagem = fpers.atualizaCampos(fvo);
        return mensagem;
    }
    
    public String buscarGastos (FinanceiroVO fvo) {
        FinanceiroPers fpers = FinanceiroPers.getInstancia();
        String mensagem = fpers.buscarGastos(fvo);
        return mensagem;
    }
    
    public String cadastrarFinanca (FinanceiroVO fvo) {
        FinanceiroPers fpers = FinanceiroPers.getInstancia();
        String mensagem = fpers.cadastrarFinanca(fvo);
        return mensagem;
    }
    
}
