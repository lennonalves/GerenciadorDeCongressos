/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat.VO;

import ServidorDeChat.RN.ClientesRN;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lennonalves
 */

public class Connection extends Thread {
    
    @Override
    public void run()
    {
        ClientesVO cvo = ClientesVO.getInstancia();
        ClientesRN crn = ClientesRN.getInstancia();
        
        DatagramSocket s = null;
        try {
            s = new DatagramSocket(Integer.parseInt(cvo.getHostPort()));
        } catch (SocketException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true) {
                    
            byte[] buffer = new byte[256];
            DatagramPacket request = new DatagramPacket(buffer, buffer.length);
            try {
                s.receive(request);
            } catch (IOException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }

            String m = new String(request.getData());
            InetAddress endereco = request.getAddress();

            cvo.setHostId(null); cvo.setHostName(null); cvo.setHostAddress(null);

            if (m.substring(0, 1).equals("1")) 
            {
                cvo.setHostId(m.substring(0, 2).trim());
                cvo.setHostName(m.substring(2).trim());
                cvo.setHostAddress(endereco.getHostAddress());
                cvo.setHostPort(Integer.toString(request.getPort()));
                System.out.print(crn.adicionaCliente(cvo));
                System.out.println("\n" + crn.listarClientes(cvo));
            }

            if (m.substring(0, 1).equals("5")) 
            { 
                cvo.setHostId(m.substring(0, 2).trim());
                cvo.setHostName(m.substring(2).trim());
                cvo.setHostAddress(endereco.getHostAddress());
                cvo.setHostPort(Integer.toString(request.getPort()));
                System.out.println(crn.removeCliente(cvo));
                System.out.println(crn.listarClientes(cvo));
            }
            
            if (m.substring(0, 1).equals("3")) 
            { //ip //porta //mensagem
                int aux = 0;
                cvo.setHostId(m.substring(0, 2).trim());
                cvo.setHostAddress(endereco.getHostAddress());
                cvo.setHostPort(Integer.toString(request.getPort()));
                aux = m.lastIndexOf('#')+1;
                cvo.setMensagem(m.substring(aux));
                
                if(cvo.getHostPort().equals("99999") && cvo.getHostAddress().equals("999.999.999.999"))
                {
//                    enviar mensagem para todos os clientes (datagrama 4)
                }
                else
                {
//                    enviar mensagem para o cliente (datagrama 4)
                }
            }
        }
    }
}
