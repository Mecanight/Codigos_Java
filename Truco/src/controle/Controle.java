package controle;

import modelo.Carta1;
import modelo.Baralho1;

public class Controle {

    private int jogador;
    private int comput;
    private int pjogador;
    private int pcomput;
    private Carta1[] cartasJ;
    private Carta1[] cartasC;
    private Baralho1 b;
    private static int vitorias = 0;
    private static int derrotas = 0;

    public Controle() {
    }

    public Controle(int jogador, int comput, int pjogador, int pcomput,
            Carta1[] cartasJ, Carta1[] cartasC, Baralho1 b) {
        this.jogador = jogador;
        this.comput = comput;
        this.pjogador = pjogador;
        this.pcomput = pcomput;
        this.cartasJ = cartasJ;
        this.cartasC = cartasC;
        this.b = b;
    }

    public void iniciaJogo() {
        setJogador(0);
        setComput(0);
        setPjogador(0);
        setPcomput(0);
        setCartasJ(new Carta1[5]);
        setCartasC(new Carta1[5]);
        setB(new Baralho1());
        getB().embaralhar();
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getComput() {
        return comput;
    }

    public void setComput(int comput) {
        this.comput = comput;
    }

    public int getPjogador() {
        return pjogador;
    }

    public void setPjogador(int pjogador) {
        this.pjogador = pjogador;
    }

    public int getPcomput() {
        return pcomput;
    }

    public void setPcomput(int pcomput) {
        this.pcomput = pcomput;
    }

    public Carta1[] getCartasJ() {
        return cartasJ;
    }

    public void setCartasJ(Carta1[] cartasJ) {
        this.cartasJ = cartasJ;
    }

    public Carta1[] getCartasC() {
        return cartasC;
    }

    public void setCartasC(Carta1[] cartasC) {
        this.cartasC = cartasC;
    }

    public Baralho1 getB() {
        return b;
    }

    public void setB(Baralho1 b) {
        this.b = b;
    }

    public static int getVitorias() {
        return vitorias;
    }

    public static void setVitorias(int vitorias) {
        Controle.vitorias = vitorias;
    }

    public static int getDerrotas() {
        return derrotas;
    }

    public static void setDerrotas(int derrotas) {
        Controle.derrotas = derrotas;
    }

}
