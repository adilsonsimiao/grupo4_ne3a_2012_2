/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.view;


import br.com.ordemDeServico.model.entity.Veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meritor
 */
public class ConsultarVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarVeiculo.
     */
    
    private Veiculo veiculo;
    
    
    public ConsultarVeiculo() {
        initComponents();
        setTitle("Cadastro veiculo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        cadastrarBotao = new javax.swing.JButton();
        consultarBotao = new javax.swing.JButton();
        alterarBotao = new javax.swing.JButton();
        excluirBotao = new javax.swing.JButton();
        campoPlaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultaVeiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });

        consultarBotao.setText("Consultar");
        consultarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBotaoActionPerformed(evt);
            }
        });

        alterarBotao.setText("Alterar");
        alterarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBotaoActionPerformed(evt);
            }
        });

        excluirBotao.setText("Excluir");
        excluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBotaoActionPerformed(evt);
            }
        });

        campoPlaca.setMaximumSize(new java.awt.Dimension(100, 27));
        campoPlaca.setMinimumSize(new java.awt.Dimension(100, 27));
        campoPlaca.setPreferredSize(new java.awt.Dimension(100, 27));

        tabelaConsultaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "ID veiculo", "ID proprietario", "Marca", "Modelo", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaConsultaVeiculos);
        tabelaConsultaVeiculos.getColumnModel().getColumn(0).setResizable(false);
        tabelaConsultaVeiculos.getColumnModel().getColumn(1).setResizable(false);
        tabelaConsultaVeiculos.getColumnModel().getColumn(2).setResizable(false);
        tabelaConsultaVeiculos.getColumnModel().getColumn(3).setResizable(false);
        tabelaConsultaVeiculos.getColumnModel().getColumn(4).setResizable(false);
        tabelaConsultaVeiculos.getColumnModel().getColumn(5).setResizable(false);

        jLabel1.setText("Placa do veiculo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cadastrarBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alterarBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirBotao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBotao)
                    .addComponent(consultarBotao)
                    .addComponent(alterarBotao)
                    .addComponent(excluirBotao))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        // TODO add your handling code here:
        CadastrarCliente cads = new CadastrarCliente();
        cads.setVisible(true);
        
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void consultarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBotaoActionPerformed
        
        veiculo = new Veiculo();
        
        ArrayList <Veiculo>lista = new ArrayList();
                
        
        
        DefaultTableModel tableModel = (DefaultTableModel) tabelaConsultaVeiculos.getModel();
        tableModel.setRowCount(0);
        
        for(Veiculo veicTemp : lista){
                tableModel.addRow(new Object[]{veicTemp.getPlaca(),veicTemp.getId(),veicTemp.getProprietarioID(),veicTemp.getMarca(),veicTemp.getModelo(),veicTemp.getAno()});
            }
        
        tabelaConsultaVeiculos.setModel(tableModel);
          
    }//GEN-LAST:event_consultarBotaoActionPerformed

    private void alterarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBotaoActionPerformed
        // TODO add your handling code here:
        System.out.println("%");
    }//GEN-LAST:event_alterarBotaoActionPerformed

    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVeiculo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarBotao;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JButton consultarBotao;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaConsultaVeiculos;
    // End of variables declaration//GEN-END:variables
}
