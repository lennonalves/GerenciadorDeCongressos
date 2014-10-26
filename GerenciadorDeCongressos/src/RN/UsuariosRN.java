/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.UsuariosPers;
import VO.UsuariosVO;

/**
 *
 * @author lennonalves
 */
public class UsuariosRN {
    
    public static UsuariosRN instancia;
    
    protected UsuariosRN(){}
    
    public static UsuariosRN getInstancia() {
        if (instancia == null)
            instancia = new UsuariosRN();
        return instancia;
    }
    
    public String atualizaCampos (UsuariosVO uvo) {
        UsuariosPers upers = UsuariosPers.getInstancia();
        String mensagem = upers.atualizaCampos(uvo);
        return mensagem;
    }
    
    public String cadastraUsuario (UsuariosVO uvo) {
        UsuariosPers upers = UsuariosPers.getInstancia();
        String mensagem = upers.cadastraUsuario(uvo);
        return mensagem;
    }
    
    public String editaUsuario (UsuariosVO uvo) {
        UsuariosPers upers = UsuariosPers.getInstancia();
        String mensagem = upers.editaUsuario(uvo);
        return mensagem;
    }
    
}
