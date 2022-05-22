/*Referente exercício 01, 02 e 03*/
package modelo;

import java.util.Date;
import modelo.Time;
import modelo.Jogador;

public class Jogo {

    private Time mandante;
    private Time visitante;
    private Date dataDoJogo;
    private String estadio;
    private int placarMand;
    private int placarVis;

    public Jogo() {
    }

    public Jogo(Time mandante, Time visitante, Date dataDoJogo,
            String estadio, int placarMand, int placarVis) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.placarMand = placarMand;
        this.placarVis = placarVis;
    }

    @Override
    public String toString() {
        return "Jogo{" + "mandante=" + mandante + ", visitante="
                + visitante + ", dataDoJogo=" + dataDoJogo
                + ", estadio=" + estadio + ", placarMand="
                + placarMand + ", placarVis=" + placarVis + '}';
    }

    //
    //
    //
    public String gerarResultado() {
        String ret = "";
        int chanceGanhar;
        chanceGanhar = (int) (Math.random() * 100);
        if (this.mandante.somaQualidade() > this.visitante.somaQualidade()) {
            if (chanceGanhar <= 50) {
                ret = "O time " + this.mandante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            } else if (chanceGanhar <= 80) {
                ret = "O time " + this.visitante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            } else {
                ret = "Empate " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            }
        } else if (this.mandante.somaQualidade() < this.visitante.somaQualidade()) {
            if (chanceGanhar <= 50) {
                ret = "O time " + this.visitante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            } else if (chanceGanhar <= 80) {
                ret = "O time " + this.mandante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            } else {
                ret = "Empate " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade()
                        + " Valor da %: " + " -- " + chanceGanhar;
            }
        } else {
            if (chanceGanhar <= 50) {
                ret = "O time " + this.visitante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            } else {
                ret = "O time " + this.mandante.getNome()
                        + " é o ganhador " + "Qual. Mand: " + this.mandante.somaQualidade()
                        + " - " + "Qual. Visi: " + this.visitante.somaQualidade() + " -- "
                        + " Valor da %: " + chanceGanhar;
            }
        }
        return ret;
    }

    public void gerarLesoes() {
        int timeAleat, jogadAleat;
        timeAleat = (int) (Math.random() * 2);
        if (timeAleat == 0) {
            mandante.getRelacionados();
           jogadAleat = (int) (Math.random() * 4);
            for (Jogador jogador : mandante.getRelacionados()) {
                mandante.getRelacionados().get(0);
                jogador.sofrerLesao();
            }
        } else {
            visitante.getRelacionados();
            jogadAleat = (int) (Math.random() * 3);
            for (Jogador jogador : visitante.getRelacionados()) {
                jogador.sofrerLesao();
            }
        }
    }

    public void gerarCartoes() {
        int timeAleat, jogadAleat;
        timeAleat = (int) (Math.random() * 1);
        if (timeAleat == 0) {
            mandante.getRelacionados();
            jogadAleat = (int) (Math.random() * 3);
            for (Jogador jogador : mandante.getRelacionados()) {
                jogador.aplicarCartao(1);
            }
        } else {
            visitante.getRelacionados();
            jogadAleat = (int) (Math.random() * 3);
            for (Jogador jogador : mandante.getRelacionados()) {
                jogador.aplicarCartao(1);
            }
        }
    }

    public void permitirTreinamento() {
        int timeAleat, jogadAleat;
        timeAleat = (int) (Math.random() * 1);
        if (timeAleat == 0) {
            mandante.getRelacionados();
            jogadAleat = (int) (Math.random() * 3);
            for (Jogador jogador : mandante.getRelacionados()) {
                jogador.executarTreinamento();
            }
        } else {
            visitante.getRelacionados();
            jogadAleat = (int) (Math.random() * 3);
            for (Jogador jogador : mandante.getRelacionados()) {
                jogador.executarTreinamento();
            }
        }
    }
    //
    //
    //

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public Date getDataDoJogo() {
        return dataDoJogo;
    }

    public void setDataDoJogo(Date dataDoJogo) {
        this.dataDoJogo = dataDoJogo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getPlacarMand() {
        return placarMand;
    }

    public void setPlacarMand(int placarMand) {
        this.placarMand = placarMand;
    }

    public int getPlacarVis() {
        return placarVis;
    }

    public void setPlacarVis(int placarVis) {
        this.placarVis = placarVis;
    }
}
