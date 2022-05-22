/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidades.Pessoa;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Geri
 */
public class ModeloTabela extends 
        AbstractTableModel {
    private List linhas = null;
    // Definição das colunas da tabela
    String[] colunas = {"Nome", "Idade", "Altura",
        "Peso", "Sexo", "IMC", "Avaliação"};    
    
    public ModeloTabela(List dados) {
        setLinhas(dados);        
    }

    public int getRowCount() {
        return getLinhas().size();        
    }

    public int getColumnCount() {
        return getColunas().length;
    }
    // Este método precisa ser ajustado
    // só alterar para o formato da classe que estou
    // trabalhando no momento
    public Object getValueAt(int row, int col) {
        String ret = "";
        Pessoa linha = (Pessoa) 
                getLinhas().get(row);
        NumberFormat nf = 
                NumberFormat.getNumberInstance();
        NumberFormat nfi = 
                NumberFormat.getIntegerInstance();
        switch (col) {
            case 0:
                ret = linha.getNome();
                break;
            case 1:
                ret = nfi.format(linha.getIdade());
                break;
            case 2:
                ret = nf.format(linha.getAltura());
                break;
            case 3:
                ret = nf.format(linha.getPeso());                
                break;
            case 4:
                ret = linha.getSexo();
                break;
            case 5:                
                ret = nf.format(linha.getImc());
                break;
            case 6:
                ret = linha.getIimc();
                break;
        }
        return ret;
    }
// Ajustar a classe para a classe que está sendo trabalhada

    public void adicionaLinha(Pessoa dadosLinha) {
        getLinhas().add(dadosLinha);
        int linha = getLinhas().size() - 1;
        fireTableRowsInserted(linha, linha);
        return;
    }

    public void removeLinha(int linha) {
        getLinhas().remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }

    public String[] getColunas() {
        return colunas;
    }

    public List getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    private void setLinhas(List list) {
        linhas = list;
    }
}
