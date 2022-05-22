/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2108rep;

public class Exemplo2For {
    public static void main(String[] args) {
        int sm = 0, ctp = 0, cti = 0, prod = 1, num;
        num = 7;
        for (int i = 50; i <= 80; i++) {
            // exemplo de contagem
            if(i % 2 ==0){
                ctp++;
            }else{
                cti++;
            }
            // exemplo de soma
            sm = sm + i;
        }
        System.out.println("Número de pares: "+ctp);
        System.out.println("Número de ímpares: "+cti);
        System.out.println("Soma dos números: "+sm);
        for (int i = 1; i <= num; i++) {
            prod = prod * i;
        }
        System.out.println("Fatorial de 7: "+prod);
        int vi = 10, vf = 35, ta = 3;
        System.out.println("indo de "+vi+" até "+vf+
                " Taxa de atualização "+ta);
        for (int i = vi; i <= vf; i += ta) {
            System.out.println(""+i);
        }        
    }    
}
