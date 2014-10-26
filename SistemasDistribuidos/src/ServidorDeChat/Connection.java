/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lennonalves
 */
public class Connection extends Thread
{    
    public Connection(){}
    
    public void run()
    {
        
    DatagramSocket s = null;
        try {
            s = new DatagramSocket(1970);
        } catch (SocketException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    byte[] buffer = new byte[256];
    
    try{
        DatagramPacket request = new DatagramPacket(buffer, buffer.length);
        s.receive(request);

        String m = new String(request.getData());

        InetAddress endereco = request.getAddress();
        String hostId = m.substring(0, 2).trim();
        String hostName = m.substring(2).trim();
        String hostAddress = endereco.getHostAddress();

        System.out.println(hostId + hostName + hostAddress);
        //txtClientes.setText(txtClientes.getText()+ hostId + hostName + hostAddress);
    }catch (IOException e)
    {
        System.out.println("Status: Servidor Desconectado");
        System.out.println("IOException: " + e);
    }
    
    }
}


