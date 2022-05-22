
package jogotruco;

import modelo.Baralho;
import modelo.Cartas;

public class JogoTruco {
    private int jogador;
    private int comput; 
    private int pjogador; 
    private int pcomput;
    private Cartas[] cartasJ;
    private Cartas[] cartasC;
    private Baralho b;
    private static int vitorias = 0;
    private static int derrotas = 0;

    public JogoTruco() {
    }

    public void iniciaJogo() {
        setJogador(0);
        setComput(0);
        setPjogador(0);
        setPcomput(0);
        setCartasJ(new Cartas[5]);
        setCartasC(new Cartas[5]);
        setB(new Baralho());
        getB().embaralhar();
    }

    public String novaCarta() {
        String msg = "";
        if (getJogador() > 2) {
            msg = "Limite de cartas atingido";
            
        } else {
            setCartasJ(getJogador(), getB().distribuirCartas());
            int valor = getCartasJ(getJogador()).getValor();
            setPjogador(getPjogador() + (valor <= 10 ? valor : 10));
            setJogador(getJogador() + 1);
        }
        return msg;

    }

    public int somaCartas(Cartas[] mao) {
        int soma = 0;
        int i = 0;
        while ((i <= 2) && (mao[i] != null)) {
            soma += mao[i].getValor() >= 10 ? 10 : mao[i].getValor();
            i++;
        }
        return soma;
    }

    public String geraResultado() {
        String res = "";
        if (getPjogador() > getPcomput()) {
            res = "Você ganhou...!" + "\nPontos Jogador: " + getPjogador() + "\nPontos Computador: " + getPcomput();
            setVitorias(getVitorias() + 1);
        } else if (getPjogador() == getPcomput()) {
            res = "Você empatou...!" + "\nPontos Jogador: " + getPjogador() + "\nPontos Computador: " + getPcomput();
        } else {
            res = "Você perdeu...!" + "\nPontos Jogador: " + getPjogador() + "\nPontos Computador: " + getPcomput();
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

    public Cartas[] getCartasC() {
        return cartasC;
    }

    public void setCartasC(Cartas[] cartasC) {
        this.cartasC = cartasC;
    }

    public Cartas[] getCartasJ() {
        return cartasJ;
    }

    public Cartas getCartasC(int pos) {
        return cartasC[pos];
    }

    public void setCartasC(int pos, Cartas c) {
        cartasC[pos] = c;
    }

    public Cartas getCartasJ(int pos) {
        return cartasJ[pos];
    }

    public void setCartasJ(int pos, Cartas c) {
        cartasJ[pos] = c;
    }

    public void setCartasJ(Cartas[] cartasJ) {
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
        JogoTruco.derrotas = derrotas;
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
        JogoTruco.vitorias = vitorias;
    }

}
