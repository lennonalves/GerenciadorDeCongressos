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
public class SessoesVO {
    
    public static SessoesVO instancia;
    
    protected SessoesVO(){}
    
    public static SessoesVO getInstancia() {
        if (instancia == null)
            instancia = new SessoesVO();
        return instancia;
    }
    
    private int id;
    private String moderador, area, horario;

    public String getModerador() {
        return moderador;
    }

    public void setModerador(String moderador) {
        this.moderador = moderador;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
