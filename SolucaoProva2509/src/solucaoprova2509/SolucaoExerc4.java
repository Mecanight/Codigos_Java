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
import java.util.Date;
import questao4.Proprietario;
import questao4.Veiculo;
import questao4.Venda;
import java.util.ArrayList;
public class SolucaoExerc4 {
    public static void main(String[] args) {
        Proprietario p = new Proprietario();
        Veiculo v = new Veiculo();
        Venda v1 = new Venda();
        Venda v2 = new Venda();
        p.setNome("Géri");
        p.setCelular("991115");
        p.setEmail("geri@geri");
        v.setAno(2020);
        v.setChassis("123456");
        v.setMarca("Teste");
        v.setModelo("A5");
        v.setPlaca("hdk1d12");
        v.setValor(100000);
        v1.setData(new Date());
        v1.setProprietario(p);
        v1.setVeiculo(v);
        v1.setValor(110000);
        v2.setData(new Date());
        v2.setProprietario(p);
        v2.setVeiculo(v);
        v2.setValor(120000);
        ArrayList<Venda> lv = new ArrayList();
        double tv = 0;
        lv.add(v1);
        lv.add(v2);
        System.out.println("Vendas realizadas: ");
        for (Venda iv : lv) {
            System.out.println(" "+iv.toString());
            tv = tv + iv.getValor();
        }
        System.out.println("Total das vendas: "+tv);
    }
}
