/*Referente exercício 01, 02 e 03*/
package modelo;

import java.util.Date;

public class Jogador {

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

    public Jogador(int id, String nome, String apelido,
            Date dataNasc, int numero, String posicao,
            int qualidade, int cartoes, boolean suspenso) {
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
        return "Jogador{" + "id=" + id + ", nome=" + nome
                + ", apelido=" + apelido + ", dataNasc="
                + dataNasc + ", numero=" + numero + ", posicao="
                + posicao + ", qualidade=" + qualidade + ", cartoes="
                + cartoes + ", suspenso=" + suspenso + '}';
    }

    //
    //
    //
    public boolean verificaCondicao() {
        boolean ret = true;
        if (this.getCartoes() >= 3) {
            this.setSuspenso(true);
            ret = false;
        }
        return ret;
    }

    public void aplicarCartao(int quantidade) {
        this.setCartoes(this.getCartoes() + quantidade);
    }

    public void cumprirSuspencao() {
        this.setCartoes(0);
        this.setSuspenso(false);
    }

    public void sofrerLesao() {
        int probLesao, resultQuali = 0;
        probLesao = (int) (Math.random() * 100);
        if (probLesao <= 5) {
            resultQuali = (int) (this.getQualidade() * 0.85);
        } else if (probLesao <= 15) {
            resultQuali = (int) (this.getQualidade() * 0.9);
        } else if (probLesao <= 30) {
            resultQuali = (int) (this.getQualidade() * 0.95);
        } else if (probLesao <= 60) {
            if (this.getQualidade() >= 2) {
                resultQuali = (this.getQualidade() - 2);
            } else {
                this.setQualidade(0);
            }
        } else {
            if (this.getQualidade() >= 1) {
                resultQuali = (this.getQualidade() - 1);
            } else {
                this.setQualidade(0);
            }
        }
        this.setQualidade(resultQuali);
    }

    public void executarTreinamento() {
        int probtreino, resultQuali;
        probtreino = (int) (Math.random() * 100);
        if (probtreino <= 5) {
            if (this.getQualidade() <= 95) {
                this.setQualidade(this.getQualidade() + 5);
            } else {
                resultQuali = 100;
            }
        } else if (probtreino <= 15) {
            if (this.getQualidade() <= 96) {
                this.setQualidade(this.getQualidade() + 4);
            } else {
                resultQuali = 100;
            }
        } else if (probtreino <= 30) {
            if (this.getQualidade() <= 97) {
                this.setQualidade(this.getQualidade() + 3);
            } else {
                resultQuali = 100;
            }
        } else if (probtreino <= 60) {
            if (this.getQualidade() <= 98) {
                this.setQualidade(this.getQualidade() + 2);
            } else {
                resultQuali = 100;
            }
        } else {
            if (this.getQualidade() <= 99) {
                this.setQualidade(this.getQualidade() + 1);
            } else {
                resultQuali = 100;
            }
        }
    }

    //
    //
    //
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

}
