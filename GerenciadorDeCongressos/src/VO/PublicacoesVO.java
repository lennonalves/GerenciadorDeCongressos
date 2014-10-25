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
public class PublicacoesVO {
    private static String TituloArtigo;
    private static String Editora;
    
    public static PublicacoesVO instancia;
    
    protected PublicacoesVO(){}
    
    public static PublicacoesVO getInstancia() {
        if (instancia == null)
            instancia = new PublicacoesVO();
        return instancia;
    }

    /**
     * @return the TituloArtigo
     */
    public static String getTituloArtigo() {
        return TituloArtigo;
    }

    /**
     * @param aTituloArtigo the TituloArtigo to set
     */
    public static void setTituloArtigo(String aTituloArtigo) {
        TituloArtigo = aTituloArtigo;
    }

    /**
     * @return the Editora
     */
    public static String getEditora() {
        return Editora;
    }

    /**
     * @param aEditora the Editora to set
     */
    public static void setEditora(String aEditora) {
        Editora = aEditora;
    }
}
