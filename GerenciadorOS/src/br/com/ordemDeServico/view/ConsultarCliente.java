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
import javax.swing.table.TableModel;




/**
 *
 * @author adilson
 */
public class ConsultarCliente extends javax.swing.JFrame{
   
   Cliente cliente = new Cliente();    
 ClienteDao daoCliente = new ClienteDao() ;   
       
  
   
    
   
   
    /**
     * Creates new form ConsultarCliente
     */
    public ConsultarCliente() {
        initComponents();
        
        setTitle("Consulta Cliente");
        
           jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id ", "Nome", "Cpf", "Rg","Telefone"
            }
        ));
        
       
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 48, -1, -1));

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

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jButton2.setText("Fechar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNomeActionPerformed
        try {


            cliente = daoCliente.selectNome(jTFNome.getText());
           
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

            int id = cliente.getId();
            String nome = cliente.getNome();
            String cpf = cliente.getCpf();
            String rg = cliente.getRg();
            String telefone = cliente.getTelefone();


            tableModel.addRow(new Object[]{id,nome,cpf, rg, telefone});
            
            
            jTable1.setModel(tableModel);
          

            jTFNome.setText(null);
            jTFCPF.setText(null);
      

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro");

        }

         
    }//GEN-LAST:event_jBNomeActionPerformed

    private void jBCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCpfActionPerformed
       try {
           
        cliente = daoCliente.selectCpf(jTFCPF.getText());
            List<Cliente> clientes = new ArrayList<>();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

            int id = cliente.getId();
            String nome = cliente.getNome();
            String cpf = cliente.getCpf();
            String rg = cliente.getRg();
            String telefone = cliente.getTelefone();


            tableModel.addRow(new Object[]{new Integer(id), new String(nome), new String(cpf), new String(rg), new String(telefone)});
            jTable1.setModel(tableModel);


            jTFNome.setText(null);
            jTFCPF.setText(null);
            
            clientes.add(cliente);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro");

        }
    }//GEN-LAST:event_jBCpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

  
        
        
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
    private javax.swing.JButton jBCpf;
    private javax.swing.JButton jBNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
