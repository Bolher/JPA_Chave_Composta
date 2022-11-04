/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import DAO.ProdutoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author bolhe
 */
public class ProdutoView extends javax.swing.JDialog {
    
    private Produto produto = new Produto();
    private List<Produto> listaProduto;
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public ProdutoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pesquisa = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        ButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("                                                   Produto");

        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descricao", "Valor" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        ButtonPesquisar.setText("Pesquisar");
        ButtonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPesquisarMouseClicked(evt);
            }
        });
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });
        ButtonPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonPesquisarKeyPressed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao", "Valor", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaActionPerformed

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed
        if(Pesquisa.getText().equals("")){
            System.out.println("informe alguma coisa no campo pesquisa para a pesquisa ser realizada");
        
        }else if(ComboBox.getSelectedIndex() == 0){
            listaProduto = produtoDAO.findByDescricao(Pesquisa.getText());
            this.atualizarTabela();
        }else if(ComboBox.getSelectedIndex() == 1){
            listaProduto = produtoDAO.findByValor(Double.parseDouble(Pesquisa.getText()));
            this.atualizarTabela();
        }
 
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void ButtonPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonPesquisarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPesquisarKeyPressed

    private void ButtonPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPesquisarMouseClicked

    }//GEN-LAST:event_ButtonPesquisarMouseClicked

    
    private void atualizarTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        for (Produto produto : listaProduto) {
            modelo.addRow(new Object[] {produto.getId(),produto.getDescricao(),produto.getValor(), produto.getQuantidade()});
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutoView dialog = new ProdutoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
