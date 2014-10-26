/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import PERS.Conexao;
import RN.SessoesRN;
import VO.BuscaVO;
import VO.SessoesVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class TelaSessoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaSessoes
     */
    
    public static TelaSessoes instancia;
    
    protected TelaSessoes() {
        initComponents();
    }
    
    public static TelaSessoes getInstancia() {
        if (instancia == null)
            instancia = new TelaSessoes();
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

        cbAreaSessao = new javax.swing.JComboBox();
        txtHoraSessao = new javax.swing.JFormattedTextField();
        lblHorario = new javax.swing.JLabel();
        btnModerador = new javax.swing.JButton();
        txtModerador = new javax.swing.JTextField();
        lblTema = new javax.swing.JLabel();
        lblModerador = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblImgBuscar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFIP Congressos //Gerenciamento de Sessões");
        setMinimumSize(new java.awt.Dimension(663, 275));
        getContentPane().setLayout(null);

        cbAreaSessao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Foundations of Computer Science", "Software:Theory and Practice", "Education", "Information Technology ", "Communication Systems", "System Modeling and Optimization", "Information Systems", "ICT and Society", "Computer Systems Technology", "Security and Privacy Protection in Information Processing Systems", "Artificial Intelligence", "Human-Computer Interaction", "Entertainment Computing" }));
        getContentPane().add(cbAreaSessao);
        cbAreaSessao.setBounds(150, 110, 280, 28);

        txtHoraSessao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtHoraSessao);
        txtHoraSessao.setBounds(520, 110, 100, 28);

        lblHorario.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario.setText("Horário:");
        getContentPane().add(lblHorario);
        lblHorario.setBounds(460, 110, 60, 20);

        btnModerador.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        btnModerador.setText("...");
        btnModerador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnModerador);
        btnModerador.setBounds(580, 70, 40, 20);

        txtModerador.setEnabled(false);
        getContentPane().add(txtModerador);
        txtModerador.setBounds(140, 70, 430, 28);

        lblTema.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblTema.setForeground(new java.awt.Color(255, 255, 255));
        lblTema.setText("Área da Sessão:");
        getContentPane().add(lblTema);
        lblTema.setBounds(20, 110, 120, 20);

        lblModerador.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblModerador.setForeground(new java.awt.Color(255, 255, 255));
        lblModerador.setText("Moderador:");
        getContentPane().add(lblModerador);
        lblModerador.setBounds(20, 70, 110, 17);

        btnCancelar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(280, 170, 100, 30);

        btnEditar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(390, 170, 100, 30);

        btnCadastrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(500, 170, 120, 30);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Gerenciamento de Sessões");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 480, 29);

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

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 680, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeradorActionPerformed
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(11);
        
        this.setVisible(false);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_btnModeradorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(7);
        
        this.setVisible(false);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.setDefinirTela(7);
        
        this.setVisible(false);
        
        TelaBuscar telaBuscar = TelaBuscar.getInstancia();
        telaBuscar.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        SessoesVO svo = SessoesVO.getInstancia();
        svo.setModerador(txtModerador.getText());
        svo.setArea((String) cbAreaSessao.getSelectedItem());
        svo.setHorario(txtHoraSessao.getText());
        
        SessoesRN srn = SessoesRN.getInstancia();
        JOptionPane.showMessageDialog(null, srn.editarSessao(svo));
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        SessoesVO svo = SessoesVO.getInstancia();
        svo.setModerador(txtModerador.getText());
        svo.setArea((String) cbAreaSessao.getSelectedItem());
        svo.setHorario(txtHoraSessao.getText());
        
        SessoesRN srn = SessoesRN.getInstancia();
        JOptionPane.showMessageDialog(null, srn.cadastrarSessao(svo));
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    void preencheTela(int aux){
        if (aux == 1){
            
            SessoesVO svo = SessoesVO.getInstancia();
            SessoesRN srn = SessoesRN.getInstancia();
            srn.atualizaCampos(svo);
            
            txtModerador.setText(svo.getModerador());
            cbAreaSessao.setSelectedItem(svo.getArea());
            txtHoraSessao.setText(svo.getHorario());
            
        }
    }
    
    void preencheModerador(int aux){
        if (aux == 1){
            
            SessoesVO svo = SessoesVO.getInstancia();
            SessoesRN srn = SessoesRN.getInstancia();
            srn.atualizaModerador(svo);
            
            txtModerador.setText(svo.getModerador());
            cbAreaSessao.setSelectedItem(svo.getArea());
            txtHoraSessao.setText(svo.getHorario());
            
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
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSessoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnModerador;
    private javax.swing.JComboBox cbAreaSessao;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblModerador;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JFormattedTextField txtHoraSessao;
    private javax.swing.JTextField txtModerador;
    // End of variables declaration//GEN-END:variables

}
