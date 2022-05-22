/*

 */
package modelo;

import java.util.ArrayList;
/*
 *
 * @author ronie
 */
public class Baralho {
    private ArrayList<Cartas>monte;
    private int topo;
    
     public Baralho() {
        monte = new ArrayList();
        topo = -1;
        String f;
        for(int n = Cartas.PAUS; n <= Cartas.OUROS;n++){
            for(int v = 1; v <= 13; v++){
                f = "/imagens/"+v+""+n+".jpg";
                monte.add(new Cartas(n,v,f));
                topo++;
            }
        }
    }
         public Cartas distribuirCartas(){
        return (Cartas)monte.get(--topo);
    }

    public void embaralhar(){
        for(int i = 1; i <= 10;i++)
        for (int c = 0; c < 52; c++){
            int aux = (int)(Math.random()*51);
            Cartas tmp = monte.get(c);
            monte.set(c, monte.get(aux));
            monte.set(aux, tmp);
        }
    }

    public Baralho(ArrayList<Cartas> monte, int topo) {
        this.monte = monte;
        this.topo = topo;
    }


    public ArrayList<Cartas> getMonte() {
        return monte;
    }

    public void setMonte(ArrayList<Cartas> monte) {
        this.monte = monte;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
}
