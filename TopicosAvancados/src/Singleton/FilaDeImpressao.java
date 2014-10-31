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
public class FilaDeImpressao {
    //permite que somente exista uma fila de impressão
    static boolean instanceFlag = false;
    
    public FilaDeImpressao() throws SingletonException {
        if (instanceFlag)
            throw new SingletonException("Somente uma fila permitida.");
        else {
                    instanceFlag = true;
                    System.out.println("Fila aberta...");
        }
    }
    
    public void finalize() {
        instanceFlag = false;
    }
    
    public boolean getInstance() {
        return this.instanceFlag;
    }
}
