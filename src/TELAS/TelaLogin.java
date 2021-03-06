/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import RN.LoginRN;
import VO.LoginVO;
import VO.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    
    public static TelaLogin instancia;
    
    protected TelaLogin() {
        initComponents();
    }
    
    public static TelaLogin getInstancia() {
        if (instancia == null)
            instancia = new TelaLogin();
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IFIP Congressos //Seja Bem Vindo!");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("telaLogin"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lblSenha.setFont(new java.awt.Font("Eras Light ITC", 0, 10)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(100, 140, 34, 13);

        lblUsuario.setFont(new java.awt.Font("Eras Light ITC", 0, 10)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(100, 90, 40, 13);

        btnOk.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnOk.setText("ENTRAR");
        btnOk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(160, 200, 80, 30);

        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(100, 110, 200, 20);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 160, 200, 20);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Seja Bem Vindo!");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(110, 30, 197, 29);

        lblSubTitle.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(255, 102, 0));
        lblSubTitle.setText("Entre com seu usuário e senha.");
        getContentPane().add(lblSubTitle);
        lblSubTitle.setBounds(110, 60, 201, 15);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 420, 320);
        imgFundo.getAccessibleContext().setAccessibleName("imgFundo");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        
        LoginVO lvo = LoginVO.getInstancia();
        lvo.setUser(txtUser.getText());
        lvo.setSenha(txtSenha.getText());
        
        Proxy login = new Proxy();
        
        login.temPermissao(txtUser.getText(), txtSenha.getText());
        
        //LoginRN lrn = LoginRN.getInstancia();
        //JOptionPane.showMessageDialog(null, lrn.fazerLogin(lvo));
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
