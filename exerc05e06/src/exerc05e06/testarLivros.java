/*Referente exercício 05 e 06*/
package exerc05e06;

import java.util.ArrayList;
import modelo.Livro;

public class testarLivros {

    public static void main(String[] args) {
        Livro livroFavorito = new Livro();
        livroFavorito.setTitulo("O Pequeno Príncipe");
        livroFavorito.setTotalPaginas(98);
        System.out.printf("O livro '%s' possui %d páginas\n",
                livroFavorito.getTitulo(), livroFavorito.getTotalPaginas());
        livroFavorito.setPaginasLidas(20);
        System.out.println("" + livroFavorito.verificaProgresso());
        livroFavorito.setPaginasLidas(50);
        livroFavorito.verificaProgresso();
        Livro l1 = new Livro("Branca de Neve", 125, 28);
        System.out.println(l1.verificaProgresso());
        Livro l2 = new Livro("Os Três Porquinhos", 30, 15);
        System.out.println(l2.verificaProgresso());
        Livro l3 = new Livro("Pinóquio", 25, 18);
        System.out.println(l3.verificaProgresso());
        Livro l4 = new Livro("A Árvore que Dava Dinheiro", 86, 45);
        System.out.println(l4.verificaProgresso());
        Livro l5 = new Livro("Chapéuzinho Vermelho", 40, 35);
        System.out.println(l5.verificaProgresso());
        Livro l6 = new Livro("O Menino Maluquinho", 45, 12);
        System.out.println(l6.verificaProgresso());
        Livro l7 = new Livro("O Senhor dos Anéis", 170, 78);
        System.out.println(l7.verificaProgresso());
        Livro l8 = new Livro("A menina e o Urso", 13, 6);
        System.out.println(l8.verificaProgresso());
        Livro l9 = new Livro("Rapunzel", 19, 18);
        System.out.println(l9.verificaProgresso());
        Livro l10 = new Livro("Harry Potter", 230, 22);
        System.out.println(l10.verificaProgresso());
        ArrayList<Livro> lsLivro = new ArrayList();
        lsLivro.add(l1);
        lsLivro.add(l2);
        lsLivro.add(l3);
        lsLivro.add(l4);
        lsLivro.add(l5);
        lsLivro.add(l6);
        lsLivro.add(l7);
        lsLivro.add(l8);
        lsLivro.add(l9);
        lsLivro.add(l10);
    }
}
