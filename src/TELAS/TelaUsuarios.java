/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import RN.UsuariosRN;
import VO.BuscaVO;
import VO.UsuariosVO;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuarios
     */
    
    public static TelaUsuarios instancia;
    
    protected TelaUsuarios() {
        initComponents();
    }
    
    public static TelaUsuarios getInstancia() {
        if (instancia == null)
            instancia = new TelaUsuarios();
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

        lblImgBuscar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        cbFuncaoUser = new javax.swing.JComboBox();
        lblFuncaoUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtSenhaUser = new javax.swing.JTextField();
        lblSenhaUser = new javax.swing.JLabel();
        txtNomeUser = new javax.swing.JTextField();
        lblNomeUser = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 315));
        getContentPane().setLayout(null);

        lblImgBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblImgBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblImgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/lupa32.png"))); // NOI18N
        lblImgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblImgBuscar);
        lblImgBuscar.setBounds(410, 0, 40, 40);

        lblBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 10)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(410, 40, 40, 13);

        cbFuncaoUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avaliador", "Comite de Programa", "Comite Organizador" }));
        getContentPane().add(cbFuncaoUser);
        cbFuncaoUser.setBounds(100, 150, 350, 28);

        lblFuncaoUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblFuncaoUser.setForeground(new java.awt.Color(255, 255, 255));
        lblFuncaoUser.setText("Função:");
        getContentPane().add(lblFuncaoUser);
        lblFuncaoUser.setBounds(20, 150, 70, 20);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(100, 110, 160, 28);

        lblUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário:");
        getContentPane().add(lblUser);
        lblUser.setBounds(20, 110, 60, 17);

        txtSenhaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenhaUser);
        txtSenhaUser.setBounds(330, 110, 120, 28);

        lblSenhaUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblSenhaUser.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaUser.setText("Senha:");
        getContentPane().add(lblSenhaUser);
        lblSenhaUser.setBounds(270, 110, 50, 20);

        txtNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeUser);
        txtNomeUser.setBounds(100, 70, 350, 28);

        lblNomeUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblNomeUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUser.setText("Nome:");
        getContentPane().add(lblNomeUser);
        lblNomeUser.setBounds(20, 70, 50, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(110, 210, 100, 30);

        btnEditar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(220, 210, 100, 30);

        btnCadastrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(330, 210, 120, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Cadastro de Usuários");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 560, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(5);
        
        this.setVisible(false);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(5);
        
        this.setVisible(false);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtSenhaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUserActionPerformed

    private void txtNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUserActionPerformed

    void limparDados() {
        txtNomeUser.setText("");
        txtSenhaUser.setText("");
        txtUser.setText("");
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        UsuariosVO uvo = UsuariosVO.getInstancia();
        uvo.setNome(txtNomeUser.getText());
        uvo.setUsuario(txtUser.getText());
        uvo.setSenha(txtSenhaUser.getText());
        uvo.setFuncao((String) cbFuncaoUser.getSelectedItem());
        
        UsuariosRN urn = UsuariosRN.getInstancia();
        JOptionPane.showMessageDialog(null, urn.editaUsuario(uvo));
        
        limparDados();
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        UsuariosVO uvo = UsuariosVO.getInstancia();
        uvo.setNome(txtNomeUser.getText());
        uvo.setUsuario(txtUser.getText());
        uvo.setSenha(txtSenhaUser.getText());
        uvo.setFuncao((String) cbFuncaoUser.getSelectedItem());
        
        UsuariosRN urn = UsuariosRN.getInstancia();
        JOptionPane.showMessageDialog(null, urn.cadastraUsuario(uvo));
        
        limparDados();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    void preencheTela(int aux){
        if (aux == 1){
            
            UsuariosVO uvo = UsuariosVO.getInstancia();
            UsuariosRN urn = UsuariosRN.getInstancia();
            urn.atualizaCampos(uvo);
            
            txtNomeUser.setText(uvo.getNome());
            txtUser.setText(uvo.getUsuario());
            txtSenhaUser.setText(uvo.getSenha());
            cbFuncaoUser.setSelectedItem(uvo.getFuncao());
            
        }
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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cbFuncaoUser;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFuncaoUser;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblSenhaUser;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtNomeUser;
    private javax.swing.JTextField txtSenhaUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
