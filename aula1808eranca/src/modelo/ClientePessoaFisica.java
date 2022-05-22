/**/
package modelo;

public class ClientePessoaFisica extends Cliente {

    private String cpf;
    private String rg;
    private double salario;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(String cpf, String rg, double salario, String nome, String celular, String ender, String email, double saldo) {
        super(nome, celular, ender, email, saldo);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientePessoaFisica{" + "cpf=" + cpf + ", rg=" + rg + ", salario=" + salario + '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
