
package entidades;

import java.io.Serializable;

public class Cidade
implements Serializable {
    private int codCidade;
    private String cidade;
    private String estado;
    private boolean moderna;

    public Cidade() {
    }

    public Cidade(int codCidade, String cidade, String estado, boolean moderna) {
        this.codCidade = codCidade;
        this.cidade = cidade;
        this.estado = estado;
        this.moderna = moderna;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isModerna() {
        return moderna;
    }

    public void setModerna(boolean moderna) {
        this.moderna = moderna;
    }
}
