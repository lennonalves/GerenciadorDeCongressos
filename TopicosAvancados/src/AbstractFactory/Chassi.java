/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory;

/**
 *
 * @author lennon
 */
abstract class Chassi {
    
    private Motor motor;
    private Eixo eixoDianteiro;
    private Eixo eixoTraseiro;
    
    public void encaixe(Motor m) {
        motor = m;
    }
    
    public void encaixeEixoDianteiro(Eixo e) {
        eixoDianteiro = e;
    }
    
    public void encaixeEixoTraseiro(Eixo e) {
        eixoTraseiro = e;
    }
}