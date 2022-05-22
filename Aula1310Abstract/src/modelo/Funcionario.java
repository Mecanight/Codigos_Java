/**/
package modelo;

/**
 *
 * @author Geri
 */
public abstract class Funcionario {

    protected double salario;
    private String nome;
    private String celular;

    public Funcionario() {
    }

    public Funcionario(double salario, String nome, String celular) {
        this.salario = salario;
        this.nome = nome;
        this.celular = celular;
    }

    // exemplo de método abstrato
    public abstract double getBonificacao();

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", nome=" + nome + ", celular=" + celular + '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
