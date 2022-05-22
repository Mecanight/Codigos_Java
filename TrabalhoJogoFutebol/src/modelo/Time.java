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
import java.util.ArrayList;
import java.util.Collections;
public class Time {
    private String nome;
    private String apelido;
    private String escudo;
    private Date fundacao;
    private ArrayList<Jogador> plantel;
    private ArrayList<Jogador> relacionados;

    public Time() {
    }

    public Time(String nome, String apelido, String escudo, Date fundacao, ArrayList<Jogador> plantel, ArrayList<Jogador> relacionados) {
        this.nome = nome;
        this.apelido = apelido;
        this.escudo = escudo;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionados = relacionados;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", apelido=" + apelido + ", escudo=" + escudo + ", fundacao=" + fundacao + ", plantel=" + plantel + ", relacionados=" + relacionados + '}';
    }
    
    public void ordenaPorQualidade(){
        Collections.sort(plantel);        
    }
    
    public ArrayList<Jogador> relacionarJog(){
        ArrayList<Jogador> ret = new ArrayList();
        int n = 0;
        ordenaPorQualidade();
        for (Jogador j : this.getPlantel()) {
            if(j.verificaCondicao()){
                ret.add(j);
                n++;
            }
            if (n >= 3){
                break;
            }
        }
        this.setRelacionados(ret);
        return ret;
    }
    
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

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
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
