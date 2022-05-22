
package telas;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ManterCliente extends javax.swing.JDialog {

    // vetor dinâmico para clientes

    List<Cliente> cli = new ArrayList();
    Cliente cliaux;
    // variável para saber se é para adicionar um novo registro ou para alterar
    // o registro corrente
    boolean novo = false;
    // variável para saber qual o índice do registro que está sendo editado no
    // momento
    int i = -1;

    public ManterCliente(java.awt.Frame parent, boolean modal,
            List<Cliente> listacli) {
        super(parent, modal);
        initComponents();
        // informa como devem estar os botões no início do processo
        ativaInicio();
        cli = listacli;
        if (cli.size() > 0) {
            i = 0;
            carregaDados();
            ativaNavegacao();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btPrimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Cliente"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Celular:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Senha:");

        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addComponent(jLabel1))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmail)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfCelular, tfCodigo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(2, 4));

        btPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resultset_first.png"))); // NOI18N
        btPrimeiro.setToolTipText("Primeiro registro");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });
        jPanel2.add(btPrimeiro);

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resultset_previous.png"))); // NOI18N
        btAnterior.setToolTipText("Registro anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        jPanel2.add(btAnterior);

        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resultset_next.png"))); // NOI18N
        btProximo.setToolTipText("Próximo registro");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        jPanel2.add(btProximo);

        btUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resultset_last.png"))); // NOI18N
        btUltimo.setToolTipText("Último registro");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });
        jPanel2.add(btUltimo);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brick_delete.png"))); // NOI18N
        btExcluir.setToolTipText("Excluir registro");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluir);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brick_add.png"))); // NOI18N
        btNovo.setToolTipText("Novo registro");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brick_go.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar registro");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btSalvar);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/door_in.png"))); // NOI18N
        btSair.setToolTipText("Sair do Sistema");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel2.add(btSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-360)/2, 416, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfSenhaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        // Fecha o JDialog
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        int codc = Integer.parseInt(tfCodigo.getText());
        String nome = tfNome.getText();
        String cel = tfCelular.getText();
        String email = tfEmail.getText();
        // recuperando um campo de senha
        String senha = new String(pfSenha.getPassword());
        // criando um objeto com os dados da tela
        cliaux = new Cliente(codc, nome, cel, email, senha);
        // adicionando o objeto ao vetor dinâmico de clientes
        if (novo) {
            cli.add(cliaux);
            i = cli.size() - 1;
        } else {
            // altera os dados da posição armazenada em i
            cli.set(i, cliaux);
        }
        novo = false;
        ativaNavegacao();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        limpaCampos();
        novo = true;
        ativaEdicao();
        // manda o curso ficar no campo código
        tfCodigo.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        // TODO add your handling code here:
        // testa se já há registros incluídos
        if ((cli.size() > 0) && (i > 0)) {
            i = 0; // vai para o primeiro registro
            carregaDados();
        } else {
            if (cli.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Não há registros");
            } else {
                JOptionPane.showMessageDialog(this, "Já está no primeiro registro");
            }
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        // TODO add your handling code here:
        // testa se tem registros e se ainda não está no primeiro registro
        if ((cli.size() > 0) && (i > 0)) {
            i--; // vai para o registro anterior
            carregaDados();
        } else {
            if (cli.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Não há registros");
            } else {
                JOptionPane.showMessageDialog(this, "Já está no primeiro registro");
            }
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        // TODO add your handling code here:
        // testa se tem registros e se não está no último registro
        if ((cli.size() > 0) && (i < cli.size() - 1)) {
            i++; // vai para o próximo registro
            carregaDados();
        } else {
            if (cli.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Não há registros");
            } else {
                JOptionPane.showMessageDialog(this, "Já está no último registro");
            }
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        // TODO add your handling code here:
        if ((cli.size() > 0) && (i < cli.size() - 1)) {
            i = cli.size() - 1; // vai para o último registro
            carregaDados();
        } else {
            if (cli.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Não há registros");
            } else {
                JOptionPane.showMessageDialog(this, "Já está no último registro");
            }
        }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        // testa se há registros
        if (i >= 0) {
            // remove o registro corrente
            cli.remove(i);
            // testa se ainda há registros
            if (cli.size() > 0) {
                // volta para o primeiro registro
                i = 0;
                // carrega os dados do primeiro registro
                carregaDados();
            } else {
                JOptionPane.showMessageDialog(this, "Não há mais registros");
                // limpa os dados da tela
                limpaCampos();
                // ativa o formato de botões de início
                ativaInicio();
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    // método para carregar os dados do vetor dinâmico para a tela
    private void carregaDados() {
        // os dados serão carregados da posição corrente, ou seja, do valor
        // armazenado em i
        cliaux = cli.get(i); // recupera o cliente armazenado em i
        tfCodigo.setText(cliaux.getCodCliente() + "");
        tfNome.setText(cliaux.getNome());
        tfCelular.setText(cliaux.getCelular());
        tfEmail.setText(cliaux.getEmail());
        pfSenha.setText(cliaux.getSenha());
    }

    // método para ativar apenas os botões que podem ser utilizados quando um
    // novo registro está sendo editado
    public void ativaEdicao() {
        btPrimeiro.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);
        btExcluir.setEnabled(false);
        btNovo.setEnabled(false);
        btSalvar.setEnabled(true);
    }
    // método para ativar os botões para navegação novamente

    public void ativaNavegacao() {
        btPrimeiro.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btUltimo.setEnabled(true);
        btExcluir.setEnabled(true);
        btNovo.setEnabled(true);
        btSalvar.setEnabled(true);
    }
    // método para ativar os botões quando o processo está iniciando

    public void ativaInicio() {
        btPrimeiro.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
        btUltimo.setEnabled(false);
        btExcluir.setEnabled(false);
        btNovo.setEnabled(true);
        btSalvar.setEnabled(false);
    }

    // método para limpar os campos do formulário
    private void limpaCampos() {
        tfCodigo.setText("");
        tfNome.setText("");
        tfCelular.setText("");
        tfEmail.setText("");
        pfSenha.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ManterCliente dialog = new ManterCliente(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
