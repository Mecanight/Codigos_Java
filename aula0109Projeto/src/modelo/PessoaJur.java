/**/
package modelo;

public class PessoaJur {

    private String cnpj;
    private String ie;
    private String renda;

    public PessoaJur() {
    }

    public PessoaJur(String cnpj, String ie, String renda) {
        this.cnpj = cnpj;
        this.ie = ie;
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "PessoaJur{" + "cnpj=" + cnpj + ", ie=" + ie + ", renda=" + renda + '}';
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

}
