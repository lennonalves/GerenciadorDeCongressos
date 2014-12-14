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
public class MenuVO {
    
    public static MenuVO instancia;
    
    protected MenuVO(){}
    
    public static MenuVO getInstancia() {
        if (instancia == null)
            instancia = new MenuVO();
        return instancia;
    }
    
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
