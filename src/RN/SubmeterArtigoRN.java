/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.SubmeterArtigoPers;
import VO.SubmeterArtigoVO;

/**
 *
 * @author lennonalves
 */
public class SubmeterArtigoRN {
    
    public static SubmeterArtigoRN instancia;
    
    protected SubmeterArtigoRN(){}
    
    public static SubmeterArtigoRN getInstancia() {
        if (instancia == null)
            instancia = new SubmeterArtigoRN();
        return instancia;
    }
    
    public String atualizaCampos (SubmeterArtigoVO savo) {
        SubmeterArtigoPers sapers = SubmeterArtigoPers.getInstancia();
        String mensagem = sapers.atualizaCampos(savo);
        return mensagem;
    }
    
    public String submeteArtigo (SubmeterArtigoVO savo) {
        SubmeterArtigoPers sapers = SubmeterArtigoPers.getInstancia();
        String mensagem = sapers.submeteArtigo(savo);
        return mensagem;
    }
    
}
