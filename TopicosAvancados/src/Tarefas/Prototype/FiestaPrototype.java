/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas.Prototype;

/**
 *
 * @author lennonalves
 */
public class FiestaPrototype extends CarroPrototype {
    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
            this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public FiestaPrototype() {
            valorCompra = 0.0;
    }
    
    public String exibirInfo() {
            return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                            + getValorCompra();
    }
    
    public CarroPrototype clonar() {
            return new FiestaPrototype(this);
    }
}
