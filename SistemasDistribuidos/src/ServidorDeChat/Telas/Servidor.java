/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat.Telas;

import ServidorDeChat.RN.ClientesRN;
import ServidorDeChat.VO.ClientesVO;
import ServidorDeChat.VO.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lennonalves
 */
public class Servidor extends javax.swing.JFrame {

    /**
     * Creates new form Servidor
     */
    
    public static Servidor instancia;
    
    protected Servidor() {
        initComponents();
    }
    
    public static Servidor getInstancia() {
        if (instancia == null)
            instancia = new Servidor();
        return instancia;
    }
    
    boolean flag = false;
    ThreadGroup clientes = new ThreadGroup("clientes");
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgServidor = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        imgBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pandachat | Servidor");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(600, 440));
        setMinimumSize(new java.awt.Dimension(600, 440));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        imgServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/btn-desligado.png"))); // NOI18N
        imgServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgServidorMouseClicked(evt);
            }
        });
        getContentPane().add(imgServidor);
        imgServidor.setBounds(90, 200, 180, 170);

        txtPorta.setBackground(java.awt.Color.white);
        txtPorta.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        txtPorta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorta.setText("1970");
        txtPorta.setToolTipText("");
        txtPorta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtPorta);
        txtPorta.setBounds(80, 160, 180, 20);

        tbClientes.setFont(new java.awt.Font("Zegoe Light - U", 0, 18)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Porta", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tbClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 100, 250, 310);

        imgBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/tela-servidor.jpg"))); // NOI18N
        getContentPane().add(imgBg);
        imgBg.setBounds(0, 0, 710, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
        atualizarListaCliente();
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void imgServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgServidorMouseClicked
        // TODO add your handling code here:
        
        ClientesVO cvo = ClientesVO.getInstancia();
        ClientesRN crn = ClientesRN.getInstancia();
        
        crn.zerarClientes(cvo);
        
        if(flag == false)
        {
            //btnLigar.setText("DESLIGAR");
            imgServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/btn-ligado.png")));
            flag = true;
            
            System.out.println("Status: Servidor Ativo");
            
            cvo.setHostPort(txtPorta.getText());
            Connection cx = new Connection();
            cx.start();
        }
        else
        {
            //btnLigar.setText("LIGAR");
            imgServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/btn-desligado.png")));
            flag = false;
            
            System.out.println("Status: Servidor Desligado");
        }
        
    }//GEN-LAST:event_imgServidorMouseClicked

    private void atualizarListaCliente(){   
        
        ClientesVO cvo = ClientesVO.getInstancia();
        cvo.dtm = (DefaultTableModel) tbClientes.getModel();
        cvo.dtm.setNumRows(0);
        
        ClientesRN crn = ClientesRN.getInstancia();
        crn.atualizaClientes(cvo);
        
    }
    
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
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBg;
    private javax.swing.JLabel imgServidor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtPorta;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTable getTbClientes() {
        return tbClientes;
    }

    public void setTbClientes(javax.swing.JTable tbClientes) {
        this.tbClientes = tbClientes;
    }
}
