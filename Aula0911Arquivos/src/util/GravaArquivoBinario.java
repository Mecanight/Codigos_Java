
package util;

import entidades.Cidade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GravaArquivoBinario {

    public static void gravaArquivoBinario(List<Cidade> aux) {
        // Abrindo arquivo binário
        File file = new File("//home/cassiano/arqd");
        File auxd = new File("//home/cassiano/arqd");
        try {
            if (!auxd.exists()) {
                auxd.mkdir();
            }
            file.delete();
            file.createNewFile();
            ObjectOutputStream objOut;
            objOut = new ObjectOutputStream(
                    new FileOutputStream(file, true));
            //grava no arquivo binário os alunos do ranking            
            objOut.writeObject(aux);
            //fechar arquivo binário
            objOut.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
