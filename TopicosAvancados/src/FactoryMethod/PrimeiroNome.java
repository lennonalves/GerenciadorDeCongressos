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
public class PrimeiroNome extends Separador {
    public PrimeiroNome (String s) {
        int i = s.lastIndexOf(" ");
        int j = s.indexOf(" ");
        
        System.out.println("i: " + i + "\nj: " + j);
        
        if (i > 0) {
            if (i > j){
                super.setNome(s.substring(0, j). trim());
                super.setMeio(s.substring(j+1, i). trim());
                super.setSobrenome(s.substring(i+1).trim());
                
                System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
            }
            else
            {
                super.setNome(s.substring(0, i). trim());
                super.setSobrenome(s.substring(i+1).trim());
                
                System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
            }
        }
        else {
            super.setNome(" ");
            super.setMeio(" ");
            super.setSobrenome(s);
            
            System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
        }
    }
}
