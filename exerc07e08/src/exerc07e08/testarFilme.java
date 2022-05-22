/*Referente exercício 07 e 08*/
package exerc07e08;

import modelo.Filme;

public class testarFilme {

    public static void main(String[] args) {
        Filme filme1 = new Filme("Os Vingadores", 142);
        System.out.println("" + filme1.exibirDuracaoEmHoras());
        Filme filme2 = new Filme("Hotel Transilvania", 93);
        System.out.println("" + filme2.exibirDuracaoEmHoras());
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo()
                + " e " + filme2.getTitulo());
        Filme filme3 = new Filme("Titanic", 150);
        System.out.println("" + filme3.exibirDuracaoEmHoras());
        Filme filme4 = new Filme("Lagoa Azul", 100);
        System.out.println("" + filme4.exibirDuracaoEmHoras());
        Filme filme5 = new Filme("A Onda", 120);
        System.out.println("" + filme5.exibirDuracaoEmHoras());
        Filme filme6 = new Filme("Armagedon", 140);
        System.out.println("" + filme6.exibirDuracaoEmHoras());
        Filme filme7 = new Filme("As Aventuras de Pi", 120);
        System.out.println("" + filme7.exibirDuracaoEmHoras());
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo()
                + ", " + filme2.getTitulo() + ", " + filme3.getTitulo() + ", "
                + filme4.getTitulo() + ", " + filme5.getTitulo() + ", "
                + filme6.getTitulo() + ", " + filme7.getTitulo());
    }
}
