/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ordemDeServico.view;

import br.com.ordemDeServico.model.dao.ClienteDao;
import Util.ValidacaoView;
import javax.swing.JOptionPane;
import br.com.ordemDeServico.model.entity.Cliente;
import br.com.ordemDeServico.model.entity.Endereco;
import br.com.ordemDeServico.model.entity.Telefone;
import br.com.ordemDeServico.model.entity.Veiculo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adilsoon
 */
public class CadastrarCliente extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    Endereco endereco = new Endereco();
    Telefone telefone = new Telefone();
    ClienteDao clienteDao = new ClienteDao();
    Veiculo veiculo = new Veiculo();
    ValidacaoView validar = new ValidacaoView();
    List<Telefone> tel = new ArrayList<>();
    List<Veiculo> veiculos = new ArrayList<>();

    public CadastrarCliente() {
        initComponents();

    }

    public void setCliente(Cliente cli) {
        this.preencheTelaCadastro(cli);
        this.cliente = cli;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        labelRg = new javax.swing.JLabel();
        jTFCPF = new javax.swing.JFormattedTextField();
        jTFRG = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCbUF = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTFormaCep = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jFormaDD = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFormaNumero = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jFormaComercial = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTFormaNumero = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTfMARCA = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTFANO = new javax.swing.JTextField();
        jTFMODELO = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTFPLACA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBTCadastrar = new javax.swing.JButton();
        jBTFechar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setText("NOME: *");
        jPanel2.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, -1));
        jPanel2.add(jTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 34, 547, -1));

        labelRg.setText("RG: *");
        jPanel2.add(labelRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        try {
            jTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFActionPerformed(evt);
            }
        });
        jPanel2.add(jTFCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 82, 240, -1));
        jPanel2.add(jTFRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 82, 206, -1));

        labelCpf.setText("CPF *");
        jPanel2.add(labelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 85, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 650, 9));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("LOGRADOURO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));
        jPanel1.add(jTFLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 21, 544, -1));

        jLabel6.setText("COMPLETO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, -1, 23));
        jPanel1.add(jTFComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 59, 205, 21));
        jPanel1.add(jTFNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 60, 60, -1));

        jLabel7.setText("NUMERO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 59, -1, 23));
        jPanel1.add(jTFBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 93, 237, -1));

        jLabel8.setText("BAIRRO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));
        jPanel1.add(jTFCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 93, 235, -1));

        jLabel9.setText("CIDADE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 96, -1, -1));

        jCbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BR", "PR", "SP", "SC", "AM", "RS" }));
        jPanel1.add(jCbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 131, -1, -1));

        jLabel10.setText("UF:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jLabel20.setText("CEP");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 134, -1, -1));

        try {
            jTFormaCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTFormaCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 131, 160, -1));

        jTabbedPane1.addTab("ENDERECO", jPanel1);

        jLabel11.setText("TELFONE RESIDENCIAL:");

        try {
            jFormaDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("DD:");

        jLabel13.setText("NUMERO:");

        try {
            jFormaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormaNumero.setText("    ");
        jFormaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormaNumeroActionPerformed(evt);
            }
        });

        jLabel14.setText("TELEFONE COMERCIAL:");

        jLabel15.setText("DD:");

        jLabel16.setText("NUMERO:");

        try {
            jFormaComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setText("CELULAR:");

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setText("DD:");

        jLabel19.setText("NUMERO:");

        try {
            jTFormaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextField5)
                            .addComponent(jFormaDD))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jTFormaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jFormaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jFormaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTFormaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONTATO", jPanel4);

        jLabel21.setText("MARCA:");

        jLabel22.setText("MODELO:");

        jLabel23.setText("ANO:");

        jLabel24.setText("PLACA:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFANO, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(jTfMARCA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTfMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jTFPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VEICULO", jPanel5);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 859, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/logocliente.png"))); // NOI18N
        jLabel1.setText("CLIENTES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 72));

        jBTCadastrar.setText("CADASTRAR");
        jBTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBTCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jBTFechar.setText("FECHAR");
        jBTFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jBTFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        jButton1.setText("ORDEM DE SERVIÇO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        jButton2.setText("LIMPAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jBTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCadastrarActionPerformed
        try {

            System.out.println("aqui");
            System.out.println(jTFCPF.getText());
            System.out.println(jTFNome.getText());
            if (jTFNome.getText().length() > 0) {
                labelNome.setVisible(false);
                jTFNome.setBackground(Color.WHITE);


            } else {
                labelNome.setVisible(true);
                jTFNome.setBackground(Color.red);
                jTFNome.requestFocus();
            }


            if (jTFRG.getText().length() > 0) {
                labelRg.setVisible(false);
                jTFRG.setBackground(Color.WHITE);
            } else {
                labelRg.setVisible(true);
                jTFRG.setBackground(Color.red);
                jTFRG.requestFocus();
            }
            
            String cpf = ValidacaoView.limparCaracteres(jTFCPF.getText());
            boolean v = ValidacaoView.isCPF(cpf);
              System.out.println(cpf);
            if (v == true) {
                System.out.println(cpf);
                labelCpf.setVisible(false);
                jTFCPF.setBackground(Color.WHITE);
            } else {
                labelCpf.setVisible(true);
                jTFCPF.setBackground(Color.red);
                jTFCPF.requestFocus();
                jTFCPF.setText("");
                JOptionPane.showMessageDialog(null, "CPF invalido ou campo vazio!!");
            }
           
            if ((jTFNome.getText().length() > 0)
                    && (jTFRG.getText().length() > 0)
                    && (jTFCPF.getText().length() > 0)) {
               
                cliente.setNome(jTFNome.getText());
                cliente.setCpf(jTFCPF.getText());
                cliente.setRg(jTFRG.getText());

                veiculo.setMarca(jTfMARCA.getText());
                veiculo.setModelo(jTFMODELO.getText());
                veiculo.setPlaca(jTFPLACA.getText());
                veiculo.setAno(jTFANO.getText());

                endereco.setLogradouro(jTFLogradouro.getText());
                endereco.setComplemento(jTFComplemento.getText());
                endereco.setNumero(jTFNumero.getText());
                endereco.setCidade(jTFCidade.getText());
                endereco.setUf(jCbUF.getName());
                endereco.setCep(jTFormaCep.getText());
                endereco.setBairro(jTFBairro.getText());
                telefone.setDdd(jFormaDD.getText());
                telefone.setTelefone(jFormaNumero.getText());

                telefone.setDdd(jFormaDD.getText());
                telefone.setTelefone(jFormaNumero.getText());
                cliente.setEndereco(endereco);
                cliente.setVeiculo(veiculo);
                cliente.setTelefone(telefone);


                 clienteDao.persist(cliente); 
               JOptionPane.showMessageDialog(null, "Dados Validados");
            } else {
                JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");

            }


        } catch (Exception ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_jBTCadastrarActionPerformed

    private void jTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCPFActionPerformed

    private void jFormaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormaNumeroActionPerformed

    private void jBTFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTFecharActionPerformed
        
        
        dispose();
    }//GEN-LAST:event_jBTFecharActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTFLogradouro.setText("");
        jTFComplemento.setText("");
        jTFNumero.setText("");
        jTFCidade.setText("");
        jCbUF.setName("");
        jTFormaCep.setText("");
        jTFNome.setText("");
        jTFCPF.setText("");
        jTFRG.setText("");
        jTFBairro.setText("");
        jTfMARCA.setText("");
        jTFMODELO.setText("");
        jTFPLACA.setText("");
        jTFANO.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
                if(cliente.getNome()== null){
                JOptionPane.showMessageDialog(null, "Cliente nao cadastrado");
                }else{
                CadastroOrdemDeServico cadOrdem= new CadastroOrdemDeServico();
                cadOrdem.setVisible(true);
                cadOrdem.setCliente(this.cliente);
                }
                
                
                System.out.println("Aqui" + this.cliente.getNome());
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String[] args) {
        new CadastrarCliente().setVisible(true);
    }

    public void preencheTelaCadastro(Cliente cli) {
        System.out.println(cli.getId());
        cli.setId(cli.getId());
        System.out.println(cli.getId());
        jTFNome.setText(cli.getNome());
        jTFRG.setText(cli.getRg());
        jTFCPF.setText(cli.getCpf());

        jTFLogradouro.setText(cli.getEndereco().getLogradouro());
        jTFComplemento.setText(cli.getEndereco().getComplemento());
        jTFNumero.setText(cli.getEndereco().getNumero());
        jTFBairro.setText(cli.getEndereco().getBairro());
        jTFCidade.setText(cli.getEndereco().getCidade());
        jCbUF.setName(cli.getEndereco().getUf());
        jTFormaCep.setText(cli.getEndereco().getCep());
        tel = cli.getTelefone();
        //System.out.println(tel);
        for (Telefone telefone1 : tel) {
            this.telefone = telefone1;
        }
        veiculos = cli.getVeiculo();
        //System.out.println(tel);
        for (Veiculo veiculos : this.veiculos) {
            this.veiculo = veiculos;
        }
        System.out.println("aqui");
        jFormaDD.setText(telefone.getDdd());
        jFormaNumero.setText(telefone.getTelefone());
        jTFANO.setText(veiculo.getAno());
        jTFMODELO.setText(veiculo.getModelo());
        jTFPLACA.setText(veiculo.getPlaca());
        jTfMARCA.setText(veiculo.getMarca());
        jTFComplemento.setText(cli.getEndereco().getComplemento());
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCadastrar;
    private javax.swing.JButton jBTFechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jCbUF;
    private javax.swing.JFormattedTextField jFormaComercial;
    private javax.swing.JFormattedTextField jFormaDD;
    private javax.swing.JFormattedTextField jFormaNumero;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFANO;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JFormattedTextField jTFCPF;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JTextField jTFMODELO;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPLACA;
    private javax.swing.JTextField jTFRG;
    private javax.swing.JFormattedTextField jTFormaCep;
    private javax.swing.JFormattedTextField jTFormaNumero;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTfMARCA;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRg;
    // End of variables declaration//GEN-END:variables
}
