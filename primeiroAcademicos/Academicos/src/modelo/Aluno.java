/**/
package modelo;

import java.io.Serializable;

public abstract class Aluno implements AlunoImpl {

    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private String opcao;

    public Aluno() {
    }

    public Aluno(String nomeAluno, String nomeDisciplina,
            double nota1, double nota2, String opcao) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.opcao = opcao;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nomeAluno=" + nomeAluno
                + ", nomeDisciplina=" + nomeDisciplina
                + ", nota1=" + nota1 + ", nota2=" + nota2
                + ", opcao=" + opcao + '}';
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

}
