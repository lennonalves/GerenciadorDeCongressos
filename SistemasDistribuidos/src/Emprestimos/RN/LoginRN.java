/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.RN;

import Emprestimos.Pers.LoginPers;
import Emprestimos.VO.LoginVO;

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
    
    private String mensagem = null;
    
    public String autenticaLogin(LoginVO lvo) {
        if (lvo.getUser().equals("") || lvo.getSenha().equals("")) {
            LoginPers lpers = LoginPers.getInstancia();
        }
        else {
            mensagem = "Favor preencher os campos corretamentes.";
        }
        return mensagem;
    }
    
}
