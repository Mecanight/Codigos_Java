/**/
package exerc03;

import modelo.Pais;
import modelo.Continente;
import java.util.ArrayList;

public class Exerc03 {

    public static void main(String[] args) {
        //America Sul
        ArrayList<Pais> viziBR = new ArrayList();
        ArrayList<Pais> AmerSul = new ArrayList();

        Pais Brasil = new Pais(30, "Brasil", 300000, 30000, viziBR);
        Brasil.densidadePop();
        System.out.println("Densidade Populacional Brasil: " + Brasil.densidadePop());
        Pais Argentina = new Pais(20, "Argentina", 200000, 20000, viziBR);
        Pais Paraguai = new Pais(10, "Paraguai", 100000, 10000, viziBR);

        AmerSul.add(Brasil);
        AmerSul.add(Argentina);
        AmerSul.add(Paraguai);

        viziBR.add(Argentina);
        viziBR.add(Paraguai);

        Continente AmericaSul = new Continente();
        AmericaSul.setNome("America do Sul");
        AmericaSul.setPaises(AmerSul);
        System.out.println(AmericaSul.toString());
        AmericaSul.dimensaoCont();
        AmericaSul.populacaoCont();
        System.out.println("Dimensão Amer Sul: " + AmericaSul.dimensaoCont());
        System.out.println("População Amer Sul: " + AmericaSul.populacaoCont());

        //America Norte
        ArrayList<Pais> viziMexico = new ArrayList();
        ArrayList<Pais> AmerNorte = new ArrayList();

        Pais EUA = new Pais(70, "EUA", 700000, 70000, viziMexico);
        System.out.println("Densidade Populacional EUA: " + EUA.densidadePop());
        Pais Canada = new Pais(60, "Canada", 600000, 60000, viziMexico);
        Pais Mexico = new Pais(50, "Mexico", 500000, 50000, viziMexico);

        AmerNorte.add(EUA);
        AmerNorte.add(Canada);
        AmerNorte.add(Mexico);

        viziMexico.add(EUA);
        viziMexico.add(Canada);

        Continente AmericaNorte = new Continente();
        AmericaNorte.setNome("America do Norte");
        AmericaNorte.setPaises(AmerNorte);
        System.out.println(AmericaNorte.toString());
        AmericaNorte.dimensaoCont();
        AmericaNorte.populacaoCont();
        System.out.println("Dimensão Amer Norte: " + AmericaNorte.dimensaoCont());
        System.out.println("População Amer Norte: " + AmericaNorte.populacaoCont());
    }
}
