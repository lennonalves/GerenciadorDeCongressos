/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import PERS.Conexao;
import TELAS.TelaAvaliador;
import TELAS.TelaMenu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author victor
 */
public class Autenticacao implements InterfaceProxy {

    /**
     *
     * @param usuario
     * @param senha
     * @return
     */
    @Override
    public boolean temPermissao(String usuario, String senha) {
       Conexao cx = Conexao.getInstancia();
       //String mensagem = null;
       
        try {

            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN WHERE USUARIO = '"
            + usuario + "' AND SENHA = '" + senha + "'");

            while(resultado.next()){

                //mensagem = "Bem vindo, " + resultado.getString("NOME") + "!";

                if (resultado.getString("FUNCAO").equals("Avaliador")){

                    AvaliadorVO avo = AvaliadorVO.getInstancia();
                    avo.setIdAvaliador(Integer.parseInt(resultado.getString("IDLOGIN")));

                    TelaAvaliador telaAvaliador = TelaAvaliador.getInstancia();
                    telaAvaliador.setVisible(true);

                } else {

                    MenuVO mvo = MenuVO.getInstancia();
                    mvo.setFuncao(resultado.getString("FUNCAO"));
                    
                    TelaMenu telaMenu = TelaMenu.getInstancia();
                    telaMenu.setVisible(true);

                }
                 
                return true;
            }
            cx.desconectar();

        } catch (SQLException e){

            System.out.println("ERRO: " + e.getMessage());

        }
        
        return false;
        //return mensagem;
        
        
        
        
        
        /*Conexao cx = Conexao.getInstancia();
        
        try {
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN");
            while (resultado.next()){
                if (usuario.equals(resultado.getString("USUARIO")) && senha.equals(resultado.getString("SENHA"))){
                    return true;
                } else {
                    return false;
                }
            }
            cx.desconectar();
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
		return false;*/
    }    
}
