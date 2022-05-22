/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author Geri
 */
import java.util.ArrayList;
public class Pais {
    private int codigo;
    private String nome;
    private int populacao;
    private int dimensao;
    private ArrayList<Pais> vizinhos;

    public Pais() {
    }

    public Pais(int codigo, String nome, int populacao, int dimensao, ArrayList<Pais> vizinhos) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.vizinhos = vizinhos;
    }

    @Override
    public String toString() {
        String aux = "Pais{" + "codigo=" + codigo + 
                ", nome=" + nome + ", populacao=" + populacao + 
                ", dimensao=" + dimensao + 
                ", densidade: "+this.densidadePop()+ '}';
        aux = aux +"\nVizinhos:\n";
        for (Pais vizinho : vizinhos) {
            aux = aux + vizinho.getNome()+"\n";
        }
        return aux;
    }
    
    public double densidadePop(){
        double ret = (double)this.getPopulacao()/this.getDimensao();
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
