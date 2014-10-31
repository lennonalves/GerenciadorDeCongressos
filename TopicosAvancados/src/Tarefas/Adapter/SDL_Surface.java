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
public class SDL_Surface {
    public void SDL_CarregarSurface(String arquivo) {
            System.out.println("Imagem " + arquivo + " carregada.");
    }

    public void SDL_DesenharSurface(int largura, int altura, int posicaoX,
                    int posicaoY) {
            System.out.println("SDL_Surface desenhada");
    }
}
