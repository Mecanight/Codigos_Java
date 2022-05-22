/**/
package ex5prova;

import java.util.Scanner;

public class Ex5Prova {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        System.out.println("Cite uma frase");
        frase = ler.nextLine();
        System.out.println(frase.toUpperCase());
    }
}
