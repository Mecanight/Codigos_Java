
package entidades;

import java.util.Date;

public class Solicitacao {

    private int codSol;
    private Cliente cli;
    private Date datas;
    private String obser;
    private boolean alerta; // mostrar alerta (sim ou não)
    private int dias; // quantos dias antes mostrar o alerta
    private boolean pendente; // se está pendente ou não
    private int prioridade; // nível de prioridade
    private double valor;
    private String descricao;

    public Solicitacao() {
    }

    public Solicitacao(int codSol, Cliente cli, Date datas,
            String obser, boolean alerta, int dias,
            boolean pendente, int prioridade, double valor,
            String descricao) {
        this.codSol = codSol;
        this.cli = cli;
        this.datas = datas;
        this.obser = obser;
        this.alerta = alerta;
        this.dias = dias;
        this.pendente = pendente;
        this.prioridade = prioridade;
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public int getCodSol() {
        return codSol;
    }

    public void setCodSol(int codSol) {
        this.codSol = codSol;
    }

    public Date getDatas() {
        return datas;
    }

    public void setDatas(Date datas) {
        this.datas = datas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
