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
public class UltimoNome extends Separador {
    public UltimoNome (String s) {
        int i = s.lastIndexOf(",");
        int j = s.lastIndexOf(" ");
        System.out.println("i: " + i + "\nj: " + j);
        if (i > 0) {
            if (j > (i+1)){
            super.setNome(s.substring(i+1, j). trim());
            super.setMeio(s.substring(j). trim());
            super.setSobrenome(s.substring(0, i).trim());
            
            System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
            }
            else
            {
                super.setNome(s.substring(i+1). trim());
                super.setSobrenome(s.substring(0, i).trim());
                
                System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
            }
        }
        else {
            super.setNome(" ");
            super.setSobrenome(s);
            
            System.out.println("Nome: " + super.getNome()
                + "\nMeio: " + super.getMeio() + "\nSobrenome: " + super.getSobrenome());
        }
    }
}
