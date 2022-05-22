/**/
package aula1808eranca;

import modelo.Cliente;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;

public class aula1808eranca {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Daniel", "99079789", "Rua tal", "daniel@scabeni.xyz", 1100);

        ClientePessoaFisica f1 = new ClientePessoaFisica("10631432922", "134823585", -1000, "Daniel", "99079789", "Rua Casa", "daniel@scabeni.xyz", 1100);
        ClientePessoaJuridica j1 = new ClientePessoaJuridica("12345678", "01", "Scabecini ltda", "99079789", "Rua Empresa", "daniel@scabeni.xyz", 5000);

        c1.setCelular("99123456");
        c1.setEmail("email@e");
        c1.setEnder("Rua ENder");
        c1.setNome("Joao");
        c1.setSaldo(5000);

        System.out.println("Objeto c1: " + c1.toString());
        System.out.println("Objeto c2: " + c2.toString());
        System.out.println("Objeto f1: " + f1.toString());
        System.out.println("Objeto j1: " + j1.toString());
        f1.compra(10000);
        j1.paga(10000);
        System.out.println("Objeto f1: " + f1.toString());
        System.out.println("Objeto j1: " + j1.toString());
    }

}
