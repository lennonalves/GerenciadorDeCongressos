/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author victor
 */
public class Proxy implements InterfaceProxy {

    @Override
    public boolean temPermissao(String usuario, String senha) {
        Autenticacao permissao = new Autenticacao();
         
        return permissao.temPermissao(usuario, senha);
    }
    
}
