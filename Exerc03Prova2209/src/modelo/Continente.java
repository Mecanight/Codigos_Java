/**/
package modelo;

import java.util.ArrayList;
import modelo.Pais;

public class Continente {

    private String nome;
    private ArrayList<Pais> paises;

    public Continente() {
    }

    public Continente(String nome, ArrayList<Pais> paises) {
        this.nome = nome;
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Continente{" + "nome=" + nome + ", paises=" + paises + '}';
    }

    public int dimensaoCont() {
        int ret = 0;
        int ct = 0;
        for (Pais pais : this.getPaises()) {
            ret = ret + pais.getDimensao();
            ct++;
            if (ct == this.getPaises().size()) {
                break;
            }
        }
        return ret;
    }

    public int populacaoCont() {
        int ret = 0;
        int ct = 0;
        for (Pais pais : this.getPaises()) {
            ret = ret + pais.getPopulacao();
            ct++;
            if (ct == this.getPaises().size()) {
                break;
            }
        }
        return ret;
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
