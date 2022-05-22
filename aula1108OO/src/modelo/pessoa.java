/**/
package modelo;

public class pessoa {

    //definição dos stributos
    private String nome;
    private String celular;
    private double salario;
    private int codigo;
    public char sexo;
    private double peso;
    private int idade;

    //metodos contrutores
    public pessoa() {
    }

    public pessoa(String nome, String celular, double salario, int codigo, char sexo, double peso, int idade) {
        this.nome = nome;
        this.celular = celular;
        this.salario = salario;
        this.codigo = codigo;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome= " + nome + ", celular= " + celular + ", salario= " + salario
                + ", codigo= " + codigo + ", sexo= " + sexo + ", peso= " + peso + ", idade= " + idade + '}';
    }

    //metodo para reajustar salario
    public void reajustarSalario(double pct) {
        double novosal = getSalario() + (getSalario() * pct / 100);
        setSalario(novosal);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if ((sexo) == ('M') || (sexo) == ('m')) {
            this.sexo = sexo;
        } else {
            this.sexo = 'F';
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
