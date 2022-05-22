package modelo;

import java.io.Serializable;

public class AlunoGradV3 extends AlunoV3 implements AlunoImplementV3, Serializable {

    public double getMedia() {
        double media = (this.getNota1() + this.getNota2()) / 2;
        return media;
    }

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

    public String gerarConteudoCarta() {
        return "Prezado aluno " + this.getNome()
                + "\nInformamos que sua média na disciplina: "
                + this.getDisciplina() + " é " + this.getMedia()
                + "\nSua Situação: " + this.getSituacao()
                + "\nAtenciosamente";
    }
}
