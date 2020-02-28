/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controle.BancoDados;
import controle.ControleClientes;
import controle.ControleFuncionarios;
import controle.ControlePedidos;
import controle.ControleProdutos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cliente;
import models.Funcionario;
import models.Pedido;
import models.Produto;

/**
 *
 * @author zarate
 */
public class CadastroPedidos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPedidos
     */
    private BancoDados bd;
    private ControlePedidos controlePedidos;
    private ControleClientes controleClientes;
    private ControleFuncionarios controleFuncionarios;
    private ControleProdutos controleProdutos;
    public CadastroPedidos(BancoDados bd) throws SQLException {
        initComponents();
        this.bd = bd;
        this.controlePedidos = new ControlePedidos(bd);
        this.controleClientes = new ControleClientes(bd);
        this.controleFuncionarios = new ControleFuncionarios(bd);
        this.controleProdutos = new ControleProdutos(bd);
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
        lb_nomeCliente = new javax.swing.JLabel();
        tfd_nomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfd_cpfCliente = new javax.swing.JTextField();
        btn_buscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfd_nomeFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfd_cpfFuncionario = new javax.swing.JTextField();
        btn_buscarFuncionario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfd_nomeProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfd_categoriaProduto = new javax.swing.JTextField();
        btn_buscarProduto = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfd_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfd_data = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cliente:");

        lb_nomeCliente.setText("Nome");

        jLabel3.setText("CPF");

        btn_buscarCliente.setText("Buscar");
        btn_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Funcionario:");

        jLabel4.setText("Nome");

        jLabel5.setText("CPF");

        btn_buscarFuncionario.setText("Buscar");
        btn_buscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarFuncionarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Produto:");

        jLabel7.setText("Nome");

        jLabel8.setText("Categoria");

        tfd_categoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_categoriaProdutoActionPerformed(evt);
            }
        });

        btn_buscarProduto.setText("Buscar");
        btn_buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProdutoActionPerformed(evt);
            }
        });

        btn_cadastrar.setText("Fazer Pedido");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover Pedido");

        jLabel9.setText("Pedido:");

        jLabel10.setText("id");

        jLabel11.setText("data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_nomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_nomeFuncionario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfd_nomeProduto)
                                    .addComponent(tfd_id))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfd_cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tfd_cpfFuncionario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfd_categoriaProduto)
                                    .addComponent(tfd_data))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscarCliente)
                            .addComponent(btn_buscarFuncionario)
                            .addComponent(btn_buscarProduto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrar)
                        .addGap(52, 52, 52)
                        .addComponent(btn_remover)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_nomeCliente)
                    .addComponent(tfd_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfd_cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCliente))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(tfd_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfd_cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarFuncionario))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(tfd_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfd_categoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(tfd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfd_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_remover))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_categoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_categoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_categoriaProdutoActionPerformed

    private void btn_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarClienteActionPerformed
        // TODO add your handling code here:
        String nome = this.tfd_nomeCliente.getText();
        Cliente client;
        try {
            client = this.controleClientes.buscarCliente(nome);
            this.tfd_cpfCliente.setText(client.getCpf());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_buscarClienteActionPerformed

    private void btn_buscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarFuncionarioActionPerformed
        // TODO add your handling code here:
        String nome = this.tfd_nomeFuncionario.getText();
        try {
            Funcionario funcionario = this.controleFuncionarios.buscarFuncionario(nome);
            this.tfd_cpfFuncionario.setText(funcionario.getCpf());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_buscarFuncionarioActionPerformed

    private void btn_buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProdutoActionPerformed
        // TODO add your handling code here:
        String nome = this.tfd_nomeProduto.getText();
        try {
            Produto produto = this.controleProdutos.buscarProduto(nome);
            this.tfd_categoriaProduto.setText(produto.getCategoria());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarProdutoActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        Cliente cliente = null;
        Produto produto = null;
        Funcionario funcionario = null;
        try {
            // TODO add your handling code here:
            cliente = this.controleClientes.buscarCliente(this.tfd_nomeCliente.getText());
            System.out.println(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            funcionario = this.controleFuncionarios.buscarFuncionario(this.tfd_nomeFuncionario.getText());
            System.out.println(funcionario);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            produto = this.controleProdutos.buscarProduto(this.tfd_nomeProduto.getText());
            System.out.println(produto);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pedido pedido = new Pedido(Integer.parseInt(this.tfd_id.getText()), this.tfd_data.getText(), this.bd);
        try {
            pedido.incluirCliente(cliente.getNome());
            pedido.incluirFuncionario(funcionario.getNome());
            pedido.incluirProduto(produto.getNome());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.controlePedidos.adicionarPedido(pedido);
        System.out.println(pedido);
    }//GEN-LAST:event_btn_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        BancoDados bd = new BancoDados();
        bd.criarConexao();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               CadastroPedidos pedidos = null;
                try {
                    pedidos = new CadastroPedidos(bd);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroPedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
               pedidos.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarCliente;
    private javax.swing.JButton btn_buscarFuncionario;
    private javax.swing.JButton btn_buscarProduto;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JTextField tfd_categoriaProduto;
    private javax.swing.JTextField tfd_cpfCliente;
    private javax.swing.JTextField tfd_cpfFuncionario;
    private javax.swing.JTextField tfd_data;
    private javax.swing.JTextField tfd_id;
    private javax.swing.JTextField tfd_nomeCliente;
    private javax.swing.JTextField tfd_nomeFuncionario;
    private javax.swing.JTextField tfd_nomeProduto;
    // End of variables declaration//GEN-END:variables
}