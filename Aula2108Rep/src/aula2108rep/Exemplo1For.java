/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2108rep;
public class Exemplo1For {
    public static void main(String[] args) {
        int num = 7;
        System.out.println("Indo de 1 até 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(""+i);
        }
        System.out.println("Indo de 20 até 50 de 3 em 3");
        for (int i = 20; i <= 50; i += 3) {
            System.out.println(""+i);
        }
        System.out.println("Indo de 10 até 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(""+i);
        }
        System.out.println("Indo de 50 até 20 de -3 em -3");
        for (int i = 50; i >= 20; i -= 3) {
            System.out.println(""+i);
        }
        System.out.println("indo de 50 até 60 de 1.5 em 1.5");
        for (double i = 50; i <= 60; i += 1.5) {
            System.out.println(""+i);
        }
        System.out.println("indo de 60 até 50 de -1.5 em -1.5");
        for (double i = 60; i >= 50; i -= 1.5) {
            System.out.println(""+i);
        }
        System.out.println("Tabuada do "+num);
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+" * "+num+" = "+(i*num));
        }
    }
}
