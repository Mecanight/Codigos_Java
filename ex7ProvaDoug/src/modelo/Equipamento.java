/**/
package modelo;

public class Equipamento {

    private String tipo;
    private String marca;
    private String modelo;
    private String dataDevolu;

    public Equipamento() {
    }

    public Equipamento(String tipo, String marca,
            String modelo, String dataDevolu) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.dataDevolu = dataDevolu;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "tipo=" + tipo + ", marca=" + marca
                + ", modelo=" + modelo + ", dataDevolu=" + dataDevolu + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getDataDevolu() {
        return dataDevolu;
    }

    public void setDataDevolu(String dataDevolu) {
        this.dataDevolu = dataDevolu;
    }

    
}
