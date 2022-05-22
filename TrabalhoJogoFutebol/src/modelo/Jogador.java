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

public class Jogador implements Comparable<Jogador> {

    private int id;
    private String nome;
    private String apelido;
    private Date dataNasc;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, Date dataNasc, int numero, String posicao, int qualidade, int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNasc = dataNasc;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", dataNasc=" + dataNasc + ", numero=" + numero + ", posicao=" + posicao + ", qualidade=" + qualidade + ", cartoes=" + cartoes + ", suspenso=" + suspenso + '}';
    }

    public boolean verificaCondicao() {
        boolean ret = true;
        if (this.isSuspenso()) {
            ret = false;
        }
        return ret;
    }

    public void aplicarCartao(int n) {
        this.setCartoes(this.getCartoes() + n);
        if (this.getCartoes() >= 3) {
            this.setSuspenso(true);
        }
    }

    public void cumprirSuspensao() {
        this.setCartoes(0);
        this.setSuspenso(false);
    }

    public void sofrerLesao() {
        int n = (int) (Math.random() * 100);
        int q = this.getQualidade();
        if (n <= 5) {
            q = q - (q * 15 / 100);
        } else if (n <= 15) {
            q = q - (q * 10 / 100);
        } else if (n <= 30) {
            q = q - (q * 5 / 100);
        } else if (n <= 60) {
            q = q - 2;
        } else {
            q = q - 1;
        }
        this.setQualidade(q);
    }

    public void executarTreinamento() {
        int n = (int) (Math.random() * 100);
        int q = this.getQualidade();
        if (n <= 5) {
            q = q + 5;
        } else if (n <= 15) {
            q = q + 4;
        } else if (n <= 30) {
            q = q + 3;
        } else if (n <= 60) {
            q = q + 2;
        } else {
            q = q + 1;
        }
        this.setQualidade(q);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    @Override
    public int compareTo(Jogador t) {
        if (this.getQualidade() > t.getQualidade()) {
            return -1;
        }
        if (this.getQualidade() < t.getQualidade()) {
            return 1;
        }
        return 0;
    }
}
