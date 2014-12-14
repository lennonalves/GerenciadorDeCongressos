/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.SessoesPers;
import VO.SessoesVO;

/**
 *
 * @author lennonalves
 */
public class SessoesRN {
    
    public static SessoesRN instancia;
    
    protected SessoesRN(){}
    
    public static SessoesRN getInstancia() {
        if (instancia == null)
            instancia = new SessoesRN();
        return instancia;
    }
    
    public String editarSessao (SessoesVO svo) {
        SessoesPers spers = SessoesPers.getInstancia();
        String mensagem = spers.editarSessao(svo);
        return mensagem;
    }
    
    public String cadastrarSessao (SessoesVO svo) {
        SessoesPers spers = SessoesPers.getInstancia();
        String mensagem = spers.cadastrarSessao(svo);
        return mensagem;
    }
    
    public String atualizaCampos (SessoesVO svo) {
        SessoesPers spers = SessoesPers.getInstancia();
        String mensagem = spers.atualizaCampos(svo);
        return mensagem;
    }
    
    public String atualizaModerador (SessoesVO svo) {
        SessoesPers spers = SessoesPers.getInstancia();
        String mensagem = spers.atualizaModerador(svo);
        return mensagem;
    }
    
}
