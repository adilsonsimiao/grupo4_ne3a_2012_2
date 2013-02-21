package LP;


import LP.CadastrarCliente;
import LP.Conexão;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adilson
 */
public class Gerenciador extends javax.swing.JFrame {

    /**
     * Creates new form Gerenciador
     */
    public Gerenciador() {
        initComponents();
        bancoDeDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Orcamento = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastrar.setText("Cadastrar ");

        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Cadastrar.add(jMenuItem2);

        jMenuItem4.setText("Ferramento");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Cadastrar.add(jMenuItem4);

        jMenuItem1.setText("Veiculo");
        Cadastrar.add(jMenuItem1);

        jMenuBar2.add(Cadastrar);

        jMenu5.setText("Consultar  ");

        Orcamento.setText("Ferramenta");
        jMenu5.add(Orcamento);

        jMenuItem6.setText("Veiculos");
        jMenu5.add(jMenuItem6);

        jMenuItem5.setText("Cliente");
        jMenu5.add(jMenuItem5);

        jMenuBar2.add(jMenu5);

        jMenu2.setText("Alterar  ");

        jMenu1.setText("Cliente");
        jMenu2.add(jMenu1);

        jMenuItem7.setText("Veiculos");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Ferramenta");
        jMenu2.add(jMenuItem8);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Relatorios  ");
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastrarCliente cadCli = new CadastrarCliente();
        cadCli.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed
  
     private void bancoDeDados() {
           Conexão conexao = new Conexão();
        Connection conn = conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "veiculo("
                    + "id int not null,"
                    + "Nome varchar(60) not null,"
                    + "Ano varchar(60) not null,"
                    + "chassi integer not null,"
                    + "PRIMARY KEY (codigo));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "cliente("
                    + "id varchar(15) not null PRIMARY KEY,"
                    + "nome varchar(60) not null,"
                    + "endereco varchar(255) not null,"
                    + "telefone varchar (15));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "ferramenta(" 
                    + "id(20) int not null ,"
                    + "nome varchar(10) not null,"
                    + "quantidade ,"
                    + "primary key (id));");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciador().setVisible(true);
            }
        });
        
    }
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenuItem Orcamento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
