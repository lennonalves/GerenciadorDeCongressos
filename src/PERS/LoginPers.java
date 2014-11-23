/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERS;

import TELAS.TelaAvaliador;
import TELAS.TelaMenu;
import VO.AvaliadorVO;
import VO.LoginVO;
import VO.MenuVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lennonalves
 */
public class LoginPers {
    
    public static LoginPers instancia;
    
    protected LoginPers(){}
    
    public static LoginPers getInstancia() {
        if (instancia == null)
            instancia = new LoginPers();
        return instancia;
    }
    
    public String fazerLogin (LoginVO lvo) {
        
        Conexao cx = Conexao.getInstancia();
        String mensagem = null;

        try {

            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN WHERE USUARIO = '"
            + lvo.getUser() + "' AND SENHA = '" + lvo.getSenha() + "'");

            while(resultado.next()){

                mensagem = "Bem vindo, " + resultado.getString("NOME") + "!";

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
            }
            cx.desconectar();

        } catch (SQLException e){

            mensagem = "ERRO: " + e.getMessage();

        }
        
        return mensagem;
        
    }
    
     public boolean controleAcesso(LoginVO lvo) {
         
         Conexao cx = Conexao.getInstancia();
         
         try {
             
            Connection con = cx.conectar();
            Statement consulta = con.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM LOGIN");
            
            while(resultado.next()){
                
                if (lvo.getUser().equals(resultado.getString("USUARIO")) && lvo.getSenha().equals(resultado.getString("SENHA"))) {
                    
                    return true;
                    
                }
                
            }
            
            return false;
         
         } catch (SQLException e){
            
                System.out.println("ERRO: "+ e.getMessage());
         
         }
         
         cx.desconectar();
         
         return false;
    }
    
}