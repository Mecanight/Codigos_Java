/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Geri
 */
public class GravaArquivoBinario {
    
    // Um método estático pode ser executado sem a criação
    // de um objeto da classe
    // ArrayList é um vetor, mas dinâmico
    public static void gravaArquivoBinario(List aux, 
            String arquivo, String diretorio) {
        // Abrindo arquivo binário
        File file = new File(arquivo);
        File auxd = new File(diretorio);
        try {
            if (!auxd.exists()){
                auxd.mkdir();
            }
            file.delete();
            file.createNewFile();            
            ObjectOutputStream objOut;
            objOut = new ObjectOutputStream(
                    new FileOutputStream(file, true));
            //grava no arquivo binário 
            objOut.writeObject(aux);
            //fechar arquivo binário
            objOut.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
