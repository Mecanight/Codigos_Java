/**/
package ex6prova;

import java.util.Scanner;

public class Ex6Prova {

    public static void main(String[] args) {
        String senha;
        Scanner ler = new Scanner(System.in);
        boolean ehValida = true;
        boolean temnum = false;
        boolean temcarac = false;
        System.out.println("Informe a senha");
        senha = ler.nextLine();
        for (int i = 0; i < args.length; i++) {
            if((senha.charAt(i) > 0) && (senha.charAt(i) <  9))
                System.out.println("Valida");
        }
    }
}