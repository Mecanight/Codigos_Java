/**/
package modelo;

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

    public double calcularArea() {
        double ret = 0;
        ret = this.lado1 * this.lado2;
        return ret;
    }

    public double calcularPerimetro() {
        double ret = 0;
        ret = (2 * this.lado1) + (2 * this.lado2);
        return ret;
    }

    public double getLado1() {
        return lado1;
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
