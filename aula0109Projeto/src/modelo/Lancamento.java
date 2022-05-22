/**/
package modelo;

import java.util.Date;

public class Lancamento {

    private int numeroLanc;
    private double valor;
    private Date data;
    private String tipo;
    private Conta conta;

    public Lancamento() {
    }

    public Lancamento(int numeroLanc, double valor, Date data, String tipo, Conta conta) {
        this.numeroLanc = numeroLanc;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Lancamento{" + "numeroLanc=" + numeroLanc + ", valor=" + valor + ", data=" + data + ", tipo=" + tipo + ", conta=" + conta + '}';
    }

    public int getNumeroLanc() {
        return numeroLanc;
    }

    public void setNumeroLanc(int numeroLanc) {
        this.numeroLanc = numeroLanc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
