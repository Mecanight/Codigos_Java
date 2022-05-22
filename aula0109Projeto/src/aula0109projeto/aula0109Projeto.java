/**/
package aula0109projeto;

import modelo.Conta;
import modelo.Lancamento;
import modelo.Pessoa;
import modelo.PessoaFis;
import modelo.PessoaJur;
import java.util.Date;
import java.util.ArrayList;

public class aula0109Projeto {

    public static void main(String[] args) {
        PessoaFis pf = new PessoaFis("13135", "46456", 636, "Geri", "email", "celular");
        Lancamento lcto0 = new Lancamento();
        ArrayList<Lancamento> lslcto = new ArrayList();

        Conta ct = new Conta("123", "0606", "462", 1232, 5000, pf, lslcto);

        Lancamento lct1 = new Lancamento();
        lct1.setData(new Date());
        lct1.setNumeroLanc(2);
        lct1.setTipo("D");
        lct1.setValor(1000);
        lslcto.add(lct1);

        Lancamento lct2 = new Lancamento();
        lct2.setData(new Date());
        lct2.setNumeroLanc(2);
        lct2.setTipo("C++");
        lct2.setValor(1299);
        lslcto.add(lct2);
        System.out.println("Cliente: " + pf.toString());
        System.out.println("Conta: " + ct.toString());
    }
}
