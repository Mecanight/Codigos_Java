/**/
package aula2508agregacao;

import modelo.Aluno;
import modelo.Mensalidade;
import java.util.Date;
import modelo.Turma;
import java.util.ArrayList;

public class aula2508Agregacao {

    public static void main(String[] args) {
        Aluno x = new Aluno("Geri", 50, 10, 10, 100);
        System.out.println("Dados do aluno: "
                + x.toString());
        System.out.println("Média: "
                + x.calculaMedia());
        System.out.println("Status: "
                + x.retornaStatus());
        Aluno y = new Aluno("Luís", 30, 7, 5, 80);
        System.out.println("Dados do aluno: "
                + y.toString());
        System.out.println("Média: "
                + y.calculaMedia());
        System.out.println("Status: "
                + y.retornaStatus());
        Mensalidade m = new Mensalidade(
                x, 800, new Date(), new Date());
        System.out.println("Mensalidade: "
                + m.toString());
        ArrayList<Aluno> lalu = new ArrayList();
        lalu.add(x);
        lalu.add(y);
        Turma t = new Turma("2SI", "Sistemas",
                1, lalu);
        System.out.println("Dados da turma: "
                + t.toString());
        System.out.println("Média da turma: "
                + t.mediaTurma());
    }

}
