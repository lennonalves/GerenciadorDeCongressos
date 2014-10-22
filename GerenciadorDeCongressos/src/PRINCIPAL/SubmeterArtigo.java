/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PRINCIPAL;

/**
 *
 * @author lennon
 */
public class SubmeterArtigo {
    private static String tituloArtigo;
    private static String temaArtigo;
    private static String nomeAutor1;
    private static String nomeAutor2;
    private static String nomeAutor3;
    
    public static SubmeterArtigo instancia;
    
    protected SubmeterArtigo(){}
    
    public static SubmeterArtigo getInstancia() {
        if (instancia == null)
            instancia = new SubmeterArtigo();
        return instancia;
    }

    /**
     * @return the tituloArtigo
     */
    public static String getTituloArtigo() {
        return tituloArtigo;
    }

    /**
     * @param aTituloArtigo the tituloArtigo to set
     */
    public static void setTituloArtigo(String aTituloArtigo) {
        tituloArtigo = aTituloArtigo;
    }

    /**
     * @return the temaArtigo
     */
    public static String getTemaArtigo() {
        return temaArtigo;
    }

    /**
     * @param aTemaArtigo the temaArtigo to set
     */
    public static void setTemaArtigo(String aTemaArtigo) {
        temaArtigo = aTemaArtigo;
    }

    /**
     * @return the nomeAutor1
     */
    public static String getNomeAutor1() {
        return nomeAutor1;
    }

    /**
     * @param aNomeAutor1 the nomeAutor1 to set
     */
    public static void setNomeAutor1(String aNomeAutor1) {
        nomeAutor1 = aNomeAutor1;
    }

    /**
     * @return the nomeAutor2
     */
    public static String getNomeAutor2() {
        return nomeAutor2;
    }

    /**
     * @param aNomeAutor2 the nomeAutor2 to set
     */
    public static void setNomeAutor2(String aNomeAutor2) {
        nomeAutor2 = aNomeAutor2;
    }

    /**
     * @return the nomeAutor3
     */
    public static String getNomeAutor3() {
        return nomeAutor3;
    }

    /**
     * @param aNomeAutor3 the nomeAutor3 to set
     */
    public static void setNomeAutor3(String aNomeAutor3) {
        nomeAutor3 = aNomeAutor3;
    }

}
