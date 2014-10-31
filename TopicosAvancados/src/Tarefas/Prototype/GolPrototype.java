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
public class GolPrototype extends CarroPrototype {
    protected GolPrototype(GolPrototype golPrototype) {
            this.valorCompra = golPrototype.getValorCompra();
    }

    public GolPrototype() {
            valorCompra = 0.0;
    }
    
    public String exibirInfo() {
            return "Modelo: Gol\nMontadora: Wolkswagen\n" + "Valor: R$"
                            + getValorCompra();
    }
    
    public CarroPrototype clonar() {
            return new GolPrototype(this);
    }
}
