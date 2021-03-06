/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import RN.EditorasRN;
import VO.BuscaVO;
import VO.EditorasVO;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaEditoras extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditoras
     */
    
    private static TelaEditoras instancia;
    
    protected TelaEditoras() {
        initComponents();
    }
    
    public static TelaEditoras getInstancia() {
        if (instancia == null)
            instancia = new TelaEditoras();
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
        lblValorInscricao = new javax.swing.JLabel();
        txtEmailEditora = new javax.swing.JTextField();
        txtTelefoneEditora = new javax.swing.JFormattedTextField();
        lblTelefoneEditora = new javax.swing.JLabel();
        txtEnderecoEditora = new javax.swing.JTextField();
        lblEnderecoEditora = new javax.swing.JLabel();
        txtNomeEditora = new javax.swing.JTextField();
        lblNomeEditora = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCNPJEditora = new javax.swing.JLabel();
        txtCNPJEditora = new javax.swing.JTextField();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Cadastro de Editoras");
        setMinimumSize(new java.awt.Dimension(663, 310));
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
        lblImgBuscar.setBounds(580, 0, 40, 40);

        lblBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 10)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(580, 40, 40, 13);

        lblValorInscricao.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblValorInscricao.setForeground(new java.awt.Color(255, 255, 255));
        lblValorInscricao.setText("Email:");
        getContentPane().add(lblValorInscricao);
        lblValorInscricao.setBounds(310, 160, 50, 17);

        txtEmailEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmailEditora);
        txtEmailEditora.setBounds(370, 150, 250, 30);

        try {
            txtTelefoneEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefoneEditora);
        txtTelefoneEditora.setBounds(100, 150, 160, 28);

        lblTelefoneEditora.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblTelefoneEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefoneEditora.setText("Telefone:");
        getContentPane().add(lblTelefoneEditora);
        lblTelefoneEditora.setBounds(20, 160, 70, 17);

        txtEnderecoEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnderecoEditora);
        txtEnderecoEditora.setBounds(100, 110, 520, 30);

        lblEnderecoEditora.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEnderecoEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoEditora.setText("Endereço:");
        getContentPane().add(lblEnderecoEditora);
        lblEnderecoEditora.setBounds(20, 120, 80, 20);

        txtNomeEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeEditora);
        txtNomeEditora.setBounds(100, 70, 370, 28);

        lblNomeEditora.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblNomeEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEditora.setText("Nome:");
        getContentPane().add(lblNomeEditora);
        lblNomeEditora.setBounds(20, 80, 50, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(280, 220, 100, 30);

        btnEditar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(390, 220, 100, 30);

        btnCadastrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(500, 220, 120, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Cadastro de Editoras");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

        lblCNPJEditora.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblCNPJEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJEditora.setText("CNPJ:");
        getContentPane().add(lblCNPJEditora);
        lblCNPJEditora.setBounds(480, 80, 50, 17);

        txtCNPJEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtCNPJEditora);
        txtCNPJEditora.setBounds(530, 70, 90, 28);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoEditoraActionPerformed

    private void txtNomeEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEditoraActionPerformed

    private void txtCNPJEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJEditoraActionPerformed

    private void txtEmailEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailEditoraActionPerformed

    void limparDados() {
        txtCNPJEditora.setText("");
        txtEmailEditora.setText("");
        txtEnderecoEditora.setText("");
        txtNomeEditora.setText("");
        txtTelefoneEditora.setText("");
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparDados();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        EditorasVO evo = EditorasVO.getInstancia();
        evo.setNome(txtNomeEditora.getText());
        evo.setCnpj(txtCNPJEditora.getText());
        evo.setEndereco(txtEnderecoEditora.getText());
        evo.setTelefone(txtTelefoneEditora.getText());
        evo.setEmail(txtEmailEditora.getText());
        
        EditorasRN ern = EditorasRN.getInstancia();
        JOptionPane.showMessageDialog(null, ern.editarEditoras(evo));
        
        limparDados();
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        EditorasVO evo = EditorasVO.getInstancia();
        evo.setNome(txtNomeEditora.getText());
        evo.setCnpj(txtCNPJEditora.getText());
        evo.setEndereco(txtEnderecoEditora.getText());
        evo.setTelefone(txtTelefoneEditora.getText());
        evo.setEmail(txtEmailEditora.getText());
        
        EditorasRN ern = EditorasRN.getInstancia();
        JOptionPane.showMessageDialog(null, ern.cadastrarEditoras(evo));
        
        limparDados();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(2);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(2);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
        
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    void preencheTela(int aux){
        
        if (aux == 1){
            
            EditorasVO evo = EditorasVO.getInstancia();
            EditorasRN ern = EditorasRN.getInstancia();
            ern.atualizaCampos(evo);
            
            txtNomeEditora.setText(evo.getNome());
            txtCNPJEditora.setText(evo.getCnpj());
            txtEnderecoEditora.setText(evo.getEndereco());
            txtTelefoneEditora.setText(evo.getTelefone());
            txtEmailEditora.setText(evo.getEmail());
            
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
            java.util.logging.Logger.getLogger(TelaEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCNPJEditora;
    private javax.swing.JLabel lblEnderecoEditora;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblNomeEditora;
    private javax.swing.JLabel lblTelefoneEditora;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValorInscricao;
    private javax.swing.JTextField txtCNPJEditora;
    private javax.swing.JTextField txtEmailEditora;
    private javax.swing.JTextField txtEnderecoEditora;
    private javax.swing.JTextField txtNomeEditora;
    private javax.swing.JFormattedTextField txtTelefoneEditora;
    // End of variables declaration//GEN-END:variables

}
