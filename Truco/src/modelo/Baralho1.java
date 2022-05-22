package modelo;

import java.util.ArrayList;

public class Baralho1 {

    private ArrayList<Carta1> monte;
    private int topo;

    public Baralho1() {
        monte = new ArrayList();
        topo = -1;
        String f;
        for (int n = Carta1.PAUS; n <= Carta1.OUROS; n++) {
            for (int v = 1; v <= 13; v++) {
                f = "/imagens/" + v + "" + n + ".jpg";
                monte.add(new Carta1(n, v, f));
                topo++;
            }
        }
    }

    public Carta1 distribuirCarta() {
        return (Carta1) monte.get(--topo);
    }

    public void embaralhar() {
        for (int i = 1; i <= 10; i++) {
            for (int c = 0; c < 52; c++) {
                int aux = (int) (Math.random() * 51);
                Carta1 tmp = monte.get(c);
                monte.set(c, monte.get(aux));
                monte.set(aux, tmp);
            }
        }
    }

    public Baralho1(ArrayList<Carta1> monte, int topo) {
        this.monte = monte;
        this.topo = topo;
    }

    public ArrayList<Carta1> getMonte() {
        return monte;
    }

    public void setMonte(ArrayList<Carta1> monte) {
        this.monte = monte;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
