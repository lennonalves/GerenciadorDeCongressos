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
public class PalioPrototype extends CarroPrototype {
    private PalioPrototype(PalioPrototype palioPrototype) {
            this.valorCompra = palioPrototype.getValorCompra();
    }

    public PalioPrototype() {
            valorCompra = 0.0;
    }
    
    public String exibirInfo() {
            return "Modelo: Palio\n" + "Montadora: Fiat\n" + "Valor: R$"
                            + getValorCompra();
    }
    
    public CarroPrototype clonar() {
            return new PalioPrototype(this);
    }
}
