/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprestimos.Telas;

/**
 *
 * @author lennonalves
 */
public class TelaGerenciarItens extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    
    public static TelaGerenciarItens instancia;
    
    protected TelaGerenciarItens() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static TelaGerenciarItens getInstancia() {
        if (instancia == null)
            instancia = new TelaGerenciarItens();
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

        lblTituloPagina = new javax.swing.JLabel();
        lblImgMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Itens || Empréstimos entre Amigos");
        setMinimumSize(new java.awt.Dimension(600, 440));
        setName("telaGerenciarItens"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lblTituloPagina.setFont(new java.awt.Font("Zegoe Light - U", 0, 24)); // NOI18N
        lblTituloPagina.setForeground(new java.awt.Color(254, 254, 254));
        lblTituloPagina.setText("Gerenciar Itens || Empréstimos entre Amigos");
        getContentPane().add(lblTituloPagina);
        lblTituloPagina.setBounds(10, 60, 580, 40);

        lblImgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/janela-emprestimos.jpg"))); // NOI18N
        getContentPane().add(lblImgMenu);
        lblImgMenu.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImgMenu;
    private javax.swing.JLabel lblTituloPagina;
    // End of variables declaration//GEN-END:variables
}