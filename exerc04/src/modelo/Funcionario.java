/*Referente ao exercício 04*/
package modelo;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private int horasTrab;
    private double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, int horasTrab,
            double valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrab = horasTrab;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", sobrenome=" + sobrenome
                + ", horasTrab=" + horasTrab + ", valorPorHora=" + valorPorHora + '}';
    }

    //
    //
    //
    public String nomeCompleto() {
        String ret;
        ret = "Nome Completo: " + this.getNome() + " " + this.getSobrenome();
        return ret;
    }

    public double calculaSalario() {
        double ret;
        ret = this.getHorasTrab() * this.getValorPorHora();
        return ret;
    }

    public void incrementaHoras(int horas) {
        this.setHorasTrab(this.getHorasTrab() + horas);
    }
    //
    //
    //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

}
