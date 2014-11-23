/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.ConvitesPers;
import VO.ConvitesVO;

/**
 *
 * @author lennonalves
 */
public class ConvitesRN {
    
    public static ConvitesRN instancia;
    
    protected ConvitesRN(){}
    
    public static ConvitesRN getInstancia() {
        if (instancia == null)
            instancia = new ConvitesRN();
        return instancia;
    }
    
    public String enviarConvite(ConvitesVO cvo) {
        ConvitesPers cpers = ConvitesPers.getInstancia();
        String mensagem = cpers.enviarConvite(cvo);
        return mensagem;
    }
    
}
