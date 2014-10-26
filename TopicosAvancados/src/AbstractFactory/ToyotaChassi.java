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
public class ToyotaChassi extends Chassi {
    
    public void encaixe(Motor m) {
        super.encaixe(m);
        System.out.print("Motor encaixado em chassi Toyota");
    }
    
}
