/**/
package modelo;

public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double pctFreq;

    public Aluno() {

    }

    public Aluno(String nome, int idade, double nota1,
            double nota2, double pctFreq) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.pctFreq = pctFreq;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade="
                + idade + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", pctFreq=" + pctFreq + '}';
    }

    public double calculaMedia() {
        double ret;
        ret = (this.getNota1() + this.getNota2()) / 2;
        return ret;
    }

    public String retornaStatus() {
        String ret;
        if ((calculaMedia() >= 7) && (this.getPctFreq() >= 75)) {
            ret = "Aprovado";
        } else {
            ret = "Reprovado";
        }
        return ret;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPctFreq() {
        return pctFreq;
    }

    public void setPctFreq(double pctFreq) {
        this.pctFreq = pctFreq;
    }

}
