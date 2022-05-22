/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Geri
 */
import java.util.Date;

public class Jogo {

    private Time mandante;
    private Time visitante;
    private Date dataDoJogo;
    private String estadio;
    private int placarMand;
    private int placarVis;

    public Jogo() {
    }

    public Jogo(Time mandante, Time visitante, Date dataDoJogo, String estadio, int placarMand, int placarVis) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.placarMand = placarMand;
        this.placarVis = placarVis;
    }

    public void gerarResultado() {
        int qm = 0, qv = 0, gm = 0, gv = 0;
        int r = (int) (Math.random() * 100);
        for (Jogador rel : this.getMandante().getRelacionados()) {
            qm = qm + rel.getQualidade();
        }
        for (Jogador rel : this.getVisitante().getRelacionados()) {
            qv = qv + rel.getQualidade();
        }
        if (qm > qv) {
            if (r <= 50) {
                gm = 3;
                gv = 0;
            } else if (r <= 80) {
                gm = 0;
                gv = 3;
            } else {
                gm = 0;
                gv = 0;
            }
        } else {
            if (r <= 50) {
                gm = 0;
                gv = 3;
            } else if (r <= 80) {
                gm = 3;
                gv = 0;
            } else {
                gm = 0;
                gv = 0;
            }
        }
        this.setPlacarVis(gv);
        this.setPlacarMand(gm);
    }

    public void gerarLesoes() {
        int nl = (int) (Math.random() * 3) + 1;
        int j, ct;
        for (int i = 0; i <= nl; i++) {
            j = (int) (Math.random() * 22) + 1;
            ct = 1;
            if (j <= 11) {
                for (Jogador rel : this.getMandante().getRelacionados()) {
                    if (j == ct) {
                        rel.sofrerLesao();
                    }
                }
            } else {
                j = j - 11;
                for (Jogador rel : this.getVisitante().getRelacionados()) {
                    if (j == ct) {
                        rel.sofrerLesao();
                    }
                }
            }
        }
    }

    public void gerarCartoes() {
        int nl = (int) (Math.random() * 10) + 1;
        int j, ct;
        for (int i = 0; i <= nl; i++) {
            j = (int) (Math.random() * 22) + 1;
            ct = 1;
            if (j <= 11) {
                for (Jogador rel : this.getMandante().getRelacionados()) {
                    if (j == ct) {
                        rel.aplicarCartao(1);
                    }
                }
            } else {
                j = j - 11;
                for (Jogador rel : this.getVisitante().getRelacionados()) {
                    if (j == ct) {
                        rel.aplicarCartao(1);
                    }
                }
            }
        }
    }

    public void permitirTreinamento() {
        for (Jogador rel : this.getMandante().getRelacionados()) {
            rel.executarTreinamento();
        }
        for (Jogador rel : this.getVisitante().getRelacionados()) {
            rel.executarTreinamento();
        }
    }

    @Override
    public String toString() {
        return "Jogo{" + "mandante=" + mandante + ", visitante=" + visitante + ", dataDoJogo=" + dataDoJogo + ", estadio=" + estadio + ", placarMand=" + placarMand + ", placarVis=" + placarVis + '}';
    }

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
