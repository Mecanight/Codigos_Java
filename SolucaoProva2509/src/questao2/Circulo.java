/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Geri
 */
public class Circulo {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    public double calcularArea(){
        double ret;
        ret = this.getRaio() * this.getRaio() * 3.14;
        return ret;                
    }
    
    public double calcularPerimetro(){
        double ret;
        ret = 2 * 3.14 * this.getRaio();
        return ret;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
        
}
