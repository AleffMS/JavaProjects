/** Classe: ManipularArquivos
 *  Pacote: util
 *  Data de modificação: 27/11/2017
 *  Descrição: Está classe é responsavel por manipular qualquer tipo de arquivo
 **/

package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author aleff
 */

public class ManipularArquivos {
    
    // este método é responsavel por criar os arquivos
    public void criar(String path) {
        File arq = new File(path);
        try {
            if (arq.exists()) {
                JOptionPane.showMessageDialog(null, "O arquivo com esse nome já existe na pasta!!!");
            } else {
                arq.createNewFile();
                JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!!!");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex );
        }
    }

    // este método é responsavel por gravar/salvar os dados no arquivo
    public void gravar(String path, String text) {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append(text);
            pw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados no arquivo!!!" + ex);
        }
    }
    
    // este método é responsavel por ler os dados que foram gravados no arquivo em mostra na textarea
    public String ler(String path) {
        String texto = "";

        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();

            while (linha != null) {
                texto += linha + "\n";
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return texto;
    }

    // este método é responsavel por deletar os arquivos
    public void excluir(String path) {
        File arq = new File(path);

        if (arq.exists()) {
            arq.delete();
            JOptionPane.showMessageDialog(null, "O arquivo foi excluido com sucesso!!!");
        } else {
            JOptionPane.showMessageDialog(null, "O arquivo com esse não nome não existe nessa pasta!!!");
        }
    }

}
