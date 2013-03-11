/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.view;

import br.com.ordemDeServico.model.dao.ClienteDao;
import br.com.ordemDeServico.model.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adilson
 */
public class ConsultarCliente extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    ClienteDao daoCliente = new ClienteDao();
    List<Cliente> clientes = new ArrayList<>();
    DefaultTableModel tableModel;

    /**
     * Creates new form ConsultarCliente
     */
    public ConsultarCliente() {
        initComponents();

        setTitle("Consulta Cliente");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
            "Id ", "Nome", "Cpf", "Rg", "Telefone"
        }));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFCPF = new javax.swing.JTextField();
        jBNome = new javax.swing.JButton();
        jBCpf = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Consulta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 654, 110));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));
        getContentPane().add(jTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 434, -1));
        getContentPane().add(jTFCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 82, 231, -1));

        jBNome.setText("Consultar");
        jBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 36, -1, -1));

        jBCpf.setText("Consultar");
        jBCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jBCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 82, -1, -1));

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNomeActionPerformed
        try {
           cliente = daoCliente.selectNome(jTFNome.getText());

            if (cliente.getNome().equals(jTFNome.getText())||true) {
                 tableModel = (DefaultTableModel) jTable1.getModel();
                

                tableModel.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getRg(), cliente.getTelefone()});
                jTable1.setModel(tableModel);


                clientes.add(cliente);


            } else {

                JOptionPane.showMessageDialog(null, "Cliente nao existe");


            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente nao existe");

        }
        jTFNome.setText(null);
        jTFCPF.setText(null);


    }//GEN-LAST:event_jBNomeActionPerformed

    private void jBCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCpfActionPerformed
        try {
            tableModel = (DefaultTableModel) jTable1.getModel();
            cliente = daoCliente.selectCpf(jTFCPF.getText());



            

            tableModel.addRow(new Object[]{cliente.getId(),cliente.getNome(), cliente.getCpf(), cliente.getRg(),cliente.getTelefone()});
            jTable1.setModel(tableModel);


            jTFNome.setText(null);
            jTFCPF.setText(null);

            clientes.add(cliente);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não existe");

        }
    }//GEN-LAST:event_jBCpfActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        tableModel = (DefaultTableModel) jTable1.getModel();



        AlterarCliente altCli = new AlterarCliente();
        altCli.PegarOCliente(cliente);
        altCli.preencherCampos();
        altCli.setVisible(true);
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        tableModel = (DefaultTableModel) jTable1.getModel();

      for(int i = 0 ; i < clientes.size(); i++){

        daoCliente.delete(tableModel.getValueAt(i, 1).toString());
        
        
         
      }
      tableModel.setRowCount(0);
      JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");


    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
               
        System.exit(0);
    }//GEN-LAST:event_jBFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {











        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCliente().setVisible(true);




            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCpf;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
