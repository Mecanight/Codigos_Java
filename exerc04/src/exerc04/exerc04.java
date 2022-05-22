/*Referente ao Exerc 04*/
package exerc04;

import modelo.Funcionario;
import java.util.ArrayList;

public class exerc04 {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Luis", "Silva", 10, 25.50);
        System.out.println(f1.nomeCompleto());
        System.out.println("Salario Inic: " + f1.calculaSalario());
        f1.incrementaHoras(8);
        System.out.println("Salario Increm: " + f1.calculaSalario());

        ArrayList<Funcionario> listaFunc = new ArrayList();
        Funcionario f2 = new Funcionario("Carlos", "Moura", 18, 32.40);
        Funcionario f3 = new Funcionario("Bruno", "Chagas", 20, 20.10);
        Funcionario f4 = new Funcionario("Ana", "Souza", 15, 18.50);
        Funcionario f5 = new Funcionario("Davi", "House", 19, 45.40);
        Funcionario f6 = new Funcionario("Edu", "Mendes", 13, 12.10);
        Funcionario f7 = new Funcionario("Bia", "Savio", 42, 42.50);
        Funcionario f8 = new Funcionario("Caue", "Bond", 31, 65.40);
        Funcionario f9 = new Funcionario("Joao", "Holmes", 26, 8.10);
        Funcionario f10 = new Funcionario("Jose", "Smith", 15, 23.50);
        listaFunc.add(f1);
        listaFunc.add(f3);
        listaFunc.add(f4);
        listaFunc.add(f5);
        listaFunc.add(f6);
        listaFunc.add(f7);
        listaFunc.add(f8);
        listaFunc.add(f9);
        listaFunc.add(f10);
        System.out.println("Funcionários: \n" + listaFunc);
    }
}
