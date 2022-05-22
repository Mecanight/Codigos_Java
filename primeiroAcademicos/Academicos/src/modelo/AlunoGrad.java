/**/
package modelo;

public class AlunoGrad extends Aluno implements AlunoImpl {

    public AlunoGrad() {
    }

    @Override
    public double getMedia() {
        double media = (this.getNota1() + this.getNota2()) / 2;
        return media;
    }

    @Override
    public String getSituacao() {
        String result = "";
        if (this.getMedia() >= 7.) {
            result = "Aprovado";
        } else if (this.getMedia() < 4.) {
            result = "Reprovado";
        } else {
            result = "Exame";
        }
        return result;
    }

    @Override
    public String gerarConteudoCarta() {
        return "Prezado aluno" + this.getNomeAluno()
                + "Informamos que sua média na disciplina: "
                + this.getNomeDisciplina() + " é " + this.getMedia()
                + "Sua Situação: " + this.getSituacao()
                + "Atenciosamente";
    }
}
