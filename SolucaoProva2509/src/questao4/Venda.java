/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author Geri
 */
import java.util.Date;
public class Venda {
    private Proprietario proprietario;
    private Veiculo veiculo;
    private Date data;
    private double valor;

    public Venda() {
    }

    public Venda(Proprietario proprietario, Veiculo veiculo, Date data, double valor) {
        this.proprietario = proprietario;
        this.veiculo = veiculo;
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda{" + "proprietario=" + proprietario + ", veiculo=" + veiculo + ", data=" + data + ", valor=" + valor + '}';
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
