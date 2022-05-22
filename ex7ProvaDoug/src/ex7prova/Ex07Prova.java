/**/
package ex7prova;

import java.util.ArrayList;
import modelo.Equipamento;
import modelo.Pessoa;

public class Ex07Prova {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fabio");
        pessoa1.setCpf("988887777");
        pessoa1.setFone("11144477799");
        Equipamento radio = new Equipamento("furadeira", "bosch", "1000RE", "11-12-2021");
        Equipamento televisao = new Equipamento("martelo", "tramont", "30 POL", "11-11-2021");
        Equipamento roteador = new Equipamento("alicate", "gedore", "elect", "11-11-2021");

        ArrayList equipamentosp1 = new ArrayList();
        equipamentosp1.add(radio);
        equipamentosp1.add(televisao);
        equipamentosp1.add(roteador);
        pessoa1.setListaEquip(equipamentosp1);

        System.out.println(pessoa1.toString());
    }
}
