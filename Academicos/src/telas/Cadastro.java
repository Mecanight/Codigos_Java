package telas;

import modelo.Aluno;
import java.util.ArrayList;

public class Cadastro extends javax.swing.JFrame {

    private ArrayList<Aluno> listaAlu;
    Aluno alunoAux;
    boolean novo = false;
    int indice = -1;

    public Cadastro() {
        initComponents();
        ativaInicio();
    }

    private void carregaDados() {
        alunoAux = listaAlu.get(indice);
        tfNome.setText(alunoAux.getNome());
        tfDisciplina.setText(alunoAux.getDisciplina());
        tfNota1.setText(alunoAux.getNota1() + "");
        tfNota2.setText(alunoAux.getNota2() + "");
        rbGradua.setSelected(alunoAux.isOpcao());
    }

    private void limpaTela() {
        tfNome.setText("");
        tfDisciplina.setText("");
        tfNota1.setText("");
        tfNota2.setText("");
        rbGradua.setSelected(true);
        tfNome.requestFocus();
    }

    private void ativaInicio() {
        btNew.setEnabled(true);
        btPrev.setEnabled(false);
        btNext.setEnabled(false);
        btSave.setEnabled(false);
        btDel.setEnabled(false);
        btCarta.setEnabled(false);
    }

    private void ativaEdicao() {
        btNew.setEnabled(false);
        btPrev.setEnabled(false);
        btNext.setEnabled(false);
        btSave.setEnabled(true);
        btDel.setEnabled(false);
        btCarta.setEnabled(false);
    }

    private void ativaNavegacao() {
        btNew.setEnabled(true);
        btPrev.setEnabled(true);
        btNext.setEnabled(true);
        btSave.setEnabled(true);
        btDel.setEnabled(true);
        btCarta.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbGradua = new javax.swing.JRadioButton();
        rbEspec = new javax.swing.JRadioButton();
        tfNome = new javax.swing.JTextField();
        tfDisciplina = new javax.swing.JTextField();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        btPrev = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btCarta = new javax.swing.JButton();
        btSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Aluno");
        setResizable(false);

        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Disciplina:");

        jLabel3.setText("Nota 1:");

        jLabel4.setText("Nota 2:");

        buttonGroup1.add(rbGradua);
        rbGradua.setSelected(true);
        rbGradua.setText("Graduação");
        rbGradua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGraduaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEspec);
        rbEspec.setText("Especialização");
        rbEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspecActionPerformed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDisciplinaActionPerformed(evt);
            }
        });

        tfNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota1ActionPerformed(evt);
            }
        });

        tfNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota2ActionPerformed(evt);
            }
        });

        btPrev.setText("<<<");
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });

        btNext.setText(">>>");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btDel.setText("Del");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btCarta.setText("Carta");
        btCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCartaActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome)
                            .addComponent(tfDisciplina, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbEspec)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 233, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSave)
                                .addGap(18, 18, 18)
                                .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPrev)
                                .addGap(18, 18, 18)
                                .addComponent(btNext)
                                .addGap(18, 18, 18)
                                .addComponent(btCarta))
                            .addComponent(rbGradua))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGradua)
                    .addComponent(rbEspec))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btCarta)
                    .addComponent(btNext)
                    .addComponent(btPrev)
                    .addComponent(btNew)
                    .addComponent(btSave)
                    .addComponent(btDel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDisciplinaActionPerformed

    }//GEN-LAST:event_tfDisciplinaActionPerformed

    private void tfNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota1ActionPerformed

    }//GEN-LAST:event_tfNota1ActionPerformed

    private void tfNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota2ActionPerformed

    }//GEN-LAST:event_tfNota2ActionPerformed

    private void btPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrevActionPerformed
        if (indice > 0) {
            indice--;
        }
        carregaDados();
    }//GEN-LAST:event_btPrevActionPerformed

    private void rbGraduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGraduaActionPerformed

    }//GEN-LAST:event_rbGraduaActionPerformed

    private void rbEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspecActionPerformed

    }//GEN-LAST:event_rbEspecActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        limpaTela();
        novo = true;
        ativaEdicao();
        tfNome.requestFocus();
    }//GEN-LAST:event_btNewActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        listaAlu.remove(indice);
        if (listaAlu.size() > 0) {
            indice = 0;
            carregaDados();
            ativaInicio();
        } else {
            indice = -1;
            ativaInicio();
        }
    }//GEN-LAST:event_btDelActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        if (indice < (listaAlu.size() - 1)) {
            indice++;
        }
        carregaDados();
    }//GEN-LAST:event_btNextActionPerformed

    private void btCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCartaActionPerformed
        listaAlu.get(indice);
        String carta = alunoAux.gerarConteudoCarta();
        javax.swing.JOptionPane.showMessageDialog(this, carta);
    }//GEN-LAST:event_btCartaActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        String nome = tfNome.getText();
        String disciplina = tfDisciplina.getText();
        double nota1 = Double.parseDouble(tfNota1.getText());
        double nota2 = Double.parseDouble(tfNota2.getText());
        boolean opcao = rbGradua.isSelected();
        alunoAux = new Aluno();
        alunoAux.setNome(nome);
        alunoAux.setDisciplina(disciplina);
        alunoAux.setNota1(nota1);
        alunoAux.setNota2(nota2);
        alunoAux.setOpcao(opcao);
        if (novo == true) {
            listaAlu.add(alunoAux);
            indice = listaAlu.size() - 1;
        } else {
            listaAlu.set(indice, alunoAux);
        }
        novo = false;
        ativaNavegacao();
    }//GEN-LAST:event_btSaveActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarta;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbEspec;
    private javax.swing.JRadioButton rbGradua;
    private javax.swing.JTextField tfDisciplina;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    // End of variables declaration//GEN-END:variables
}
