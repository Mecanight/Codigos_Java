/*Referente exercício 01, 02 e 03*/
package exerc1e2e3;

import modelo.Jogador;
import modelo.Time;
import modelo.Jogo;
import java.util.ArrayList;
import java.util.Date;

public class exerc1e2e3 {

    public static void main(String[] args) {

        Jogador joga1 = new Jogador(1, "Ronaldinho",
                "Gaucho", new Date(), 10, "Atacante", 9, 1, false);
        Jogador joga2 = new Jogador(2, "Gustavo",
                "Artilheiro", new Date(), 12, "Meio-Campo", 9, 2, false);
        Jogador joga3 = new Jogador(3, "Alexandre",
                "Caxopa", new Date(), 2, "Zagueiro", 7, 4, false);
        Jogador joga4 = new Jogador(4, "Zé",
                "Bala", new Date(), 5, "Lateral", 6, 3, false);
        Jogador joga5 = new Jogador(5, "Bino",
                "Baixinho", new Date(), 28, "Goleiro", 8, 0, false);

        Jogador joga6 = new Jogador(6, "Chico",
                "Sina", new Date(), 55, "Atacante", 8, 1, false);
        Jogador joga7 = new Jogador(7, "Elias",
                "Baito", new Date(), 19, "Meio-Campo", 6, 2, false);
        Jogador joga8 = new Jogador(8, "Tavares",
                "Cofapi", new Date(), 40, "Zagueiro", 8, 4, false);
        Jogador joga9 = new Jogador(9, "Paulo",
                "Ligeiro", new Date(), 85, "Lateral", 9, 3, false);
        Jogador joga10 = new Jogador(10, "Janio",
                "Sextou", new Date(), 43, "Goleiro", 9, 0, false);

        //plantel 1
        ArrayList plantel1 = new ArrayList();
        plantel1.add(joga1);
        plantel1.add(joga2);
        plantel1.add(joga3);
        plantel1.add(joga4);
        plantel1.add(joga5);
        //plantel 2
        ArrayList plantel2 = new ArrayList();
        plantel2.add(joga6);
        plantel2.add(joga7);
        plantel2.add(joga8);
        plantel2.add(joga9);
        plantel2.add(joga10);

        //time 1
        Time azul = new Time();
        azul.setNome("Gremio");
        azul.setApelido("Azul");
        azul.setFundacao(new Date());
        azul.setPlantel(plantel1);
        azul.relacionarJogador();
        // time 2
        Time vermelho = new Time();
        vermelho.setNome("Inter");
        vermelho.setApelido("Colorado");
        vermelho.setFundacao(new Date());
        vermelho.setPlantel(plantel2);
        vermelho.relacionarJogador();

        //escalação
        System.out.println("Escalação Gremio: " + azul.getRelacionados());
        System.out.println("Escalação Inter: " + vermelho.getRelacionados());

        //jogo 1
        Jogo jogo1 = new Jogo();
        jogo1.setDataDoJogo(new Date());
        jogo1.setEstadio("Beira Rio");
        jogo1.setPlacarMand(6);
        jogo1.setPlacarVis(6);
        jogo1.setMandante(vermelho);
        jogo1.setVisitante(azul);

        jogo1.gerarResultado();
        System.out.println(jogo1.gerarResultado());
    }
}
