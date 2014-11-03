/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat.Telas;

import ServidorDeChat.RN.ClientesRN;
import ServidorDeChat.VO.ClientesVO;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lennonalves
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
    }
    
    boolean flag = false;
    String hostName;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgAtualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        txtPorta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JToggleButton();
        MensagemEnviar = new javax.swing.JScrollPane();
        txtMensagem = new javax.swing.JTextArea();
        btnConectar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(655, 320));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        imgAtualizar.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        imgAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        imgAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/atualizar32.png"))); // NOI18N
        imgAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAtualizarMouseClicked(evt);
            }
        });
        getContentPane().add(imgAtualizar);
        imgAtualizar.setBounds(600, 10, 40, 40);

        jLabel3.setFont(new java.awt.Font("PakType Naqsh", 0, 24)); // NOI18N
        jLabel3.setText("Conexão do Cliente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 10, 210, 30);

        jLabel4.setText("Conexão:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 70, 16);

        txtIP.setText("localhost");
        getContentPane().add(txtIP);
        txtIP.setBounds(80, 60, 150, 28);

        txtPorta.setText("1970");
        getContentPane().add(txtPorta);
        txtPorta.setBounds(290, 60, 90, 28);

        jLabel2.setText("Porta:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 70, 50, 16);

        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(290, 170, 90, 80);

        txtMensagem.setColumns(20);
        txtMensagem.setRows(5);
        MensagemEnviar.setViewportView(txtMensagem);

        getContentPane().add(MensagemEnviar);
        MensagemEnviar.setBounds(10, 170, 270, 82);

        btnConectar.setText("CONECTAR");
        btnConectar.setToolTipText("");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar);
        btnConectar.setBounds(10, 130, 370, 28);

        jLabel5.setText("IP de");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 60, 50, 16);

        jLabel6.setText("Usuário:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 100, 60, 16);
        getContentPane().add(txtUser);
        txtUser.setBounds(80, 90, 300, 28);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IP", "Porta", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(392, 60, 250, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed
    
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        DatagramSocket conexao = null;
        
        if(flag == false)
        {
            //conectado
            
            txtUser.setEnabled(flag);
            txtIP.setEnabled(flag);
            txtPorta.setEnabled(flag);
            
            btnConectar.setText("DESCONECTAR");
            flag = true;
            
            try 
            {
                
                System.out.println("Status: Cliente Conectado");
                hostName = null; hostName = txtUser.getText();
                String mensagem = "1#" + hostName;
                
                conexao = new DatagramSocket();
                byte[] m = mensagem.getBytes();
                
                InetAddress aHost = InetAddress.getByName(txtIP.getText());
                int serverPort = Integer.parseInt(txtPorta.getText());
                
                DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
                conexao.send(request);
                
            } catch (IOException e)
            {  
                System.out.println("IOException: " + e);
            }
            
        }
        else
        {
            //desconectado
            
            txtUser.setEnabled(flag);
            txtIP.setEnabled(flag);
            txtPorta.setEnabled(flag);
            
            btnConectar.setText("CONECTAR");
            flag = false;
            
            try 
            {
                System.out.println("Status: Cliente Desconectado");
                hostName = null; hostName = txtUser.getText();
                String mensagem = "5#";
                
                conexao = new DatagramSocket();
                byte[] m = mensagem.getBytes();
                
                InetAddress aHost = InetAddress.getByName(txtIP.getText());
                int serverPort = Integer.parseInt(txtPorta.getText());
                
                DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
                conexao.send(request);
                
            } catch (IOException e)
            {  
                System.out.println("IOException: " + e);
            }
            
            conexao.close();
            
        }
        
    }//GEN-LAST:event_btnConectarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void atualizarListaCliente(){
        
        ClientesVO cvo = ClientesVO.getInstancia();
        cvo.dtm = (DefaultTableModel) tbClientes.getModel();
        cvo.dtm.setNumRows(0);
        
        ClientesRN crn = ClientesRN.getInstancia();
        crn.atualizaClientes(cvo);
        
    }
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
        atualizarListaCliente();
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void imgAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAtualizarMouseClicked
        // TODO add your handling code here:
        
        atualizarListaCliente();
        
    }//GEN-LAST:event_imgAtualizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MensagemEnviar;
    private javax.swing.JToggleButton btnConectar;
    private javax.swing.JToggleButton btnEnviar;
    private javax.swing.JLabel imgAtualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextArea txtMensagem;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
