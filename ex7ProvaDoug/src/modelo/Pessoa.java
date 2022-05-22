/**/
package modelo;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private String fone;
    private String cpf;
    private ArrayList<Equipamento> listaEquip;

    public Pessoa() {
    }

    public Pessoa(String nome, String fone, String cpf,
            ArrayList<Equipamento> listaEquip) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
        this.listaEquip = listaEquip;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", fone="
                + fone + ", cpf=" + cpf + ", listaEquip=" + listaEquip + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Equipamento> getListaEquip() {
        return listaEquip;
    }

    public void setListaEquip(ArrayList<Equipamento> listaEquip) {
        this.listaEquip = listaEquip;
    }

}
