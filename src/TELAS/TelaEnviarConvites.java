/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;
  
import RN.ConvitesRN;
import VO.ConvitesVO;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaEnviarConvites extends javax.swing.JFrame {

    /**
     * Creates new form TelaEnviarConvites
     */
    
    public static TelaEnviarConvites instancia;
    
    protected TelaEnviarConvites() {
        initComponents();
    }
    
    public static TelaEnviarConvites getInstancia() {
        if (instancia == null)
            instancia = new TelaEnviarConvites();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagem = new javax.swing.JTextArea();
        lblMensagem = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Enviar Convites");
        setMinimumSize(new java.awt.Dimension(663, 330));
        getContentPane().setLayout(null);

        txtMensagem.setColumns(20);
        txtMensagem.setRows(5);
        jScrollPane1.setViewportView(txtMensagem);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 600, 120);

        lblMensagem.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setText("Mensagem:");
        getContentPane().add(lblMensagem);
        lblMensagem.setBounds(20, 70, 110, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(410, 240, 100, 30);

        btnEnviar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(520, 240, 100, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Enviar Convites");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    void limparDados() {
        txtMensagem.setText("");
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        
        ConvitesVO cvo = ConvitesVO.getInstancia();
        cvo.setMensagem(txtMensagem.getText());
        
        ConvitesRN crn = ConvitesRN.getInstancia();
        JOptionPane.showMessageDialog(null, crn.enviarConvite(cvo));
        
        this.setVisible(false);
        
        limparDados();
        
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEnviarConvites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEnviarConvites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEnviarConvites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEnviarConvites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEnviarConvites().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtMensagem;
    // End of variables declaration//GEN-END:variables
}