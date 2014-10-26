/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Nadador implements Prototype {
    private String nome;
    private int idade;
    private String clube;
    private float tempo;
    private boolean femea;

    
    private String s=""; //controla a leitura do arquivo
    private Vector nadadores;

    Nadador(){
        criaVector
        ("/home/lennonalves/Documentos/utfpr/disciplinas/topicos_nasser/exemplos/nadador.txt");
    }

    Nadador(String linha){
	s=linha;
	setDados(); //permite separar uma linha em campos
    }

    private void criaVector(String filename){
       	nadadores = new Vector();
	String s="";
    	try{ //abrir o arquivo
            FileReader f =
                    new FileReader(filename);
            BufferedReader b =
                    new BufferedReader(f);
            s = b.readLine();
            while (s != null){
		nadadores.addElement(
                        new Nadador(s));
		s = b.readLine();
            }
            f.close();
            b.close();
	}catch(Exception e) {
            System.out.println
                    ("Erro lendo arquivo!");
        }
    }

    private void setDados(){
	String campo="";
	int qtde=0;
        for (int i=0; i <= this.s.length()-1; i++){
            if (this.s.charAt(i)!= ' ')
		campo=campo+this.s.charAt(i);
            else{
		qtde++;
		if (qtde==1){ //Atribui Nome
                    nome= campo;
                    campo="";
		}
		if (qtde==2) { //Atribui Idade
                    idade =
                      Integer.parseInt(campo,10);
                    campo="";
		}
		if (qtde==3) { //Atribui Clube
                    clube = campo;
                    campo="";
		}
		if (qtde==4) { //Atribui Tempo
                    tempo =
                    new Float(campo).floatValue();
                    campo="";
		}
		if (qtde==5) { //Atribui Femea
                    femea =
               new Boolean(campo).booleanValue();
                    campo="";
		}
            }
        }
    }
   public Object clone(){
	try{
            return new Nadador();
	}catch(Exception e){
            System.out.println(e.getMessage());
            return null;
	}
    }

   protected void removeElemento(
           int posI, int posF){
	for (int i = posI; i<= posF; i++)
            nadadores.removeElementAt(i);
    }

    protected int tamanhoVetor(){
	return nadadores.size();
    }
    protected Object getNadador(int i){
	return  nadadores.elementAt(i);
    }

    protected String getNome(){	return nome;}
    protected int getIdade(){return idade;}
    protected String getClube(){return clube;}
    protected float getTempo(){	return tempo;}
    protected boolean getFemea(){return femea;}
    
}

