/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2108rep;

import java.util.Scanner;

public class ValidaData {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mes, dia, ano;
        System.out.println("Informe o dia");
        dia = ler.nextInt();
        System.out.println("Informe o mês");
        mes = ler.nextInt();
        System.out.println("Informe o ano");
        ano = ler.nextInt();
        if ((dia <= 0) || (dia > 31) || (mes <= 0)
                || (mes > 12)) {
            System.out.println("Data inválida");
        } else if (((mes == 4) || (mes == 6) || (mes == 9)
                || (mes == 11)) && (dia > 30)) {            
                System.out.println("Data inválida");            
        } else if (mes == 2) {
            if (((ano % 4 == 0) && (ano % 100 != 0))
                    || (ano % 400 == 0)) {
                if (dia > 29) {
                    System.out.println("Data inválida");
                }
            } else {
                if (dia > 28) {
                    System.out.println("Data inválida");
                }
            }
        }else {
            System.out.println("Data válida");
        }
    }
}
