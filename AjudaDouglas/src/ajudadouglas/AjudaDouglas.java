package ajudadouglas;

import java.util.Scanner;

public class AjudaDouglas {

    public static void main(String[] args) {
        String senha;
        Scanner ler = new Scanner(System.in);
        boolean temn = false;
        boolean temce = false;
        System.out.println("Informe a senha");
        senha = ler.nextLine();
        for (int i = 0; i < senha.length(); i++) {
            if ((senha.charAt(i) >= '0')
                    && (senha.charAt(i) <= '9')) {
                temn = true;
            }
            if (((senha.charAt(i) >= '!')
                    && (senha.charAt(i) <= '/'))
                    || ((senha.charAt(i) >= ':')
                    && (senha.charAt(i) <= '@'))
                    || ((senha.charAt(i) >= '[')
                    && (senha.charAt(i) <= '-'))
                    || (senha.charAt(i) >= '{')) {
                temce = true;
            }
        }
        if (temce && temn) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
            if (!temce) {
                System.out.println("Faltou o caracter especial");
            }
            if (!temn) {
                System.out.println("Faltou o número");
            }
        }
        System.out.println("Senha em maiúscula: "
                + senha.toUpperCase());
    }
}
