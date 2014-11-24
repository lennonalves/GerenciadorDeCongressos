/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.JulgarArtigoPers;
import VO.JulgarArtigoVO;

/**
 *
 * @author lennonalves
 */
public class JulgarArtigoRN {
    
    public static JulgarArtigoRN instancia;
    
    protected JulgarArtigoRN(){}
    
    public static JulgarArtigoRN getInstancia() {
        if (instancia == null)
            instancia = new JulgarArtigoRN();
        return instancia;
    }
    
    public String julgarArtigo(JulgarArtigoVO javo) {
        
        JulgarArtigoPers japers = JulgarArtigoPers.getInstancia();
        String mensagem = japers.julgarArtigo(javo);
        return mensagem;
        
    }
    
    public String atualizaCampos(JulgarArtigoVO javo) {
        
        JulgarArtigoPers japers = JulgarArtigoPers.getInstancia();
        String mensagem = japers.julgarArtigo(javo);
        return mensagem;
        
    }
    
}
