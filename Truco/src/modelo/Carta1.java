package modelo;

public class Carta1 {

    public final static int PAUS = 1;
    public final static int COPAS = 2;
    public final static int ESPADAS = 3;
    public final static int OUROS = 4;
    private int naipe;
    private int valor;
    private String figura;

    public Carta1() {
    }

    public Carta1(int naipe, int valor, String figura) {
        this.naipe = naipe;
        this.valor = valor;
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "Carta1{" + "naipe=" + naipe + ", valor=" + valor
                + ", figura=" + figura + '}';
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

}
