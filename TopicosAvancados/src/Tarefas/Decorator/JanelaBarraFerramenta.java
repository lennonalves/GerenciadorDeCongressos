/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas.Decorator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *
 * @author lennonalves
 */
public class JanelaBarraFerramenta extends Decorator{
    public JanelaBarraFerramenta(Janela j)
    {
        super(j);
    }
    
    public void adicionaComponente()
    {
        super.adicionaComponente();
        
        JToolBar tool = new JToolBar();
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        painel.add(tool);
        tool.add(new JToggleButton("Botão 1"));
        this.frame.getContentPane().add(painel, BorderLayout.NORTH);
    }
}
