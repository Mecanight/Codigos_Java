/**/
package modelo;

import java.util.Date;

public class Mensalidade {

    private Aluno aluno;
    private double valor;
    private Date dataVcto;
    private Date dataPgto;

    public Mensalidade() {
    }

    public Mensalidade(Aluno aluno, double valor, Date dataVcto, Date dataPgto) {
        this.aluno = aluno;
        this.valor = valor;
        this.dataVcto = dataVcto;
        this.dataPgto = dataPgto;
    }

    @Override
    public String toString() {
        return "Mensalidade{" + "aluno=" + aluno + ", valor=" + valor + ", dataVcto=" + dataVcto + ", dataPgto=" + dataPgto + '}';
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVcto() {
        return dataVcto;
    }

    public void setDataVcto(Date dataVcto) {
        this.dataVcto = dataVcto;
    }

    public Date getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Date dataPgto) {
        this.dataPgto = dataPgto;
    }

}
