/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas.Adapter;

/**
 *
 * @author lennonalves
 */
public class OpenGLImage {
    public void glCarregarImagem(String arquivo) 
    {
        System.out.println("Imagem " + arquivo + " carregada.");
    }

    public void glDesenharImagem(int posicaoX, int posicaoY) 
    {
        System.out.println("OpenGL Image desenhada");
    }
}
