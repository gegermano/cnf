/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cnf.Telas;

import br.com.cnf.controle.DisciplinaDAO;
import br.com.cnf.modelo.TFADIS;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class TelaDisciplinas extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlunos
     */
    public TelaDisciplinas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupBusca = new javax.swing.ButtonGroup();
        btnNovaDisciplina = new javax.swing.JButton();
        jPanelBusca = new javax.swing.JPanel();
        fieldBusca = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        rbtnAtivos = new javax.swing.JRadioButton();
        rbtnTodasDisciplinas = new javax.swing.JRadioButton();
        rbtnInativos = new javax.swing.JRadioButton();
        jPanelLista = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnInativar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDisciplinas = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnNovaDisciplina.setText("Nova Disciplina");
        btnNovaDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaDisciplinaActionPerformed(evt);
            }
        });

        jPanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pesquisa de Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        fieldBusca.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldBuscaCaretUpdate(evt);
            }
        });
        fieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblStatus.setText("Status:");

        rbtnAtivos.setText("Ativas");
        rbtnAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAtivosActionPerformed(evt);
            }
        });

        rbtnTodasDisciplinas.setText("Todos as Disciplinas");
        rbtnTodasDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodasDisciplinasActionPerformed(evt);
            }
        });

        rbtnInativos.setText("Inativas");
        rbtnInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInativosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscaLayout = new javax.swing.GroupLayout(jPanelBusca);
        jPanelBusca.setLayout(jPanelBuscaLayout);
        jPanelBuscaLayout.setHorizontalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldBusca)
                    .addGroup(jPanelBuscaLayout.createSequentialGroup()
                        .addComponent(rbtnAtivos)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnInativos)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnTodasDisciplinas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBuscaLayout.setVerticalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(rbtnAtivos)
                    .addComponent(rbtnTodasDisciplinas)
                    .addComponent(rbtnInativos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnInativar.setText("Inativar");
        btnInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInativarActionPerformed(evt);
            }
        });

        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        try{
            tabelaDisciplinas.setModel(disciplinas.listaPorNome(fieldBusca.getText())
            );
        }catch (Exception ex){

        }
        tabelaDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDisciplinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDisciplinas);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(jPanelListaLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInativar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtivar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnInativar)
                    .addComponent(btnAtivar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovaDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaDisciplina)
                    .addComponent(btnVoltar))
                .addGap(10, 10, 10)
                .addComponent(jPanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaDisciplinaActionPerformed
        CadastroDisciplinas cadDisciplinas = CadastroDisciplinas.novoCadastro();
        
        cadDisciplinas.setResizable(false);
        cadDisciplinas.setVisible(true);
        cadDisciplinas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNovaDisciplinaActionPerformed

    private void fieldBuscaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldBuscaCaretUpdate
        mostraPorNome();
    }//GEN-LAST:event_fieldBuscaCaretUpdate

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        buttonGroupBusca.add(rbtnAtivos);
        buttonGroupBusca.add(rbtnTodasDisciplinas);
        buttonGroupBusca.add(rbtnInativos);
        btnInativar.setEnabled(false);
        btnAtivar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        rbtnAtivos.setSelected(true);
        mostraPorNome();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDisciplinasMouseClicked
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        if (rbtnAtivos.isSelected()) {
            btnAtivar.setEnabled(false);
            btnInativar.setEnabled(true);
        } else if (rbtnInativos.isSelected()) {
            btnInativar.setEnabled(false);
            btnAtivar.setEnabled(true);

        } else if (rbtnTodasDisciplinas.isSelected()) {
            TFADIS disciplina = new TFADIS();
            disciplina = disciplinas.listaPorCodigo((String) tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0));
            if (disciplina.getStatus_dis().equals("AT")) {
                btnAtivar.setEnabled(false);
                btnInativar.setEnabled(true);
            } else {
                btnInativar.setEnabled(false);
                btnAtivar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_tabelaDisciplinasMouseClicked

    private void rbtnAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAtivosActionPerformed
        btnAtivar.setEnabled(false);
        btnInativar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        mostraPorNome();
        if (rbtnAtivos.isSelected() && tabelaDisciplinas.getSelectedRow() != -1) {
            btnAtivar.setEnabled(false);
            btnInativar.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnAtivosActionPerformed

    private void rbtnInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInativosActionPerformed
        btnAtivar.setEnabled(false);
        btnInativar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        mostraPorNome();
        if (rbtnInativos.isSelected() && tabelaDisciplinas.getSelectedRow() != -1) {
            btnAtivar.setEnabled(true);
            btnInativar.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnInativosActionPerformed

    private void rbtnTodasDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodasDisciplinasActionPerformed
        btnAtivar.setEnabled(false);
        btnInativar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        mostraPorNome();
    }//GEN-LAST:event_rbtnTodasDisciplinasActionPerformed

    private void fieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBuscaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        TFADIS disciplina = new TFADIS();
        disciplina = disciplinas.listaPorCodigo((String) tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0));

        CadastroDisciplinas cadDisciplinas = new CadastroDisciplinas(disciplina);

        cadDisciplinas.setVisible(true);
        cadDisciplinas.setResizable(false);
        cadDisciplinas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInativarActionPerformed
        disciplinas.updateStatus((String) tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0), "IN");
        mostraPorNome();
    }//GEN-LAST:event_btnInativarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        disciplinas.updateStatus((String) tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0), "AT");
        mostraPorNome();
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        disciplinas.delete((String) tabelaDisciplinas.getValueAt(tabelaDisciplinas.getSelectedRow(), 0));
        mostraPorNome();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaCadastrosPrincipal principal = new TelaCadastrosPrincipal();
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);

        TelaDisciplinas.this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDisciplinas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInativar;
    private javax.swing.JButton btnNovaDisciplina;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroupBusca;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JPanel jPanelBusca;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JRadioButton rbtnAtivos;
    private javax.swing.JRadioButton rbtnInativos;
    private javax.swing.JRadioButton rbtnTodasDisciplinas;
    private javax.swing.JTable tabelaDisciplinas;
    // End of variables declaration//GEN-END:variables
    DisciplinaDAO disciplinas = new DisciplinaDAO();

    private void mostraPorNome() {
        String status;
        if (rbtnAtivos.isSelected()) {
            status = "AT";
            try {
                tabelaDisciplinas.setModel(disciplinas.listaPorNomeStatus(fieldBusca.getText(), status));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (rbtnInativos.isSelected()) {
            status = "IN";
            try {
                tabelaDisciplinas.setModel(disciplinas.listaPorNomeStatus(fieldBusca.getText(), status));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            try {
                tabelaDisciplinas.setModel(disciplinas.listaPorNome(fieldBusca.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }
}
