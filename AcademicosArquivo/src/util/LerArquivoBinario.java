
package util;

import modelo.AlunoV3;
import modelo.AlunoGradV3;
import modelo.AlunoEspecV3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;



public class LerArquivoBinario {

    public LerArquivoBinario() { 

    }

    public static List<AlunoV3> lerDados(){
        List<AlunoV3> aux = new ArrayList();
                try {
            //Abrindo arquivo binario
            File file = new File("//home/cassiano/academicos");
            if (file.exists()) {
                ObjectInputStream objInp = new ObjectInputStream(
                        new FileInputStream(file));
                aux = (List<AlunoV3>) objInp.readObject();
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
