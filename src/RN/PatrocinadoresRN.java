/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.PatrocinadoresPers;
import VO.PatrocinadoresVO;

/**
 *
 * @author lennonalves
 */
public class PatrocinadoresRN {
    
    public static PatrocinadoresRN instancia;
    
    protected PatrocinadoresRN(){}
    
    public static PatrocinadoresRN getInstancia() {
        if (instancia == null)
            instancia = new PatrocinadoresRN();
        return instancia;
    }
    
    public String editarPatrocinador (PatrocinadoresVO pvo) {
        PatrocinadoresPers ppers = PatrocinadoresPers.getInstancia();
        String mensagem = ppers.editarPatrocinador(pvo);
        return mensagem;
    }
    
    public String cadastrarPatrocinador (PatrocinadoresVO pvo) {
        PatrocinadoresPers ppers = PatrocinadoresPers.getInstancia();
        String mensagem = ppers.cadastrarPatrocinador(pvo);
        return mensagem;
    }
    
    public String atualizaCampos (PatrocinadoresVO pvo) {
        PatrocinadoresPers ppers = PatrocinadoresPers.getInstancia();
        String mensagem = ppers.atualizaCampos(pvo);
        return mensagem;
    }
    
}
