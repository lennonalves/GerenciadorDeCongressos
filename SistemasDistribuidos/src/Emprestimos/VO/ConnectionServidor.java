/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.VO;

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

public class ConnectionServidor extends Thread {
    
    @Override
    public void run()
    {
        ServidorVO svo = ServidorVO.getInstancia();
        
        DatagramSocket s = null;
        try {
            s = new DatagramSocket(Integer.parseInt(svo.getPortaServidor()));
        } catch (SocketException ex) {
            Logger.getLogger(ConnectionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true) {
                    
            byte[] buffer = new byte[256];
            DatagramPacket request = new DatagramPacket(buffer, buffer.length);
            try {
                s.receive(request);
            } catch (IOException ex) {
                Logger.getLogger(ConnectionServidor.class.getName()).log(Level.SEVERE, null, ex);
            }

            String m = new String(request.getData());
            InetAddress endereco = request.getAddress();
        }
    }
}