/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.AvaliadorPers;
import VO.AvaliadorVO;

/**
 *
 * @author lennonalves
 */
public class AvaliadorRN {
    
    public static AvaliadorRN instancia;
    
    protected AvaliadorRN(){}
    
    public static AvaliadorRN getInstancia() {
        if (instancia == null)
            instancia = new AvaliadorRN();
        return instancia;
    }
    
    public String avaliaArtigo (AvaliadorVO avo) {
        AvaliadorPers apers = AvaliadorPers.getInstancia();
        String mensagem = apers.avaliaArtigo(avo);
        return mensagem;
    }
    
    public String atualizarCampos (AvaliadorVO avo) {
        AvaliadorPers apers = AvaliadorPers.getInstancia();
        String mensagem = apers.atualizarCampos(avo);
        return mensagem;
    }
    
}
