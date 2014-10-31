/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas.Decorator;

import javax.swing.JFrame;

/**
 *
 * @author lennonalves
 */
public abstract class Decorator implements Janela{
    public Janela janela;
    public JFrame frame;
    
    public Decorator (Janela j)
    {
        janela = j;
        this.frame = janela.getFrame();
    }
    
    public void adicionaComponente()
    {
        janela.adicionaComponente();
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
}
