/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Geri
 */
public class TestaFile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome?");
        String nome = ler.nextLine();
        File objf = new File(nome);
        if (objf.exists()){
            System.out.println("Existe, dados:");
            System.out.println("Nome: "+objf.getName());
            System.out.println("Tipo: "+
                    (objf.isFile()?" é Arquivo":
            " é diretório"));
            if(objf.isDirectory()){
                System.out.println(
                        "Conteúdo:");
                String dir[] = objf.list();
                for (String f : dir) {
                    System.out.println(""+f);
                }
            }
        }else{
            System.out.println("Não existe");
        }
    }
}
