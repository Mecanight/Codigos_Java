/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Geri
 */
public class LerArquivoBinario {

    public LerArquivoBinario() { 

    }

    public static List lerDados(String arquivo){
        List aux = new ArrayList();
                try {
            //Abrindo arquivo binário
            File file = new File(arquivo);
            if (file.exists()) {
                ObjectInputStream objInp = new ObjectInputStream(
                        new FileInputStream(file));
                aux = (List)objInp.readObject();
                objInp.close();
            }else{
                JOptionPane.showMessageDialog(null,
                        "Arquivo não encontrado");
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return aux;
    }
}
