/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojogofutebol;

/**
 *
 * @author Geri
 */
import java.util.Date;
import java.util.ArrayList;
import modelo.Jogador;
import modelo.Jogo;
import modelo.Time;
public class TrabalhoJogoFutebol {

    public static void main(String[] args) {
        Jogador j1 = new Jogador(1,"Daniel","mão de alface",
        new Date(), 1, "goleiro", 70,0,false);
        Jogador j2 = new Jogador(2,"Cuesta","foice",
        new Date(), 2, "zagueiro", 90,0,false);
        Jogador j3 = new Jogador(3,"Rodrigo","Dourado",
        new Date(), 3, "meio de campo", 80,0,false);
        Jogador j4 = new Jogador(4,"Patrick","Pantera",
        new Date(), 4, "atacante", 85,0,false);
        Jogador j5 = new Jogador(5,"Yuri","goleador",
        new Date(), 5, "atacante", 85,0,false);
        ArrayList<Jogador> t1 = new ArrayList();
        t1.add(j1);
        t1.add(j2);
        t1.add(j3);
        t1.add(j4);
        t1.add(j5);
        Jogador j6 = new Jogador(1,"Gabriel","Chapecó",
        new Date(), 1, "goleiro", 80,0,false);
        Jogador j7 = new Jogador(2,"Rodrigues","furão",
        new Date(), 2, "zagueiro", 60,0,false);
        Jogador j8 = new Jogador(3,"Douglas","costa",
        new Date(), 3, "meio de campo", 30,0,false);
        Jogador j9 = new Jogador(4,"Diego","Souza",
        new Date(), 4, "atacante", 25,0,false);
        Jogador j10 = new Jogador(5,"Alisson","salvação",
        new Date(), 5, "atacante", 35,0,false);
        ArrayList<Jogador> t2 = new ArrayList();
        t2.add(j6);
        t2.add(j7);
        t2.add(j8);
        t2.add(j9);
        t2.add(j10);
        Time time1 = new Time("Inter","Colorado","achar",new Date(),
        t1,new ArrayList());
        Time time2 = new Time("Grêmio","Tricolor","achar",new Date(),
        t2,new ArrayList());
        time1.relacionarJog();
        time2.relacionarJog();
        Jogo jogo1 = new Jogo();
        jogo1.setDataDoJogo(new Date());
        jogo1.setEstadio("Beira Rio");
        jogo1.setMandante(time1);
        jogo1.setVisitante(time2);
        jogo1.gerarResultado();
        jogo1.permitirTreinamento();
        jogo1.gerarCartoes();
        jogo1.gerarLesoes();        
        System.out.println("Jogo 1: "+jogo1.toString());
    }
    
}
