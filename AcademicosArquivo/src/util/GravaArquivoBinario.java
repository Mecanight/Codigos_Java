
package util;

import modelo.AlunoV3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GravaArquivoBinario {

    public static void gravaArquivoBinario(List<AlunoV3> aux) {
        // Abrindo arquivo binario
        File file = new File("//home/cassiano/academicos");
        File auxd = new File("//home/cassiano");
        try {
            if (!auxd.exists()) {
                auxd.mkdir();
            }
            file.delete();
            file.createNewFile();
            ObjectOutputStream objOut;
            objOut = new ObjectOutputStream(
                    new FileOutputStream(file, true));
            //grava no arquivo binario os alunos do ranking            
            objOut.writeObject(aux);
            //fechar arquivo binario
            objOut.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
