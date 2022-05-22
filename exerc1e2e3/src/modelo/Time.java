/*Referente exercício 01, 02 e 03*/
package modelo;

import java.util.ArrayList;
import java.util.Date;
import modelo.Jogador;

public class Time {

    private String nome;
    private String apelido;
    private Date fundacao;
    private ArrayList<Jogador> plantel;
    private ArrayList<Jogador> relacionados;

    public Time() {
    }

    public Time(String nome, String apelido, Date fundacao,
            ArrayList<Jogador> plantel, ArrayList<Jogador> relacionados) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionados = relacionados;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", apelido="
                + apelido + ", fundacao=" + fundacao + ", plantel="
                + plantel + ", relacionados=" + relacionados + '}';
    }

    //
    //
    //
    public void relacionarJogador() {
        ArrayList<Jogador> aux = new ArrayList();
        int ct = 0;
        for (Jogador jogador : this.getPlantel()) {
            aux.add(jogador);
            ct++;
            if (ct == 4) {
                break;
            }
        }
        this.setRelacionados(aux);
    }

    public int somaQualidade() {
        int soma = 0;
        for (Jogador jogador : this.getRelacionados()) {
            soma = soma + jogador.getQualidade();
        }
        return soma;
    }
    //
    //
    //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public ArrayList<Jogador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jogador> plantel) {
        this.plantel = plantel;
    }

    public ArrayList<Jogador> getRelacionados() {
        return relacionados;
    }

    public void setRelacionados(ArrayList<Jogador> relacionados) {
        this.relacionados = relacionados;
    }

}
