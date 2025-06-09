
package view.Gerenciamento;


public class TeladeClientes extends javax.swing.JFrame {

   
    public TeladeClientes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SecondPanel = new javax.swing.JPanel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        campotxtFNomeCompleto = new javax.swing.JFormattedTextField();
        campotxtFID = new javax.swing.JFormattedTextField();
        campotxtFCPF = new javax.swing.JFormattedTextField();
        campotxtFTelefone = new javax.swing.JFormattedTextField();
        campotxtFEmail = new javax.swing.JFormattedTextField();
        btnCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCadCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeclientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaClientes");

        MainPanel.setBackground(new java.awt.Color(73, 77, 112));

        SecondPanel.setBackground(new java.awt.Color(239, 242, 255));

        lblNomeCompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeCompleto.setText("Nome completo:");

        lblID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblID.setText("ID:");

        lblCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone/Celular:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        campotxtFNomeCompleto.setText("Thiago de Alvarez juniors da Luz");
        campotxtFNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFNomeCompletoActionPerformed(evt);
            }
        });

        campotxtFID.setText("null");
        campotxtFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFIDActionPerformed(evt);
            }
        });

        campotxtFCPF.setText("null");

        campotxtFTelefone.setText("null");
        campotxtFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFTelefoneActionPerformed(evt);
            }
        });

        campotxtFEmail.setText("null");

        javax.swing.GroupLayout SecondPanelLayout = new javax.swing.GroupLayout(SecondPanel);
        SecondPanel.setLayout(SecondPanelLayout);
        SecondPanelLayout.setHorizontalGroup(
            SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondPanelLayout.createSequentialGroup()
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFID, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(SecondPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campotxtFNomeCompleto)))
                .addContainerGap())
        );
        SecondPanelLayout.setVerticalGroup(
            SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCompleto)
                    .addComponent(campotxtFNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(campotxtFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(campotxtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(campotxtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(campotxtFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
        );

        btnCadastro.setBackground(new java.awt.Color(181, 214, 170));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setBackground(new java.awt.Color(213, 152, 152));
        btnExcluirCadastro.setText("Excluir cadastro");
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCadCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCadCliente.setText("Cadastrar Clientes");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SecondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(151, 151, 151))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCadCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCadCliente)
                .addGap(27, 27, 27)
                .addComponent(SecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        ListaDeclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ListaDeclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCadastroActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void campotxtFNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFNomeCompletoActionPerformed

    private void campotxtFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFTelefoneActionPerformed

    private void campotxtFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFIDActionPerformed

   
    public static void main(String args[]) {
               try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeladeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaDeclientes;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campotxtFCPF;
    private javax.swing.JFormattedTextField campotxtFEmail;
    private javax.swing.JFormattedTextField campotxtFID;
    private javax.swing.JFormattedTextField campotxtFNomeCompleto;
    private javax.swing.JFormattedTextField campotxtFTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadCliente;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
