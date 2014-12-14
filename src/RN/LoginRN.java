/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.LoginPers;
import VO.LoginVO;

/**
 *
 * @author lennonalves
 */
public class LoginRN {
    
    public static LoginRN instancia;
    
    protected LoginRN(){}
    
    public static LoginRN getInstancia() {
        if (instancia == null)
            instancia = new LoginRN();
        return instancia;
    }
    
    public String fazerLogin (LoginVO lvo) {
        
        LoginPers pers = LoginPers.getInstancia();
        String mensagem = null;
        
        if (pers.controleAcesso(lvo)){
        
            LoginPers lpers = LoginPers.getInstancia();
            mensagem = lpers.fazerLogin(lvo);
            return mensagem;
        
        }
        
        mensagem = "Login e/ou senha inválido!";
        return mensagem;
        
    }
}
