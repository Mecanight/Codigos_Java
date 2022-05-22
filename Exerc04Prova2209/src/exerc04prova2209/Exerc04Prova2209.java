/**/
package exerc04prova2209;

import java.util.Date;
import modelo.Proprietario;
import modelo.Veiculo;
import modelo.Venda;
import java.util.ArrayList;

public class Exerc04Prova2209 {

    public static void main(String[] args) {
        Proprietario p = new Proprietario();
        Veiculo v = new Veiculo();
        Venda v1 = new Venda();
        p.setNome("Cassio");
        p.setEmail("@gmail");
        p.setCelular("99987");
        v.setMarca("ford");
        v.setModelo("gol");
        v.setAno(2000);
        v.setPlaca("apc5");
        v.setChassis("fdtrb51");
        v.setValor(2000);
        v1.setVeiculo(v);
        v1.setProprietario(p);
        v1.setData(new Date());
        v1.setValor(4000);
        Venda v2 = new Venda();
        ArrayList<Venda> lv = new ArrayList();
        double tv = 0;
        lv.add(v1);
        lv.add(v2);
        System.out.println("Vendas Realizadas: " + lv.toString());
        /*fore venda venda:lv
                sout    venda.tostring
                tv = tv + venda.getvalor
        }
    sout    total vendas +tv*/
    }
}
