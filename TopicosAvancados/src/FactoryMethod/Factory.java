/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethod;

/**
 *
 * @author lennonalves
 */
public class Factory {
    public Separador getSeparador(String entrada) {
        int i = entrada.indexOf(",");
        if (i > 0)
            return new UltimoNome(entrada);
        else
            return new PrimeiroNome(entrada);
    }
}
