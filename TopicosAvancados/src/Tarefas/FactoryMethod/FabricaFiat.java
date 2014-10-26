/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas.FactoryMethod;

/**
 *
 * @author lennonalves
 */
public class FabricaFiat implements FabricaDeCarro{
    public Carro criarCarro() 
    {
        return new Palio();
    }
}
