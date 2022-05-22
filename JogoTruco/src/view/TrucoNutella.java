
package view;

public class TrucoNutella extends javax.swing.JFrame {

    public TrucoNutella() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btIniciar = new javax.swing.JButton();
        btNovaCarta = new javax.swing.JButton();
        btResultado = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartas do Jogador"));
        jPanel3.setPreferredSize(new java.awt.Dimension(622, 220));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jPanel3.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel3.add(jLabel7);
        jPanel3.add(jLabel8);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartas do Computador"));
        jPanel2.setPreferredSize(new java.awt.Dimension(844, 220));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel6);
        jPanel2.add(jLabel9);
        jPanel2.add(jLabel10);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btIniciar.setText("Iniciar Jogo");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btIniciar);

        btNovaCarta.setText("Nova Carta");
        btNovaCarta.setEnabled(false);
        btNovaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaCartaActionPerformed(evt);
            }
        });
        jPanel1.add(btNovaCarta);

        btResultado.setText("Resultado");
        btResultado.setEnabled(false);
        btResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btResultado);

        btFechar.setText("Fechar Jogo");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoActionPerformed

        btNovaCarta.setEnabled(false);
        btResultado.setEnabled(false);
        int i = 0;
        while (i < 3) {
            jogo.setCartasC(i, jogo.getB().distribuirCartas());
            i++;
        }
        jogo.setPcomput(jogo.somaCartas(
                jogo.getCartasC()));
        mostraCartas(jogo.getCartasC(), cartasC);
        String aux = jogo.geraResultado();
        javax.swing.JOptionPane.showMessageDialog(this,
                aux);
        javax.swing.JOptionPane.showMessageDialog(this,
                "\nVitórias: " + jogo.getVitorias() + "\n"
                + "Derrotas: " + jogo.getDerrotas());
        btIniciar.setEnabled(true);
    }//GEN-LAST:event_btResultadoActionPerformed

    public void iniciaJogo() {
        jogo = new jogotruco.JogoTruco();
        jogo.iniciaJogo();
        cartasJ = new javax.swing.JLabel[5];
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg")));
        cartasJ[0] = jLabel1;
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel7.setIcon(null);
        cartasC = new javax.swing.JLabel[5];
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg")));
        cartasC[0] = jLabel4;
        jLabel5.setIcon(null);
        jLabel6.setIcon(null);
        jLabel9.setIcon(null);
        cartasC[1] = jLabel5;
        cartasC[2] = jLabel6;
        cartasC[3] = jLabel9;
        cartasC[4] = jLabel10;
        cartasJ[1] = jLabel2;
        cartasJ[2] = jLabel3;
        cartasJ[3] = jLabel7;
        cartasJ[4] = jLabel8;

    }

    public void mostraCartas(
            modelo.Cartas[] mao, javax.swing.JLabel[] cartas) {
        int i = 0;
        while ((i < 3) && (mao[i] != null)) {
            cartas[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(mao[i].getFigura())));
            i++;
        }
    }

    private void btNovaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaCartaActionPerformed
        // TODO add your handling code here:
        String msg = jogo.novaCarta();
        if (!"".equals(msg)) {
            btNovaCarta.setEnabled(false);
            btIniciar.setEnabled(false);
            javax.swing.JOptionPane.showMessageDialog(this, msg);
        }
        mostraCartas(jogo.getCartasJ(), cartasJ);
    }//GEN-LAST:event_btNovaCartaActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        // TODO add your handling code here:
        int opc;
        opc = javax.swing.JOptionPane.showConfirmDialog(this, "Sair do jogo?");
        if (opc == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        // TODO add your handling code here:
        iniciaJogo();
        btNovaCarta.setEnabled(true);
        btResultado.setEnabled(true);
    }//GEN-LAST:event_btIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TrucoNutella().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btNovaCarta;
    private javax.swing.JButton btResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    jogotruco.JogoTruco jogo;
    javax.swing.JLabel cartasJ[];
    javax.swing.JLabel cartasC[];
}
