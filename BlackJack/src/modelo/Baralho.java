package modelo;

import java.util.ArrayList;

public class Baralho {

    private ArrayList<Carta> monte;
    private int topo;

    public Baralho() {
        monte = new ArrayList();
        topo = -1;
        String f;
        for (int n = Carta.PAUS; n <= Carta.OUROS; n++) {
            for (int v = 1; v <= 13; v++) {
                f = "/imagens/" + v + "" + n + ".jpg";
                monte.add(new Carta(n, v, f));
                topo++;
            }
        }
    }

    public Carta distribuirCarta() {
        return (Carta) monte.get(--topo);
    }

    public void embaralhar() {
        for (int i = 1; i <= 10; i++) {
            for (int c = 0; c < 52; c++) {
                int aux = (int) (Math.random() * 51);
                Carta tmp = monte.get(c);
                monte.set(c, monte.get(aux));
                monte.set(aux, tmp);
            }
        }
    }

    public Baralho(ArrayList<Carta> monte, int topo) {
        this.monte = monte;
        this.topo = topo;
    }

    public ArrayList<Carta> getMonte() {
        return monte;
    }

    public void setMonte(ArrayList<Carta> monte) {
        this.monte = monte;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
