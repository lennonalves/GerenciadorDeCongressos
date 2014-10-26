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
abstract class Fabricante {
    
    public static Fabricante getFactory(String nomeFabricante) {
        Fabricante fab = null;
        if(nomeFabricante.equals("Renault"))
            fab = new RenaultFabricante();
        else if(nomeFabricante.equals("Fiat"))
            fab = new FiatFabricante();
        else if(nomeFabricante.equals("Toyota"))
            fab = new ToyotaFabricante();
        return fab;
    }
    
    public abstract Motor criaMotor();
    public abstract Chassi criaChassi();
    public abstract Eixo criaEixo();
}