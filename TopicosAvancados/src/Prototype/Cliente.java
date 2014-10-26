/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lennonalves
 */
public class Cliente extends Frame {
    private Nadador sw;

	public Cliente(){
	    super("Exemplo de Prototype");
	    sw =  new Nadador();
	    setGUI();
	}

	private void setGUI(){
	    setLayout(new BorderLayout());
	    Panel p = new Panel();
            add("Center",p);
            p.setLayout(new GridLayout(1,2));

            List lista = new List(10);
            p.add(lista);
            lista.removeAll();
            Nadador nadador;
            for(int i = 0; i < sw.tamanhoVetor(); i++){
		nadador = (Nadador) sw.getNadador(i);
		lista.add(nadador.getNome()+"   "+ nadador.getTempo());
            }

            Panel p1 = new Panel();
            p1.setBackground(Color.lightGray);
            add("South", p1);

            final List listaClone  = new List(10);

            Panel p2 = new Panel();
            p2.setLayout(new GridLayout(1,2));
            p2.setBackground(Color.lightGray);
            p.add(p2);
            p2.add(listaClone);

            Button botaoClone = new Button("Clone");
            botaoClone.setEnabled(true);
            p1.add(botaoClone);
            botaoClone.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                Nadador nadadorClone;
                nadadorClone = (Nadador) sw.clone();//cria o clone
                nadadorClone.removeElemento(0,8); //remove elementos do vetor
		listaClone.removeAll();
                Nadador nadador;
		for(int i = 0; i < nadadorClone.tamanhoVetor(); i++){
                    nadador = (Nadador) nadadorClone.getNadador(i);
                    listaClone.add(nadador.getNome()+"   "+nadador.getTempo());
		}
            }});

            setBounds(100, 100, 300, 300);
            setVisible(true);
	}

	public static void main(String arg[]){
            Cliente p = new Cliente();
            p.addWindowListener(
    		new WindowAdapter(){
    			public void windowClosing(WindowEvent e){
    				System.exit(0); } } );
	}
}
