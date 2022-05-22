package telas;

import modelo.Aluno;
import modelo.AlunoGrad;
import modelo.AlunoEspec;
import java.util.ArrayList;

public class CadastroAlunosUniversidade extends javax.swing.JFrame {

    private ArrayList<Aluno> listaAlu;
    Aluno alunoaux;
    boolean novo = false;
    int indice = -1;

    public CadastroAlunosUniversidade(java.awt.Frame parent,
            boolean modal, ArrayList<Aluno> listaAux) {
        initComponents();
        limpaTela();
        listaAlu = listaAux;
        if (listaAlu.size() > 0) {
            indice = 0;
            ativaNavegacao();
            carregaDados();
        } else {
            ativaInicio();

            ativaInicio();
        }
    }

    private CadastroAlunosUniversidade() {
        initComponents();
        limpaTela();
        listaAlu = new ArrayList();
    }

    private void limpaTela() {
        tfNome.setText("");
        tfDisciplina.setText("");
        tfNota1.setText("");
        tfNota2.setText("");
        rbGraduacao.setSelected(true);
        rbEspecializa.setSelected(false);
    }

    private void ativaInicio() {
        btNovo.setEnabled(true);
        btAnterior.setEnabled(false);
        btSeguinte.setEnabled(false);
        btSalvar.setEnabled(false);
        btExcluir.setEnabled(false);
    }

    private void carregaDados() {
        alunoaux = listaAlu.get(indice);
        tfNome.setText(alunoaux.getNomeAluno());
        tfDisciplina.setText(alunoaux.getNomeDisciplina());
        tfNota1.setText(alunoaux.getNota1() + "");
        tfNota2.setText(alunoaux.getNota2() + "");
    }

    private void ativaEdicao() {
        btNovo.setEnabled(false);
        btAnterior.setEnabled(false);
        btSeguinte.setEnabled(false);
        btSalvar.setEnabled(true);
        btExcluir.setEnabled(false);
    }

    private void ativaNavegacao() {
        btNovo.setEnabled(true);
        btAnterior.setEnabled(true);
        btSeguinte.setEnabled(true);
        btSalvar.setEnabled(true);
        btExcluir.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfDisciplina = new javax.swing.JTextField();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        rbGraduacao = new javax.swing.JRadioButton();
        rbEspecializa = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btGerarCarta = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btLimparTela = new javax.swing.JButton();
        btSeguinte = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cadastro");
        setAlwaysOnTop(true);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nome:");

        jLabel2.setText("Disciplina:");

        jLabel3.setText("Nota 1:");

        jLabel4.setText("Nota 2:");

        buttonGroup1.add(rbGraduacao);
        rbGraduacao.setSelected(true);
        rbGraduacao.setText("Graduação");
        rbGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGraduacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEspecializa);
        rbEspecializa.setText("Especialização");
        rbEspecializa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspecializaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNota1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(tfDisciplina, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNota2)))
                    .addComponent(rbEspecializa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(rbGraduacao)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGraduacao)
                    .addComponent(rbEspecializa))
                .addContainerGap())
        );

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btGerarCarta.setText("Gerar Carta");
        btGerarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarCartaActionPerformed(evt);
            }
        });

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btLimparTela.setText("Limpar Tela");
        btLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelaActionPerformed(evt);
            }
        });

        btSeguinte.setText("Seguinte");
        btSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeguinteActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGerarCarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSeguinte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparTela)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btNovo)
                    .addComponent(btLimparTela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(btSeguinte)
                    .addComponent(btGerarCarta)
                    .addComponent(btEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(382, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (rbGraduacao.isSelected()) {
            String nome = tfNome.getText();
            String disciplina = tfDisciplina.getText();
            double nota1 = Double.parseDouble(tfNota1.getText());
            double nota2 = Double.parseDouble(tfNota2.getText());
            String opcao = "Graduação";

            alunoaux = new AlunoGrad();
            alunoaux.setNomeAluno(nome);
            alunoaux.setNomeDisciplina(disciplina);
            alunoaux.setNota1(nota1);
            alunoaux.setNota2(nota2);
            alunoaux.setOpcao(opcao);
            listaAlu.add(alunoaux);
            indice++;

        } else {
            String nome = tfNome.getText();
            String disciplina = tfDisciplina.getText();
            double nota1 = Double.parseDouble(tfNota1.getText());
            double nota2 = Double.parseDouble(tfNota2.getText());
            String opcao = "Especialização";

            alunoaux = new AlunoEspec();
            alunoaux.setNomeAluno(nome);
            alunoaux.setNomeDisciplina(disciplina);
            alunoaux.setNota1(nota1);
            alunoaux.setNota2(nota2);
            alunoaux.setOpcao(opcao);
            listaAlu.add(alunoaux);
            indice++;
        }

        novo = false;
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        listaAlu.remove(indice);
        if (listaAlu.size() > 0) {
            indice = 0;
        } else {
            indice = -1;
            ativaInicio();
        }
        limpaTela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btGerarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarCartaActionPerformed
        listaAlu.get(indice);
        String aux = "";

        javax.swing.JOptionPane.showMessageDialog(this, aux);
    }//GEN-LAST:event_btGerarCartaActionPerformed

    private void rbGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGraduacaoActionPerformed

    }//GEN-LAST:event_rbGraduacaoActionPerformed

    private void rbEspecializaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspecializaActionPerformed

    }//GEN-LAST:event_rbEspecializaActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        if (indice > 0) {
            indice--;
        }
        carregaDados();
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelaActionPerformed

    }//GEN-LAST:event_btLimparTelaActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

    }//GEN-LAST:event_btEditarActionPerformed

    private void btSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeguinteActionPerformed
        if (indice < (listaAlu.size() - 1)) {
            indice++;
        }
        carregaDados();
    }//GEN-LAST:event_btSeguinteActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosUniversidade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosUniversidade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosUniversidade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosUniversidade.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunosUniversidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGerarCarta;
    private javax.swing.JButton btLimparTela;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSeguinte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JRadioButton rbEspecializa;
    private javax.swing.JRadioButton rbGraduacao;
    private javax.swing.JTextField tfDisciplina;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    // End of variables declaration//GEN-END:variables
}
