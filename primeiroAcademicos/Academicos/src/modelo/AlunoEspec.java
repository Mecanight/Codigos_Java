/**/
package modelo;

public class AlunoEspec extends Aluno implements AlunoImpl {

    public AlunoEspec() {
    }

    public double getMedia() {
        double media = (this.getNota1() + this.getNota2()) / 2;
        return media;
    }

    public String getSituacao() {
        String result = "";
        if (this.getMedia() >= 6.) {
            result = "Aprovado";
        } else {
            result = "Reprovado";
        }
        return result;
    }

    public String gerarConteudoCarta() {
        return "Prezado aluno" + this.getNomeAluno()
                + "Informamos que sua média na disciplina: "
                + this.getNomeDisciplina() + " é " + this.getMedia()
                + "Sua Situação: " + this.getSituacao()
                + "Atenciosamente";
    }
}
