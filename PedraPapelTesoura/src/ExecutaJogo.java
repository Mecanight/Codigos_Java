
public class ExecutaJogo extends javax.swing.JFrame {

    public ExecutaJogo() {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btPapel = new javax.swing.JButton();
        btPedra = new javax.swing.JButton();
        btTesoura = new javax.swing.JButton();
        btLagarto = new javax.swing.JButton();
        btSpock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Pedra, Papel e Tesoura OO");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PapelM1.jpg"))); // NOI18N
        btPapel.setToolTipText("Pressione para selecionar papel");
        btPapel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PapelM2.jpg"))); // NOI18N
        btPapel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel_mao1.jpg"))); // NOI18N
        btPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPapelActionPerformed(evt);
            }
        });
        jPanel1.add(btPapel);

        btPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PedraM1.jpg"))); // NOI18N
        btPedra.setToolTipText("Pressione para selecionar Pedra");
        btPedra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PedraM2.jpg"))); // NOI18N
        btPedra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedra_mao1.jpg"))); // NOI18N
        btPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedraActionPerformed(evt);
            }
        });
        jPanel1.add(btPedra);

        btTesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TesouraM1.jpg"))); // NOI18N
        btTesoura.setToolTipText("Pressione para selecionar tesoura");
        btTesoura.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TesouraM2.jpg"))); // NOI18N
        btTesoura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tesoura_mao1.jpg"))); // NOI18N
        btTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTesouraActionPerformed(evt);
            }
        });
        jPanel1.add(btTesoura);

        btLagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-40-16.png"))); // NOI18N
        btLagarto.setToolTipText("Pressione para selecionar Lagarto");
        btLagarto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-40-16.png"))); // NOI18N
        btLagarto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-40-16.png"))); // NOI18N
        btLagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLagartoActionPerformed(evt);
            }
        });

        btSpock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-41-41.png"))); // NOI18N
        btSpock.setToolTipText("Pressione para selecionar Spock");
        btSpock.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-41-41.png"))); // NOI18N
        btSpock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela de 2021-10-29 21-41-41.png"))); // NOI18N
        btSpock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btLagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSpock, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSpock, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(785, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedraActionPerformed

    c1 = new Pedra();
    geraResultado();
}//GEN-LAST:event_btPedraActionPerformed

private void btPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPapelActionPerformed

    c1 = new Papel();
    geraResultado();
}//GEN-LAST:event_btPapelActionPerformed

private void btTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTesouraActionPerformed

    c1 = new Tesoura();
    geraResultado();
}//GEN-LAST:event_btTesouraActionPerformed

    private void btLagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLagartoActionPerformed
        c1 = new Lagarto();
        geraResultado();
    }//GEN-LAST:event_btLagartoActionPerformed

    private void btSpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpockActionPerformed
        c1 = new Spock();
        geraResultado();
    }//GEN-LAST:event_btSpockActionPerformed

    public void geraResultado() {
        int opc = (int) (Math.random() * 5);
        if (opc == 0) {
            c2 = new Tesoura();
        } else if (opc == 1) {
            c2 = new Papel();
        } else if (opc == 2) {
            c2 = new Pedra();
        } else if (opc == 3) {
            c2 = new Lagarto();
        } else {
            c2 = new Spock();
        }
        c1.compara(c2);
        int res = c1.getResultado();
        String aux = c1.acao();
        String msgtit;
        if (res >= 1){
            msgtit = "Você ganhou";
        } else if (res == 0) {
            msgtit = "Você empatou";
        } else {
            msgtit = "Você perdeu";
        }
        javax.swing.JOptionPane.showMessageDialog(null,
                "<HTML><H2>" + c1.getTipo() + "  " + aux + " "
                + c2.getTipo() + "</HTML>",
                "Resultado final: " + msgtit,
                0,
                new javax.swing.ImageIcon(
                        getClass().getResource(
                                "/imagens/resultado.jpg")));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ExecutaJogo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLagarto;
    private javax.swing.JButton btPapel;
    private javax.swing.JButton btPedra;
    private javax.swing.JButton btSpock;
    private javax.swing.JButton btTesoura;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    Coisa c1, c2;
}
