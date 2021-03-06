/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controle.BancoDados;
import controle.ControleProdutos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Produto;

/**
 *
 * @author zarate
 */
public class CadastroProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProdutos
     */
    
    private BancoDados bd;
    private ControleProdutos controleProdutos;
    public CadastroProdutos(BancoDados bd) throws SQLException {
        initComponents();
        this.bd = bd;
        this.controleProdutos = new ControleProdutos(bd);
    }
    
     private boolean preenchido()
    {
        return !(this.tfd_nome.getText().equals("")||
                this.tfd_categoria.getText().equals(""));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfd_nome = new javax.swing.JTextField();
        tfd_categoria = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Categoria");

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfd_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(tfd_nome))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrar)
                        .addGap(50, 50, 50)
                        .addComponent(btn_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfd_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfd_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_remover)
                    .addComponent(btn_buscar))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        Produto produto = new Produto(this.tfd_nome.getText(), this.tfd_categoria.getText());
        if(preenchido()){
            if(this.controleProdutos.adicionarProduto(produto)){
                JOptionPane.showMessageDialog(this,"Gravado com sucesso");
            }else{
                JOptionPane.showMessageDialog(this,"Cliente ja existe");
            }
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        // TODO add your handling code here:
        String nome = this.tfd_nome.getText();
        try {
            if(this.controleProdutos.removerProduto(nome)){
              JOptionPane.showMessageDialog(this,"Removido com sucesso");
            }else{
              JOptionPane.showMessageDialog(this,"Produto nao existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String nome = this.tfd_nome.getText();
        try {
            Produto produto = this.controleProdutos.buscarProduto(nome);
            this.tfd_categoria.setText(produto.getCategoria());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        BancoDados bd = new BancoDados();
        bd.criarConexao();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroProdutos(bd).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfd_categoria;
    private javax.swing.JTextField tfd_nome;
    // End of variables declaration//GEN-END:variables
}
