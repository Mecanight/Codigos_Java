/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2108rep;

import java.util.Scanner;

public class Aula2108Rep {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mes, dia, ano;
        System.out.println("Informe o dia");
        dia = ler.nextInt();
        System.out.println("Informe o mês");
        mes = ler.nextInt();
        System.out.println("Informe o ano");
        ano = ler.nextInt();
        if (mes == 1) {
            if ((dia >= 1) && (dia <= 20)) {
                System.out.println("Capricórnio");
            } else if ((dia >= 21) && (dia <= 31)) {
                System.out.println("Aquário");
            } else {
                System.out.println("Dia inválido");
            }
        } else if (mes == 2) {
            if ((dia >= 1) && (dia <= 19)) {
                System.out.println("Aquário");
            } else if ((dia >= 20) && (dia <= 28)) {
                System.out.println("Peixes");
            } else if ((dia == 29) && (((ano % 4 == 0)
                    && (ano % 100 != 0)) || (ano % 400 == 0))) {
                System.out.println("Peixes");
            } else {
                System.out.println("Dia inválido");
            }
        } else if (mes == 3) {
            if ((dia >= 1) && (dia <= 20)) {
                System.out.println("Peixes");
            } else if ((dia >= 21) && (dia <= 31)) {
                System.out.println("Aries");
            } else {
                System.out.println("Dia inválido");
            }
        } else if (mes == 4) {
            if ((dia >= 1) && (dia <= 20)) {
                System.out.println("Aries");
            } else if ((dia >= 21) && (dia <= 30)) {
                System.out.println("Touro");
            } else {
                System.out.println("Dia inválido");
            }
        }
        if ((dia <= 0) || (dia > 31) || (mes <= 0) || 
                (mes > 12)){
            System.out.println("Data inválida");
        }else if ((mes == 4) || (mes == 6) || (mes == 9)
           || (mes == 11)){
            if (dia > 30){
                System.out.println("Data inválida");
            }
        }else if(mes == 2){
            if (((ano % 4 == 0) && (ano % 100 != 0)) 
               || (ano % 400 == 0)){
               if (dia > 29){
                   System.out.println("Data inválida");
               }
            }else{
                if (dia > 28){
                    System.out.println("Data inválida");
                }
            }
        }
        if (((mes == 12) && (dia >= 22)) || 
            ((mes == 1) && (dia <= 20))){
            System.out.println("Capricórnio");
        }    
    }
}
