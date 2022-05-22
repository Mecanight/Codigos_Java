/**/
package modelo;

public class Proprietario {
    private String nome;
    private String celular;
    private String email;

    public Proprietario() {
    }

    public Proprietario(String nome, String celular, String email) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", celular="
                + celular + ", email=" + email + '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
