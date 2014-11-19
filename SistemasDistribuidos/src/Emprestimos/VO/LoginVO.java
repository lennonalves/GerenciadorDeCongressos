/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.VO;

/**
 *
 * @author lennonalves
 */
public class LoginVO {
    
    public static LoginVO instancia;
    
    protected LoginVO() {}
    
    public static LoginVO getInstancia() {
        if (instancia == null)
            instancia = new LoginVO();
        return instancia;
    }
    
    private String user, senha;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
