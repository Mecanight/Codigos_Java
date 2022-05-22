/**/
package modelo;

import java.util.ArrayList;

public class Turma {

    private String nomeTurma;
    private String curso;
    private int codigo;
    // implementação de agregação
    private ArrayList<Aluno> alunos;

    public Turma() {
    }

    public Turma(String nomeTurma, String curso,
            int codigo, ArrayList<Aluno> alunos) {
        this.nomeTurma = nomeTurma;
        this.curso = curso;
        this.codigo = codigo;
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" + "nomeTurma=" + nomeTurma + ", curso=" + curso + ", codigo=" + codigo + ", alunos=" + alunos + '}';
    }

    public double mediaTurma() {
        double ret = 0;
        double smmed = 0;
        int cta = 0;
        for (Aluno aluno : alunos) {
            smmed = smmed + aluno.calculaMedia();
            cta++;
        }
        smmed = smmed / cta; // getAlunos().size();
        return ret;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
