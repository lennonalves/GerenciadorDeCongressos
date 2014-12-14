/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VO;

/**
 *
 * @author lennon
 */
public class PublicacoesVO {
    
    public static PublicacoesVO instancia;
    
    protected PublicacoesVO(){}
    
    public static PublicacoesVO getInstancia() {
        if (instancia == null)
            instancia = new PublicacoesVO();
        return instancia;
    }
    
    private String titulo, editora;
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
