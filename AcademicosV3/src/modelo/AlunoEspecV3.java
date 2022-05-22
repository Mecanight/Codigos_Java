package modelo;

import java.io.Serializable;

public class AlunoEspecV3 extends AlunoV3 implements AlunoImplementV3, Serializable {

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
        return "Prezado aluno " + this.getNome()
                + "\nInformamos que sua média na disciplina: "
                + this.getDisciplina() + " é " + this.getMedia()
                + "\nSua Situação: " + this.getSituacao()
                + "\nAtenciosamente";
    }
}
