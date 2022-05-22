/**/
package modelo;

import java.util.ArrayList;

public class Conta {

    private String numConta;
    private String banco;
    private String gencia;
    private double saldo;
    private double limite;
    private Pessoa pessoa;
    private ArrayList<Lancamento> listaLan;

    public Conta() {
    }

    public Conta(String numConta, String banco, String gencia, double saldo, double limite, Pessoa pessoa, ArrayList<Lancamento> listaLan) {
        this.numConta = numConta;
        this.banco = banco;
        this.gencia = gencia;
        this.saldo = saldo;
        this.limite = limite;
        this.pessoa = pessoa;
        this.listaLan = listaLan;
    }

    @Override
    public String toString() {
        return "Conta{" + "numConta=" + numConta + ", banco=" + banco + ", gencia=" + gencia + ", saldo=" + saldo + ", limite=" + limite + ", pessoa=" + pessoa + ", listaLan=" + listaLan + '}';
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getGencia() {
        return gencia;
    }

    public void setGencia(String gencia) {
        this.gencia = gencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Lancamento> getListaLan() {
        return listaLan;
    }

    public void setListaLan(ArrayList<Lancamento> listaLan) {
        this.listaLan = listaLan;
    }

}
