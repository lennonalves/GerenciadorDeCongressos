/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VO;

/**
 *
 * @author lennon
 */
public class JulgarArtigoVO {
    
    private static String avaliacao1;
    private static String avaliacao2;
    private static String avaliacao3;
    
    public static JulgarArtigoVO instancia;
    
    protected JulgarArtigoVO(){}
    
    public static JulgarArtigoVO getInstancia() {
        if (instancia == null)
            instancia = new JulgarArtigoVO();
        return instancia;
    }

    /**
     * @return the avaliacao1
     */
    public static String getAvaliacao1() {
        return avaliacao1;
    }

    /**
     * @param aAvaliacao1 the avaliacao1 to set
     */
    public static void setAvaliacao1(String aAvaliacao1) {
        avaliacao1 = aAvaliacao1;
    }

    /**
     * @return the avaliacao2
     */
    public static String getAvaliacao2() {
        return avaliacao2;
    }

    /**
     * @param aAvaliacao2 the avaliacao2 to set
     */
    public static void setAvaliacao2(String aAvaliacao2) {
        avaliacao2 = aAvaliacao2;
    }

    /**
     * @return the avaliacao3
     */
    public static String getAvaliacao3() {
        return avaliacao3;
    }

    /**
     * @param aAvaliacao3 the avaliacao3 to set
     */
    public static void setAvaliacao3(String aAvaliacao3) {
        avaliacao3 = aAvaliacao3;
    }
}
