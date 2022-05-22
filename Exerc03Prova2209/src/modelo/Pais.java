/**/
package modelo;

import java.util.ArrayList;

public class Pais {

    private int codigo;
    private String nome;
    private int populacao;
    private int dimensao;
    private ArrayList<Pais> vizinhos;

    public Pais() {
    }

    public Pais(int codigo, String nome, int populacao,
            int dimensao, ArrayList<Pais> vizinhos) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.vizinhos = vizinhos;
    }

    @Override
    public String toString() {
        return "Pais{" + "codigo=" + codigo + ", nome="
                + nome + ", populacao=" + populacao
                + ", dimensao=" + dimensao + '}';
    }

    public double densidadePop() {
        double ret = 0;
        ret = populacao / dimensao;
        return ret;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public ArrayList<Pais> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(ArrayList<Pais> vizinhos) {
        this.vizinhos = vizinhos;
    }

}
