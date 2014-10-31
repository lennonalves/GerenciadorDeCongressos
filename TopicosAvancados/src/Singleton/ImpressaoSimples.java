/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

/**
 *
 * @author lennon
 */
public class ImpressaoSimples {
    
    ImpressaoSimples(){}
    
    public static void main(String argv[]) {
        FilaDeImpressao pr1, pr2;
        System.out.println("Exemplo de Padrao Singleton");
        System.out.println("Abrindo uma fila de impressão");
        
        try{
            pr1 = new FilaDeImpressao();
            //pr1.filenize();
        }
        catch (SingletonException e) {
            System.out.println(e.getMessage());
        }
    }
}
