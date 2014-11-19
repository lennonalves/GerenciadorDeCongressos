/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.Pers;

/**
 *
 * @author lennonalves
 */
public class LoginPers {
    
    public static LoginPers instancia;
    
    protected LoginPers() {}
    
    public static LoginPers getInstancia() {
        if (instancia == null)
            instancia = new LoginPers();
        return instancia;
    }
    
}
