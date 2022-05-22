/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucaoprova2509;

/**
 *
 * @author Geri
 */
import questao1.Retangulo;
import questao2.Circulo;
import questao3.Pais;
import questao3.Continente;
import java.util.ArrayList;
public class SolucaoProva2509 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo nr = new Retangulo();
        nr.setLado1(10);
        nr.setLado2(5);
        System.out.println("Área: "+nr.calcularArea());
        System.out.println("Perímetro: "+nr.calcularPerimetro());
        nr.setLado2(7);
        System.out.println("Área: "+nr.calcularArea());
        System.out.println("Perímetro: "+nr.calcularPerimetro());
        Retangulo nr1 = new Retangulo(5,6);
        System.out.println("Ret 1: "+nr.toString());
        
        Circulo nc = new Circulo();
        nc.setRaio(10);
        System.out.println("Área do círculo: "+nc.calcularArea());
        System.out.println("Perímetro do círculo: "+nc.calcularPerimetro());
        nc.setRaio(4);
        System.out.println("Área do círculo: "+nc.calcularArea());
        System.out.println("Perímetro do círculo: "+nc.calcularPerimetro());
        Circulo nc1 = new Circulo(7);
        System.out.println("Círculo 1: "+nc1.toString());
        
        Pais p1 = new Pais();
        Pais p2 = new Pais();
        Pais p3 = new Pais();
        ArrayList<Pais> lv  = new ArrayList();
        ArrayList<Pais> lpc = new ArrayList();
        p1.setCodigo(1);
        p1.setDimensao(1);
        p1.setNome("Brasil");
        p1.setPopulacao(1);
        p1.setVizinhos(lv);
        p2.setCodigo(2);
        p2.setDimensao(4);
        p2.setNome("Paraguai");
        p2.setPopulacao(2);
        p2.setVizinhos(lv);
        p3.setCodigo(3);
        p3.setDimensao(9);
        p3.setNome("Argentina");
        p3.setPopulacao(3);
        p3.setVizinhos(lv);
        lv.add(p3);
        lv.add(p2);
        p1.setVizinhos(lv);
        lv = new ArrayList();
        lv.add(p3);
        lv.add(p1);
        p2.setVizinhos(lv);
        lv = new ArrayList();
        lv.add(p1);
        lv.add(p2);
        p3.setVizinhos(lv);
        Continente as = new Continente();
        as.setNome("América do Sul");
        lpc.add(p1);
        lpc.add(p2);
        lpc.add(p3);
        as.setPaises(lpc);
        System.out.println("País 1: "+p1.toString());        
        System.out.println("País 2: "+p2.toString());     
        System.out.println("País 3: "+p3.toString());      
        System.out.println("Continente: "+as.toString());
    }
    
}
