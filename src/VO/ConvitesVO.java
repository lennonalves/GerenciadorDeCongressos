/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author lennonalves
 */
public class ConvitesVO {
    
    public static ConvitesVO instancia;
    
    protected ConvitesVO(){}
    
    public static ConvitesVO getInstancia() {
        if (instancia == null)
            instancia = new ConvitesVO();
        return instancia;
    }
    
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
