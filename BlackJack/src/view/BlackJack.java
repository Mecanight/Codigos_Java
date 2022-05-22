package view;

public class BlackJack extends javax.swing.JFrame {

    public BlackJack() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btIniciar = new javax.swing.JButton();
        btNova = new javax.swing.JButton();
        btResultado = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlackJack - Jogue e divirta-se");
        setExtendedState(6);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartas do jogador"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartas do computador"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/capa.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jPanel2.add(jLabel7);
        jPanel2.add(jLabel8);
        jPanel2.add(jLabel9);
        jPanel2.add(jLabel10);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btIniciar.setText("Iniciar Jogo");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        jPanel3.add(btIniciar);

        btNova.setText("Nova Carta");
        btNova.setEnabled(false);
        btNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaActionPerformed(evt);
            }
        });
        jPanel3.add(btNova);

        btResultado.setText("Resultado");
        btResultado.setEnabled(false);
        btResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoActionPerformed(evt);
            }
        });
        jPanel3.add(btResultado);

        btSair.setText("Sair do Jogo");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel3.add(btSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-628)/2, (screenSize.height-597)/2, 628, 597);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int opc;
        opc = javax.swing.JOptionPane.showConfirmDialog(this, "Sair do jogo?");
        if (opc == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaActionPerformed
        String msg = jogo.novaCarta();
        if (!"".equals(msg)) {
            btNova.setEnabled(false);
            btResultado.setEnabled(false);
            javax.swing.JOptionPane.showMessageDialog(this, msg);
        }
        mostraCartas(jogo.getCartasJ(), cartasJ);
    }//GEN-LAST:event_btNovaActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        iniciaJogo();
        btNova.setEnabled(true);
        btResultado.setEnabled(true);
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoActionPerformed

        btNova.setEnabled(false);
        btResultado.setEnabled(false);
        int i = 0;
        while (jogo.somaCartas(jogo.getCartasC())
                < 15) {
            jogo.setCartasC(i,
                    jogo.getB().distribuirCarta());
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
    }//GEN-LAST:event_btResultadoActionPerformed

    public void iniciaJogo() {
        jogo = new controle.BlackJack();
        jogo.iniciaJogo();
        cartasJ = new javax.swing.JLabel[5];
        jLabel1.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/imagens/capa.jpg")));
        cartasJ[0] = jLabel1;
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel4.setIcon(null);
        jLabel5.setIcon(null);
        cartasC = new javax.swing.JLabel[5];
        jLabel6.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/imagens/capa.jpg")));
        cartasC[0] = jLabel6;
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);
        jLabel9.setIcon(null);
        jLabel10.setIcon(null);
        cartasC[1] = jLabel7;
        cartasC[2] = jLabel8;
        cartasC[3] = jLabel9;
        cartasC[4] = jLabel10;
        cartasJ[1] = jLabel2;
        cartasJ[2] = jLabel3;
        cartasJ[3] = jLabel4;
        cartasJ[4] = jLabel5;

    }

    public void mostraCartas(
            modelo.Carta[] mao,
            javax.swing.JLabel[] cartas) {
        int i = 0;
        while ((i < 5) && (mao[i] != null)) {
            cartas[i].setIcon(new javax.swing.ImageIcon(
                    getClass().getResource(
                            mao[i].getFigura())));
            i++;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new BlackJack().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btNova;
    private javax.swing.JButton btResultado;
    private javax.swing.JButton btSair;
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
    controle.BlackJack jogo;
    javax.swing.JLabel cartasJ[];
    javax.swing.JLabel cartasC[];
}
