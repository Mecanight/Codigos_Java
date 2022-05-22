package modelo;

import java.io.Serializable;

public class AlunoV3 implements Serializable {

    private String nome;
    private String disciplina;
    private double nota1;
    private double nota2;
    private boolean opcao;

    public AlunoV3() {
    }

    public AlunoV3(String nome, String disciplina,
            double nota1, double nota2, boolean opcao) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.opcao = opcao;
    }

    public String gerarConteudoCarta() {
        return "";
    }

    @Override
    public String toString() {
        return "AlunoV3{" + "nome=" + nome + ", disciplina="
                + disciplina + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", opcao=" + opcao + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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

    public boolean isOpcao() {
        return opcao;
    }

    public void setOpcao(boolean opcao) {
        this.opcao = opcao;
    }

}
