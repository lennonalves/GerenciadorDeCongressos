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
public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {
    public void carregarImagem(String nomeDoArquivo) {
            SDL_CarregarSurface(nomeDoArquivo);
    }
    
    public void desenharImagem(int posX, int posY, int largura, int altura) {
            SDL_DesenharSurface(largura, altura, posX, posY);
    }
}
