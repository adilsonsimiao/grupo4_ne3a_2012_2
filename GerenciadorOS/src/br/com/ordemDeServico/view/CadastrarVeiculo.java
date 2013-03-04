/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.view;

import br.com.ordemDeServico.model.entity.Veiculo;
import br.com.ordemDeServico.model.entity.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class CadastrarVeiculo extends javax.swing.JFrame {
    
    private Veiculo veiculo;

    /**
     * Creates new form CadastrarVeiculo
     */
    public CadastrarVeiculo() {
        initComponents();
        setTitle("Cadastro veiculo:");
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
        cadastrarVeiculo = new javax.swing.JButton();
        alterarVeiculo = new javax.swing.JButton();
        consultarVeiculo = new javax.swing.JButton();
        excluirVeiculo = new javax.swing.JButton();
        labelVeiculoID = new javax.swing.JLabel();
        campoVeiculoID = new javax.swing.JTextField();
        campoProprietarioID = new javax.swing.JTextField();
        labelProprietarioID = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        campoAno = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarVeiculo.setText("Cadastrar");
        cadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarVeiculoActionPerformed(evt);
            }
        });

        alterarVeiculo.setText("Alterar");

        consultarVeiculo.setText("Consultar");
        consultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarVeiculoActionPerformed(evt);
            }
        });

        excluirVeiculo.setText("Excluir");

        labelVeiculoID.setText("Veiculo ID:");

        campoVeiculoID.setMinimumSize(new java.awt.Dimension(90, 27));
        campoVeiculoID.setPreferredSize(new java.awt.Dimension(90, 27));
        campoVeiculoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoVeiculoIDActionPerformed(evt);
            }
        });

        campoProprietarioID.setMinimumSize(new java.awt.Dimension(90, 27));
        campoProprietarioID.setPreferredSize(new java.awt.Dimension(90, 27));
        campoProprietarioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProprietarioIDActionPerformed(evt);
            }
        });

        labelProprietarioID.setText("Proprietario ID:");

        labelMarca.setText("Marca:");

        campoMarca.setPreferredSize(new java.awt.Dimension(350, 27));

        campoModelo.setPreferredSize(new java.awt.Dimension(340, 27));

        labelModelo.setText("Modelo:");

        campoAno.setPreferredSize(new java.awt.Dimension(364, 27));

        labelAno.setText("Ano:");

        campoPlaca.setPreferredSize(new java.awt.Dimension(355, 27));

        labelPlaca.setText("Placa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(cadastrarVeiculo)
                        .addGap(25, 25, 25)
                        .addComponent(alterarVeiculo)
                        .addGap(25, 25, 25)
                        .addComponent(consultarVeiculo)
                        .addGap(25, 25, 25)
                        .addComponent(excluirVeiculo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelVeiculoID)
                        .addGap(18, 18, 18)
                        .addComponent(campoVeiculoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProprietarioID)
                        .addGap(18, 18, 18)
                        .addComponent(campoProprietarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMarca)
                        .addGap(18, 18, 18)
                        .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModelo)
                        .addGap(18, 18, 18)
                        .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAno)
                        .addGap(18, 18, 18)
                        .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPlaca)
                        .addGap(18, 18, 18)
                        .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarVeiculo)
                    .addComponent(alterarVeiculo)
                    .addComponent(consultarVeiculo)
                    .addComponent(excluirVeiculo))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVeiculoID)
                    .addComponent(campoVeiculoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProprietarioID)
                    .addComponent(campoProprietarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarVeiculoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        
        this.veiculo = new Veiculo();
        
        this.campoVeiculoID.setText(String.valueOf(this.veiculo.getId()));
        this.campoProprietarioID.setText(String.valueOf(this.veiculo.getProprietarioID()));
        this.campoMarca.setText(this.veiculo.getMarca());
        this.campoModelo.setText(this.veiculo.getModelo());
        this.campoAno.setText(String.valueOf(this.veiculo.getAno()));
        this.campoPlaca.setText(this.veiculo.getPlaca());
        
    }//GEN-LAST:event_consultarVeiculoActionPerformed

    private void cadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarVeiculoActionPerformed
        // TODO add your handling code here:
        this.veiculo = new Veiculo();
        
        this.veiculo.setId(Long.parseLong(campoVeiculoID.getText()));
        this.veiculo.setProprietarioID(Long.parseLong(campoProprietarioID.getText()));
        this.veiculo.setMarca(campoMarca.getText());
        this.veiculo.setModelo(campoModelo.getText());
        this.veiculo.setAno(Integer.parseInt(campoAno.getText()));
        this.veiculo.setPlaca(campoPlaca.getText());
        
        JOptionPane.showMessageDialog(null, "Veiculo cadastrado.");
        limparCampos();
    }//GEN-LAST:event_cadastrarVeiculoActionPerformed

    private void campoProprietarioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProprietarioIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProprietarioIDActionPerformed

    private void campoVeiculoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoVeiculoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoVeiculoIDActionPerformed

    
    private void limparCampos(){
        
        this.campoVeiculoID.setText(null);
        this.campoProprietarioID.setText(null);
        this.campoMarca.setText(null);
        this.campoModelo.setText(null);
        this.campoAno.setText(null);
        this.campoPlaca.setText(null);
        
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
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarVeiculo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarVeiculo;
    private javax.swing.JButton cadastrarVeiculo;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoProprietarioID;
    private javax.swing.JTextField campoVeiculoID;
    private javax.swing.JButton consultarVeiculo;
    private javax.swing.JButton excluirVeiculo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelProprietarioID;
    private javax.swing.JLabel labelVeiculoID;
    // End of variables declaration//GEN-END:variables
}
