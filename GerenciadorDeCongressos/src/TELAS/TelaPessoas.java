/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import PERS.Conexao;
import RN.BuscaRN;
import RN.PessoasRN;
import VO.BuscaVO;
import VO.PessoasVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaPessoas extends javax.swing.JFrame {

    /**
     * Creates new form TelaPessoas
     */
    
    public static TelaPessoas instancia;
    
    protected TelaPessoas() {
        initComponents();
    }

    public static TelaPessoas getInstancia() {
        if (instancia == null)
            instancia = new TelaPessoas();
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

        cbArea3 = new javax.swing.JComboBox();
        cbArea2 = new javax.swing.JComboBox();
        cbArea1 = new javax.swing.JComboBox();
        lblInformacoes = new javax.swing.JLabel();
        lblInformacoes2 = new javax.swing.JLabel();
        lblInstituicaoPessoa = new javax.swing.JLabel();
        txtInstituicaoPessoa = new javax.swing.JTextField();
        lblAreaPessoa = new javax.swing.JLabel();
        cbFuncao = new javax.swing.JComboBox();
        txtTipoPessoa = new javax.swing.JLabel();
        lblImgBuscar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblEmailPessoa = new javax.swing.JLabel();
        txtEmailPessoa = new javax.swing.JTextField();
        txtTelefonePessoa = new javax.swing.JFormattedTextField();
        lblTelefonePessoa = new javax.swing.JLabel();
        txtEnderecoPessoa = new javax.swing.JTextField();
        lblEnderecoPessoa = new javax.swing.JLabel();
        txtNomePessoa = new javax.swing.JTextField();
        lblNomePessoa = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Cadastro de Pessoas");
        setMinimumSize(new java.awt.Dimension(663, 420));
        getContentPane().setLayout(null);

        cbArea3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Foundations of Computer Science", "Software:Theory and Practice", "Education", "Information Technology ", "Communication Systems", "System Modeling and Optimization", "Information Systems", "ICT and Society", "Computer Systems Technology", "Security and Privacy Protection in Information Processing Systems", "Artificial Intelligence", "Human-Computer Interaction", "Entertainment Computing" }));
        getContentPane().add(cbArea3);
        cbArea3.setBounds(490, 280, 130, 28);

        cbArea2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Foundations of Computer Science", "Software:Theory and Practice", "Education", "Information Technology ", "Communication Systems", "System Modeling and Optimization", "Information Systems", "ICT and Society", "Computer Systems Technology", "Security and Privacy Protection in Information Processing Systems", "Artificial Intelligence", "Human-Computer Interaction", "Entertainment Computing" }));
        getContentPane().add(cbArea2);
        cbArea2.setBounds(350, 280, 130, 28);

        cbArea1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Foundations of Computer Science", "Software:Theory and Practice", "Education", "Information Technology ", "Communication Systems", "System Modeling and Optimization", "Information Systems", "ICT and Society", "Computer Systems Technology", "Security and Privacy Protection in Information Processing Systems", "Artificial Intelligence", "Human-Computer Interaction", "Entertainment Computing" }));
        getContentPane().add(cbArea1);
        cbArea1.setBounds(200, 280, 140, 28);

        lblInformacoes.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblInformacoes.setForeground(new java.awt.Color(255, 102, 0));
        lblInformacoes.setText("*Preenchimento SOMENTE para avaliador e moderador.");
        getContentPane().add(lblInformacoes);
        lblInformacoes.setBounds(230, 310, 381, 20);

        lblInformacoes2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblInformacoes2.setForeground(new java.awt.Color(255, 102, 0));
        lblInformacoes2.setText("*Preenchimento SOMENTE para autor e avaliador.");
        getContentPane().add(lblInformacoes2);
        lblInformacoes2.setBounds(270, 260, 350, 20);

        lblInstituicaoPessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblInstituicaoPessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblInstituicaoPessoa.setText("Instituição:");
        getContentPane().add(lblInstituicaoPessoa);
        lblInstituicaoPessoa.setBounds(20, 230, 80, 20);

        txtInstituicaoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituicaoPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtInstituicaoPessoa);
        txtInstituicaoPessoa.setBounds(110, 230, 510, 30);

        lblAreaPessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblAreaPessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaPessoa.setText("Área de Conhecimento:");
        getContentPane().add(lblAreaPessoa);
        lblAreaPessoa.setBounds(20, 280, 170, 20);

        cbFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Autor", "Avaliador", "Moderador", "Participante" }));
        getContentPane().add(cbFuncao);
        cbFuncao.setBounds(110, 190, 160, 28);

        txtTipoPessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        txtTipoPessoa.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoPessoa.setText("Função:");
        getContentPane().add(txtTipoPessoa);
        txtTipoPessoa.setBounds(20, 190, 60, 17);

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

        lblEmailPessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEmailPessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailPessoa.setText("Email:");
        getContentPane().add(lblEmailPessoa);
        lblEmailPessoa.setBounds(310, 150, 50, 17);

        txtEmailPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmailPessoa);
        txtEmailPessoa.setBounds(370, 150, 250, 28);

        try {
            txtTelefonePessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefonePessoa);
        txtTelefonePessoa.setBounds(110, 150, 160, 28);

        lblTelefonePessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblTelefonePessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonePessoa.setText("Telefone:");
        getContentPane().add(lblTelefonePessoa);
        lblTelefonePessoa.setBounds(20, 150, 60, 17);

        txtEnderecoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnderecoPessoa);
        txtEnderecoPessoa.setBounds(110, 110, 510, 30);

        lblEnderecoPessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblEnderecoPessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblEnderecoPessoa.setText("Endereço:");
        getContentPane().add(lblEnderecoPessoa);
        lblEnderecoPessoa.setBounds(20, 110, 80, 20);

        txtNomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomePessoa);
        txtNomePessoa.setBounds(110, 70, 510, 28);

        lblNomePessoa.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblNomePessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePessoa.setText("Nome:");
        getContentPane().add(lblNomePessoa);
        lblNomePessoa.setBounds(20, 70, 50, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(280, 340, 100, 30);

        btnEditar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(390, 340, 100, 30);

        btnCadastrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(500, 340, 120, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Cadastro de Pessoas");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailPessoaActionPerformed

    private void txtEnderecoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoPessoaActionPerformed

    private void txtNomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePessoaActionPerformed

    private void txtInstituicaoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituicaoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituicaoPessoaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(3);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(3);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        PessoasVO pvo = PessoasVO.getInstancia();
        pvo.setNome(txtNomePessoa.getText());
        pvo.setEndereco(txtEnderecoPessoa.getText());
        pvo.setTelefone(txtTelefonePessoa.getText());
        pvo.setEmail(txtEmailPessoa.getText());
        pvo.setFuncao((String) cbFuncao.getSelectedItem());
        pvo.setInstituicao(txtInstituicaoPessoa.getText());
        pvo.setArea1((String) cbArea1.getSelectedItem());
        pvo.setArea2((String) cbArea2.getSelectedItem());
        pvo.setArea3((String) cbArea3.getSelectedItem());
                
        PessoasRN prn = PessoasRN.getInstancia();
        JOptionPane.showMessageDialog(null, prn.editaPessoas(pvo));
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        PessoasVO pvo = PessoasVO.getInstancia();
        pvo.setNome(txtNomePessoa.getText());
        pvo.setEndereco(txtEnderecoPessoa.getText());
        pvo.setTelefone(txtTelefonePessoa.getText());
        pvo.setEmail(txtEmailPessoa.getText());
        pvo.setFuncao((String) cbFuncao.getSelectedItem());
        pvo.setInstituicao(txtInstituicaoPessoa.getText());
        pvo.setArea1((String) cbArea1.getSelectedItem());
        pvo.setArea2((String) cbArea2.getSelectedItem());
        pvo.setArea3((String) cbArea3.getSelectedItem());
        
        PessoasRN prn = PessoasRN.getInstancia();
        JOptionPane.showMessageDialog(null, prn.cadastraPessoas(pvo));
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    void preencheTela(int aux){
        if (aux == 1){
            
            PessoasVO pvo = PessoasVO.getInstancia();
            PessoasRN prn = PessoasRN.getInstancia();
            prn.atualizaCampos(pvo);
            
            txtNomePessoa.setText(pvo.getNome());
            txtEnderecoPessoa.setText(pvo.getEndereco());
            txtTelefonePessoa.setText(pvo.getTelefone());
            txtEmailPessoa.setText(pvo.getEmail());
            cbFuncao.setSelectedItem(pvo.getFuncao());
            txtInstituicaoPessoa.setText(pvo.getInstituicao());
            cbArea1.setSelectedItem(pvo.getArea1());
            cbArea2.setSelectedItem(pvo.getArea2());
            cbArea3.setSelectedItem(pvo.getArea3());
            
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
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cbArea1;
    private javax.swing.JComboBox cbArea2;
    private javax.swing.JComboBox cbArea3;
    private javax.swing.JComboBox cbFuncao;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblAreaPessoa;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEmailPessoa;
    private javax.swing.JLabel lblEnderecoPessoa;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblInformacoes2;
    private javax.swing.JLabel lblInstituicaoPessoa;
    private javax.swing.JLabel lblNomePessoa;
    private javax.swing.JLabel lblTelefonePessoa;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmailPessoa;
    private javax.swing.JTextField txtEnderecoPessoa;
    private javax.swing.JTextField txtInstituicaoPessoa;
    private javax.swing.JTextField txtNomePessoa;
    private javax.swing.JFormattedTextField txtTelefonePessoa;
    private javax.swing.JLabel txtTipoPessoa;
    // End of variables declaration//GEN-END:variables

}
