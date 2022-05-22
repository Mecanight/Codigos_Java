package controle;

import modelo.Baralho;
import modelo.Carta;

public class BlackJack {

    private int jogador; // posição carta jogador
    private int comput; // posição carta computador
    private int pjogador; // pontos do jogador
    private int pcomput; // pontos do computador
    private Carta[] cartasJ; //cartas do jogador
    private Carta[] cartasC; // cartas do computador
    private Baralho b;
    private static int vitorias = 0;
    private static int derrotas = 0;

    public BlackJack() {
    }

    public void iniciaJogo() {
        setJogador(0);
        setComput(0);
        setPjogador(0);
        setPcomput(0);
        setCartasJ(new Carta[5]);
        setCartasC(new Carta[5]);
        setB(new Baralho());
        getB().embaralhar();
    }

    public String novaCarta() {
        String msg = "";
        if (getJogador() > 4) {
            msg = "Limite de cartas atingido";
        } else if (getPjogador() > 21) {
            msg = "Você perdeu...!" + "Pontos: " + getPjogador();
            setDerrotas(getDerrotas() + 1);
        } else {
            setCartasJ(getJogador(), getB().distribuirCarta());
            int valor = getCartasJ(getJogador()).getValor();
            setPjogador(getPjogador() + (valor <= 10 ? valor : 10));
            setJogador(getJogador() + 1);
        }
        return msg;

    }

    public int somaCartas(Carta[] mao) {
        int soma = 0;
        int i = 0;
        while ((i <= 4) && (mao[i] != null)) {
            soma += mao[i].getValor() >= 10 ? 10 : mao[i].getValor();
            i++;
        }
        return soma;
    }

    public String geraResultado() {
        String res = "";
        if (getPjogador() > 21) {
            res = "Você perdeu...!" + "\nPontos: " + getPjogador();
            setDerrotas(getDerrotas() + 1);
        } else if (getPcomput() > 21) {
            res = "Você ganhou...!" + "\nPontos Jogador: " + getPjogador()
                    + "\nPontos Computador: " + getPcomput();
            setVitorias(getVitorias() + 1);
        } else if (getPjogador() > getPcomput()) {
            res = "Você ganhou...!" + "\nPontos Jogador: " + getPjogador()
                    + "\nPontos Computador: " + getPcomput();
            setVitorias(getVitorias() + 1);
        } else if (getPjogador() == getPcomput()) {
            res = "Você empatou...!" + "\nPontos Jogador: " + getPjogador()
                    + "\nPontos Computador: " + getPcomput();
        } else {
            res = "Você perdeu...!" + "\nPontos Jogador: " + getPjogador()
                    + "\nPontos Computador: " + getPcomput();
            setDerrotas(getDerrotas() + 1);
        }
        return res;
    }

    public Baralho getB() {
        return b;
    }

    public void setB(Baralho b) {
        this.b = b;
    }

    public Carta[] getCartasC() {
        return cartasC;
    }

    public void setCartasC(Carta[] cartasC) {
        this.cartasC = cartasC;
    }

    public Carta[] getCartasJ() {
        return cartasJ;
    }

    public Carta getCartasC(int pos) {
        return cartasC[pos];
    }

    public void setCartasC(int pos, Carta c) {
        cartasC[pos] = c;
    }

    public Carta getCartasJ(int pos) {
        return cartasJ[pos];
    }

    public void setCartasJ(int pos, Carta c) {
        cartasJ[pos] = c;
    }

    public void setCartasJ(Carta[] cartasJ) {
        this.cartasJ = cartasJ;
    }

    public int getComput() {
        return comput;
    }

    public void setComput(int comput) {
        this.comput = comput;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        BlackJack.derrotas = derrotas;
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getPcomput() {
        return pcomput;
    }

    public void setPcomput(int pcomput) {
        this.pcomput = pcomput;
    }

    public int getPjogador() {
        return pjogador;
    }

    public void setPjogador(int pjogador) {
        this.pjogador = pjogador;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        BlackJack.vitorias = vitorias;
    }

}
