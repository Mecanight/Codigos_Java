/**/
package modelo;

public class ClientePessoaJuridica extends Cliente {

    public String cnpj;
    public String ie;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String cnpj, String ie, String nome, String celular, String ender, String email, double saldo) {
        super(nome, celular, ender, email, saldo);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientePessoaJuridica{" + "cnpj=" + cnpj + ", ie=" + ie + '}';

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

}
