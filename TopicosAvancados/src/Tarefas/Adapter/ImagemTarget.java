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
public interface ImagemTarget {
    void carregarImagem(String nomeDoArquivo);
    void desenharImagem(int posX, int posY, int largura, int altura);
}
