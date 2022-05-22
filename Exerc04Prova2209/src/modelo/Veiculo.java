/**/
package modelo;

public class Veiculo {
    private String placa;
    private int ano;
    private double valor;
    private String chassis;
    private String marca;
    private String modelo;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano, double valor,
            String chassis, String marca, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.valor = valor;
        this.chassis = chassis;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", ano=" + ano
                + ", valor=" + valor + ", chassis=" + chassis
                + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
