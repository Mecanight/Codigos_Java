/**/
package modelo;

public class Cliente {

    private String nome;
    private String celular;
    private String ender;
    private String email;
    private double saldo;

    //fazer os metodos contrutores
    //toString
    //metodos det e set
    public Cliente() {
    }

    public Cliente(String nome, String celular, String ender, String email, double saldo) {
        this.nome = nome;
        this.celular = celular;
        this.ender = ender;
        this.email = email;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", celular=" + celular + ", ender=" + ender + ", email=" + email + ", saldo=" + saldo + '}';
    }

    //get *MOSTRA ATUAL
    //set *MUDA
    public void compra(double valor) {
        setSaldo(getSaldo() - valor);
    }

    public void paga(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
