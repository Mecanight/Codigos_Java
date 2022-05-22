/**/
package aulaoo;

import modelo.pessoa;

public class aulaOO {

    public static void main(String[] args) {
        //criar objetos
        pessoa pessoa1 = new pessoa();
        pessoa pessoa2 = new pessoa("Daniel", "99079789", -1250, 11, 'M', 50, 18);

        System.out.println("Pessoa 1: " + pessoa1.toString());
        System.out.println("Pessoa 2: " + pessoa2.toString());

        pessoa1.setCelular("990279275");
        pessoa1.setCodigo(10);
        pessoa1.setIdade(20);
        pessoa1.setNome("Alex");
        pessoa1.setPeso(77);
        pessoa1.setSalario(2000);
        pessoa1.setSexo('M');
        pessoa2.reajustarSalario(300);

        System.out.println("Pessoa 1: " + pessoa1.toString());
        System.out.println("Pessoa 2: " + pessoa2.toString());

    }

}
