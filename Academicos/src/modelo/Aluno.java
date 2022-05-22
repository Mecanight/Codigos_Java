package modelo;

public class Aluno {

    private String nome;
    private String disciplina;
    private double nota1;
    private double nota2;
    private boolean opcao;

    public Aluno() {
    }

    public Aluno(String nome, String disciplina,
            double nota1, double nota2, boolean opcao) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.opcao = opcao;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", disciplina="
                + disciplina + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", opcao=" + opcao + '}';
    }

    public double getMedia() {
        double media = (this.getNota1() + this.getNota2()) / 2;
        return media;
    }

    public String getSituacao() {
        String result = "";
        if (this.isOpcao() == true) {
            if (this.getMedia() >= 7.) {
                result = "Aprovado";
            } else if (this.getMedia() < 4.) {
                result = "Reprovado";
            } else {
                result = "Exame";
            }
        } else if (this.isOpcao() == false) {
            if (this.getMedia() >= 6.) {
                result = "Aprovado";
            } else {
                result = "Reprovado";
            }
        }
        return result;
    }

    public String gerarConteudoCarta() {
        return "Prezado aluno" + this.getNome()
                + "Informamos que sua média na disciplina: "
                + this.getDisciplina() + " é " + this.getMedia()
                + "Sua Situação: " + this.getSituacao()
                + "Atenciosamente";
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
