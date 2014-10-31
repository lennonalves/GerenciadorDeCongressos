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
public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {
    public void carregarImagem(String nomeDoArquivo) {
            glCarregarImagem(nomeDoArquivo);
    }
    
    public void desenharImagem(int posX, int posY, int largura, int altura) {
            glDesenharImagem(posX, posY);
    }
}
