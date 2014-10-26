/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethod;
import java.awt.event.*;
import javax.swing.*;

class SeparadorDeNome extends JFrame{
	private JTextField nomeDigitado;
	private JTextField primeiroNome;
	private JTextField ultimoNome;

	private JPanel frame = new JPanel();

	private JLabel nomeLabel;
	private JLabel primeiroNomeLabel;
	private JLabel ultimoNomeLabel;


	public SeparadorDeNome(){
		super("Separador de Nome");
                frame.setLayout(null);
        	nomeLabel = new JLabel("Entre com o nome ");
                frame.add(nomeLabel);

                nomeDigitado = new JTextField(10);
                frame.add(nomeDigitado);

                primeiroNomeLabel = new JLabel("Primeiro Nome");
                frame.add(primeiroNomeLabel);

                primeiroNome = new JTextField(10);
                frame.add(primeiroNome);

                ultimoNomeLabel = new JLabel("Ultimo Nome");
                frame.add(ultimoNomeLabel);

                ultimoNome = new JTextField(10);
                frame.add(ultimoNome);

                JButton botaoComputa = new JButton("Computa");
                JButton botaoLimpa = new JButton("Limpa");

                frame.add(botaoComputa);
                botaoComputa.addActionListener(new ActionListener() {
        	public void actionPerformed (ActionEvent e) {
   			Factory nfactory = new Factory();
   			Separador separador = new Separador();
    			separador = nfactory.getSeparador(nomeDigitado.getText());

    			primeiroNome.setText(separador.getNome());
    			ultimoNome.setText(separador.getSobrenome());
    		 }});


		frame.add(botaoLimpa);
		botaoLimpa.addActionListener(new ActionListener() {
        	public void actionPerformed (ActionEvent e) {
   				nomeDigitado.setText("");
   				primeiroNome.setText("");
   				ultimoNome.setText("");
    		 }});

        nomeLabel.setBounds(10,10,130,20);
	nomeDigitado.setBounds(150,10,250, 20);

	primeiroNomeLabel.setBounds(10,60,130,20);
	primeiroNome.setBounds(150,60,250,20);

	ultimoNomeLabel.setBounds(10,80,130,20);
	ultimoNome.setBounds(150,80,250,20);

	botaoComputa.setBounds(65,120,120,30);
	botaoLimpa.setBounds(220,120,120,30);

        setSize(450, 200);
        setContentPane(frame);
        show();
    }

    public static void main(String arg[]){
    	SeparadorDeNome s = new SeparadorDeNome();
    	s.addWindowListener(
    		new WindowAdapter(){
    			public void windowClosing(WindowEvent e){
    				System.exit(0); } } );
	}
}

