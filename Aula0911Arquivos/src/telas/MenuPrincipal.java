
package telas;

import entidades.Cidade;
import entidades.Cliente;
import entidades.Solicitacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import util.GravaArquivoBinario;
import util.LerArquivoBinario;

public class MenuPrincipal extends javax.swing.JFrame {

    List<Cliente> listacli = new ArrayList();
    List<Solicitacao> listasol = new ArrayList();
    List<Cidade> listacid = new ArrayList();

    public MenuPrincipal() {
        // com estas linhas o padrão dos botões será o do windows
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        initComponents();
        listacid = LerArquivoBinario.lerDados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miSolicitacoes = new javax.swing.JMenuItem();
        miCidades = new javax.swing.JMenuItem();
        miEstatistica = new javax.swing.JMenuItem();
        miLerEstatistica = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo de utilização de componentes para ambiente desktop");
        setExtendedState(6);

        jMenu1.setText("Arquivo");

        miClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        miClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        jMenu1.add(miClientes);

        miSolicitacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_MASK));
        miSolicitacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/layout_sidebar.png"))); // NOI18N
        miSolicitacoes.setText("Solicitações");
        miSolicitacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSolicitacoesActionPerformed(evt);
            }
        });
        jMenu1.add(miSolicitacoes);

        miCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anchor.png"))); // NOI18N
        miCidades.setText("Cidades");
        miCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCidadesActionPerformed(evt);
            }
        });
        jMenu1.add(miCidades);

        miEstatistica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        miEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calculator.png"))); // NOI18N
        miEstatistica.setText("Gerar Estatística de Cidades");
        miEstatistica.setToolTipText("Número de cidades feias e modernas");
        miEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstatisticaActionPerformed(evt);
            }
        });
        jMenu1.add(miEstatistica);

        miLerEstatistica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_MASK));
        miLerEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calculator_link.png"))); // NOI18N
        miLerEstatistica.setText("Ler Estatística de Cidades");
        miLerEstatistica.setToolTipText("Ler dados do arquivo texto");
        miLerEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLerEstatisticaActionPerformed(evt);
            }
        });
        jMenu1.add(miLerEstatistica);
        jMenu1.add(jSeparator1);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/door_in.png"))); // NOI18N
        miSair.setText("Sair do Sistema");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        jMenu1.add(miSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        miSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tux.png"))); // NOI18N
        miSobre.setText("Sobre o sistema");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        jMenu2.add(miSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-336)/2, 416, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        // TODO add your handling code here:
        // criação de um objeto da classe mantercliente
        // passando como parâmetros que o formulário é modal
        // e que receberá uma lista de clientes para atualizar
        JDialog cli = new ManterCliente(this, true, listacli);
        cli.setVisible(true);
    }//GEN-LAST:event_miClientesActionPerformed

    private void miSolicitacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSolicitacoesActionPerformed
        // TODO add your handling code here:
        // criação de um objeto da classe mantersolicitacao
        // passando como parâmetros que o formulário é modal
        // e que receberá uma lista de clientes e solicitacoes para atualizar
        JDialog sol = new ManterSolicitacao(this, true,
                listacli, listasol);
        sol.setVisible(true);
    }//GEN-LAST:event_miSolicitacoesActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        // TODO add your handling code here:
        // Utilizando a saída do sistema com opções sim e não
        Object[] opcoes = {"Sim", "Não"};
        int opc = javax.swing.JOptionPane.showOptionDialog(this,
                "Sair do sistema ?", "Saída do Sistema",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]);
        if (opc == 0) {
            GravaArquivoBinario.gravaArquivoBinario(listacid);
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        // TODO add your handling code here:
        JDialog sobre = new Sobre(this, true);
        sobre.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCidadesActionPerformed
        // TODO add your handling code here:
        JDialog cid = new ManterCidade(this, true,
                listacid);
        cid.setVisible(true);
    }//GEN-LAST:event_miCidadesActionPerformed

    private void miEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEstatisticaActionPerformed
        try {
            // TODO add your handling code here:
            FileWriter arq = new FileWriter("estcidade.txt");
            PrintWriter gravaArq = new PrintWriter(arq);
            for (int i = 0; i < listacid.size(); i++) {
                gravaArq.println("Código| " + listacid.get(i).getCodCidade()
                        + ";Cidade| " + listacid.get(i).getCidade()
                        + ";Estado| " + listacid.get(i).getEstado());
            }
            gravaArq.close();
            JOptionPane.showMessageDialog(this, "Arquivo gerado com sucesso");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Deu erro no arquivo");
        }

    }//GEN-LAST:event_miEstatisticaActionPerformed

    private void miLerEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLerEstatisticaActionPerformed
        try {
            // TODO add your handling code here:
            FileReader arq = new FileReader("estcidade.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String aux = "";
            String linha = lerArq.readLine();
            while (linha != null) {
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == '|') {
                        aux += ": ";
                    } else if (linha.charAt(i) == ';') {
                        aux += "\n";
                    } else {
                        aux += linha.charAt(i);
                    }
                }
                aux += "\n\n";
                linha = lerArq.readLine();
            }
            JOptionPane.showMessageDialog(this, "Dados no arquivo: " + aux);
            lerArq.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Deu erro no arquivo");
        }
    }//GEN-LAST:event_miLerEstatisticaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem miCidades;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miEstatistica;
    private javax.swing.JMenuItem miLerEstatistica;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miSolicitacoes;
    // End of variables declaration//GEN-END:variables

}
