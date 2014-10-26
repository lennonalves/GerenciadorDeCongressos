/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat;

/**
 *
 * @author lennonalves
 */
public class Clientes {
    
    public static Clientes instancia;

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }
    
    protected Clientes(){}
    
    public static Clientes getInstancia() {
        if (instancia == null)
            instancia = new Clientes();
        return instancia;
    }
    
    static int id;
}
