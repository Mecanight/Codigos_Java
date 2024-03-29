
package modelo;

public class Pessoa {
    private String nome;
    private String email;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", email=" + email + ", celular=" + celular + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
