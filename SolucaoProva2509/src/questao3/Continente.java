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
public class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    public Continente() {
    }

    public Continente(String nome, ArrayList<Pais> paises) {
        this.nome = nome;
        this.paises = paises;
    }
    
    public int dimensaoCont(){
        int ret = 0;
        for (Pais paise : paises) {
            ret = ret + paise.getDimensao();
        }
        return ret;
    }
    
    public int populacaoCont(){
        int ret = 0;
        for (Pais paise : paises) {
            ret = ret + paise.getPopulacao();
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Continente{" + "nome=" + nome + ", paises=" + paises + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
    
    
}
