package tela;

import modelo.AlunoV3;
import modelo.AlunoGradV3;
import modelo.AlunoEspecV3;
import java.util.ArrayList;
import java.util.List;
import util.GravaArquivoBinario;
import util.LerArquivoBinario;

public class CadastroV3 extends javax.swing.JFrame {

    List<AlunoV3> listaAlu = new ArrayList();
    AlunoV3 alunoaux;
    int indice;
    boolean novo;

    public CadastroV3() {
        listaAlu = LerArquivoBinario.lerDados();
        initComponents();
        novo = true;
        if (listaAlu.size() == 0) {
            ativaInicio();
        } else {
            indice = 0;
            carregaDados();
            ativaNavegacao();
            btnAnterior.setEnabled(false);
            if (listaAlu.size() < 2) {
                btnProximo.setEnabled(false);
            }

        }
    }

    private void semDigitacao() {
        txtNome.setEditable(false);
        txtDisciplina.setEditable(false);
        txtNota1.setEditable(false);
        txtNota2.setEditable(false);
        rbEspec.setEnabled(false);
        rbGrad.setEnabled(false);
    }

    private void comDigitacao() {
        txtNome.setEditable(true);
        txtDisciplina.setEditable(true);
        txtNota1.setEditable(true);
        txtNota2.setEditable(true);
        rbGrad.setEnabled(true);
        rbEspec.setEnabled(true);
    }

    private void ativaInicio() {
        indice = -1;
        semDigitacao();
        limpaTela();
        btnNovo.setEnabled(true);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnCarta.setEnabled(false);
        btnEditar.setEnabled(false);
    }

    private void limpaTela() {
        txtNome.setText("");
        txtDisciplina.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        rbGrad.setSelected(true);
    }

    private void carregaDados() {
        semDigitacao();
        alunoaux = listaAlu.get(indice);
        txtNome.setText(alunoaux.getNome());
        txtDisciplina.setText(alunoaux.getDisciplina());
        txtNota1.setText(alunoaux.getNota1() + "");
        txtNota2.setText(alunoaux.getNota2() + "");
        txtIndice.setText(Integer.toString(indice));
        txtTamLista.setText(Integer.toString(listaAlu.size()));
        if (alunoaux.isOpcao() == true) {
            rbGrad.setSelected(true);
            rbEspec.setSelected(false);
        } else {
            rbEspec.setSelected(true);
            rbGrad.setSelected(false);
        }
    }

    private void ativaNavegacao() {
        semDigitacao();
        btnNovo.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(true);
        btnCarta.setEnabled(true);
        btnEditar.setEnabled(true);
    }

    private void ativaEdicao() {
        novo = false;
        comDigitacao();
        btnNovo.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCarta.setEnabled(false);
        btnEditar.setEnabled(false);
    }

    private void ativaNovo() {
        novo = true;
        limpaTela();
        comDigitacao();
        btnNovo.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCarta.setEnabled(false);
        btnEditar.setEnabled(false);
        txtNome.requestFocus();
        indice = listaAlu.size();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        rbGrad = new javax.swing.JRadioButton();
        rbEspec = new javax.swing.JRadioButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnCarta = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        txtTamLista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Acadêmicos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Disciplina");

        jLabel3.setText("Nota 1");

        jLabel4.setText("Nota 2");

        txtNota1.setNextFocusableComponent(txtNota2);

        txtNota2.setNextFocusableComponent(btnNovo);

        buttonGroup1.add(rbGrad);
        rbGrad.setSelected(true);
        rbGrad.setText("Graduação");
        rbGrad.setNextFocusableComponent(rbEspec);
        rbGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGradActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEspec);
        rbEspec.setText("Especialização");
        rbEspec.setNextFocusableComponent(btnNovo);
        rbEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspecActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo>>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnCarta.setText("Carta");
        btnCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiceActionPerformed(evt);
            }
        });

        txtTamLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletar)
                    .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIndice, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(txtTamLista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEspec)
                            .addComponent(rbGrad))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGrad)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEspec)
                    .addComponent(txtTamLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String disciplina = txtDisciplina.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        boolean opcao;
        if (rbGrad.isSelected()) {
            opcao = true;
            alunoaux = new AlunoGradV3();
        } else {
            opcao = false;
            alunoaux = new AlunoEspecV3();
        }
        alunoaux.setNome(nome);
        alunoaux.setDisciplina(disciplina);
        alunoaux.setNota1(nota1);
        alunoaux.setNota2(nota2);
        alunoaux.setOpcao(opcao);
        if ((nome.equals("")) || (disciplina.equals(""))) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Preencha todos os dados para prosseguir");
        } else {
            if (novo) {
                listaAlu.add(alunoaux);
                String aux = "Aluno incluído com secesso";
                javax.swing.JOptionPane.showMessageDialog(this, aux);
                listaAlu.set(indice, alunoaux);
                carregaDados();
                ativaNavegacao();
            } else {
                listaAlu.set(indice, alunoaux);
                String aux = "Dados alterados com sucesso";
                javax.swing.JOptionPane.showMessageDialog(this, aux);
                ativaNavegacao();
            }
            if (indice == listaAlu.size() - 1) {
                btnProximo.setEnabled(false);
            }
            if (indice == 0) {
                btnAnterior.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        alunoaux = listaAlu.get(indice);
        String aux = alunoaux.gerarConteudoCarta();
        javax.swing.JOptionPane.showMessageDialog(this, aux);
    }//GEN-LAST:event_btnCartaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ativaNovo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (listaAlu.size() == 1) {
            listaAlu.remove(indice);
            ativaInicio();
        } else {
            listaAlu.remove(indice);
            indice = 0;
            carregaDados();
            ativaNavegacao();
            btnAnterior.setEnabled(false);
            if (listaAlu.size() < 2) {
                btnProximo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        btnProximo.setEnabled(true);
        if (indice > 0) {
            indice--;
            carregaDados();
            if (indice == 0) {
                btnAnterior.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        btnAnterior.setEnabled(true);
        if (indice < (listaAlu.size() - 1)) {
            indice++;
            carregaDados();
            if (indice == (listaAlu.size() - 1)) {
                btnProximo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void rbGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGradActionPerformed

    }//GEN-LAST:event_rbGradActionPerformed

    private void rbEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspecActionPerformed

    }//GEN-LAST:event_rbEspecActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ativaEdicao();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void fechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar
        Object[] opcoes = {"Sim", "Não"};
        int opc = javax.swing.JOptionPane.showOptionDialog(this,
                "Sair do sistema ?", "Saída do Sistema",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]);
        if (opc == 0) {
            GravaArquivoBinario.gravaArquivoBinario(listaAlu);
            System.exit(0);
        }
    }//GEN-LAST:event_fechar

    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed

    }//GEN-LAST:event_txtIndiceActionPerformed

    private void txtTamListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamListaActionPerformed

    }//GEN-LAST:event_txtTamListaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroV3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCarta;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbEspec;
    private javax.swing.JRadioButton rbGrad;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtTamLista;
    // End of variables declaration//GEN-END:variables
}
