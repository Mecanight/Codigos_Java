/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author Geri
 */
public class Retangulo {
    private double lado1;
    private double lado2;

    public Retangulo() {
    }

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

    public double getLado1() {
        return lado1;
    }

    public double calcularArea(){
        double ret;
        ret = this.getLado1()*this.getLado2();
        return ret;
    }
    public double calcularPerimetro(){
        double ret;
        ret = this.getLado1()*2 + this.getLado2()*2;
        return ret;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
}
