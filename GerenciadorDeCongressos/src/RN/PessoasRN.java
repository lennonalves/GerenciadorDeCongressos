/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.PessoasPers;
import VO.PessoasVO;

/**
 *
 * @author lennonalves
 */
public class PessoasRN {
    
    public static PessoasRN instancia;
    
    protected PessoasRN(){}
    
    public static PessoasRN getInstancia() {
        if (instancia == null)
            instancia = new PessoasRN();
        return instancia;
    }
    
    public String editaPessoas (PessoasVO pvo) {
        PessoasPers ppers = PessoasPers.getInstancia();
        String mensagem = ppers.editaPessoas(pvo);
        return mensagem;
    }
    
    public String cadastraPessoas (PessoasVO pvo) {
        PessoasPers ppers = PessoasPers.getInstancia();
        String mensagem = ppers.cadastraPessoas(pvo);
        return mensagem;
    }
    
    public String atualizaCampos (PessoasVO pvo) {
        PessoasPers ppers = PessoasPers.getInstancia();
        String mensagem = ppers.atualizaCampos(pvo);
        return mensagem;
    }
    
}
