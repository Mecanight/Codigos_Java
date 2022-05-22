/**/
package modelo;

public class PessoaFis extends Pessoa {
    private String cpf;
    private String rg;
    private double salario;

    public PessoaFis() {
    }

    public PessoaFis(String cpf, String rg, double salario, String nome, String email, String celular) {
        super(nome, email, celular);
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

   

    @Override
    public String toString() {
        return super.toString()+"PessoaFis{" + "cpf=" + cpf + ", rg=" + rg + ", salario=" + salario + '}';
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
