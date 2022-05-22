/**/
package exerc01;

import modelo.Retangulo;

public class Exerc01 {

    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo(10, 5);
        novoRetangulo.calcularArea();
        System.out.println("Area do retangulo: " + novoRetangulo.calcularArea());
        novoRetangulo.calcularPerimetro();
        System.out.println("Area do retangulo: " + novoRetangulo.calcularPerimetro());
        novoRetangulo.setLado2(7);
        novoRetangulo.calcularArea();
        System.out.println("Area do retangulo: " + novoRetangulo.calcularArea());
        novoRetangulo.calcularPerimetro();
        System.out.println("Area do retangulo: " + novoRetangulo.calcularPerimetro());
        Retangulo novoRetangulo2 = new Retangulo(50, 8);
        Retangulo novoRetangulo3 = new Retangulo(25, 18);
        Retangulo novoRetangulo4 = new Retangulo(48, 20);
        Retangulo novoRetangulo5 = new Retangulo(27, 6);
        Retangulo novoRetangulo6 = new Retangulo(18, 12);
    }

}
