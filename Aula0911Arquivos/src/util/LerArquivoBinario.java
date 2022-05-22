
package util;

import entidades.Cidade;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LerArquivoBinario {

    public LerArquivoBinario() { 

    }

    public static List<Cidade> lerDados(){
        List<Cidade> aux = new ArrayList();
                try {
            //Abrindo arquivo binário
            File file = new File("//home/cassiano/arqd");
            if (file.exists()) {
                ObjectInputStream objInp = new ObjectInputStream(
                        new FileInputStream(file));
                aux = (List<Cidade>) objInp.readObject();
                objInp.close();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return aux;
    }
}
