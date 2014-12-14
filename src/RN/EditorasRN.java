/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RN;

import PERS.EditorasPers;
import VO.EditorasVO;

/**
 *
 * @author lennonalves
 */
public class EditorasRN {
    
    public static EditorasRN instancia;
    
    protected EditorasRN(){}
    
    public static EditorasRN getInstancia() {
        if (instancia == null)
            instancia = new EditorasRN();
        return instancia;
    }
    
    public String editarEditoras (EditorasVO evo) {
        EditorasPers epers = EditorasPers.getInstancia();
        String mensagem = epers.editarEditoras(evo);
        return mensagem;
    }
    
    public String cadastrarEditoras (EditorasVO evo) {
        EditorasPers epers = EditorasPers.getInstancia();
        String mensagem = epers.cadastrarEditoras(evo);
        return mensagem;
    }
    
    public String atualizaCampos (EditorasVO evo) {
        EditorasPers epers = EditorasPers.getInstancia();
        String mensagem = epers.atualizaCampos(evo);
        return mensagem;
    }
    
}
