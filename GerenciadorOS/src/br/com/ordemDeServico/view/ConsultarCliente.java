package br.com.ordemDeServico.view;

import br.com.ordemDeServico.model.dao.ClienteDao;
import br.com.ordemDeServico.model.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarCliente extends javax.swing.JDialog {

    ClienteDao cliDao;
    List<Cliente> clientes;
    Cliente cliente = new Cliente();
    DefaultTableModel tableModel;

    public ConsultarCliente() {
        initComponents();
        clientes = new ArrayList<>();
        cliDao = new ClienteDao();
        setTitle("Consulta Cliente");

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
            "Id ", "Nome", "Cpf", "Rg"
        }));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jBCpf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jBExcluir = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBTConsulNome = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("CONSULTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel1.setText("NOME:");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        jBCpf.setText("CONSULTAR");
        jBCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCpfActionPerformed(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        jTableCliente.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTableCliente.getColumnModel().getColumn(1).setHeaderValue("NOME");
        jTableCliente.getColumnModel().getColumn(2).setHeaderValue("RG");
        jTableCliente.getColumnModel().getColumn(3).setHeaderValue("CPF");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBTConsulNome.setText("CONSULTAR");
        jBTConsulNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTConsulNomeActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBTConsulNome))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jBCpf)))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Consultar)
                        .addGap(47, 47, 47)
                        .addComponent(jBAlterar)
                        .addGap(56, 56, 56)
                        .addComponent(jBExcluir)
                        .addGap(30, 30, 30)
                        .addComponent(jBFechar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTConsulNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCpf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFechar)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar)
                    .addComponent(Consultar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        a.addTab("CLIENTE", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(a)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
       
         
        tableModel = (DefaultTableModel) jTableCliente.getModel();
        
        int row = jTableCliente.getSelectedRow();
         
          
        for (Cliente cliente1 : clientes) {
           // System.out.println(clientes.toString());
            if (((int)this.jTableCliente.getValueAt(row, 0))==cliente1.getId()) {
                CadastrarCliente cadastrarCliente = new CadastrarCliente();
                       cadastrarCliente.setVisible(true);
                       
                       
                       cadastrarCliente.setCliente(cliente1);
              
               
            }
       
    }//GEN-LAST:event_jBAlterarActionPerformed
    }
    private void jBTConsulNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTConsulNomeActionPerformed
          
        if (jTFNome.getText() == null) {
            JOptionPane.showMessageDialog(null, "Digite  um campo para pesquisar" + jTFNome.getText());

        }
                 
          
        try {
            
            tableModel = (DefaultTableModel) jTableCliente.getModel();
            this.clientes = cliDao.buscarNome(jTFNome.getText());
            for (Cliente cliente1 : clientes) {
                tableModel.addRow(new Object[]{cliente1.getId(), cliente1.getNome(), cliente1.getCpf(), cliente1.getRg()});
                jTableCliente.setModel(tableModel);
                
            }
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não existe"+JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jBTConsulNomeActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

        tableModel = (DefaultTableModel) jTableCliente.getModel();
        int row = jTableCliente.getSelectedRow();


        for (Cliente cliente1 : clientes) {
            if (((int)this.jTableCliente.getValueAt(row, 0))==cliente1.getId()) {
                System.out.println("deu certo");
                 cliDao.delete(cliente1);
                tableModel.removeRow(row);  
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
               
                break;
            }
           

        }

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCpfActionPerformed

        try {

            tableModel = (DefaultTableModel) jTableCliente.getModel();
            clientes = cliDao.buscarCpf(jFormattedTextField1.getText());
            for (Cliente cliente1 : clientes) {

                tableModel.addRow(new Object[]{cliente1.getId(), cliente1.getNome(), cliente1.getCpf(), cliente1.getRg()});
                jTableCliente.setModel(tableModel);


            }


            jTFNome.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não existe");

        }

    }//GEN-LAST:event_jBCpfActionPerformed

    public static void main(String[] args) {
        new ConsultarCliente().setVisible(true);
    }

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
       if (jTFNome.getText() == null) {
            JOptionPane.showMessageDialog(null, "Digite  um campo para pesquisar" + jTFNome.getText());

        }


        try {

            tableModel = (DefaultTableModel) jTableCliente.getModel();
            this.clientes = cliDao.retrieveAll();
            for (Cliente cliente1 : clientes) {
                tableModel.addRow(new Object[]{cliente1.getId(), cliente1.getNome(), cliente1.getCpf(), cliente1.getRg()});
                jTableCliente.setModel(tableModel);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Clientes não existem");
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JTabbedPane a;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCpf;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBTConsulNome;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
