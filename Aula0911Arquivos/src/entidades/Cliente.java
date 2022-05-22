
package entidades;

public class Cliente {
    private int codCliente;
    private String nome;
    private String celular;
    private String email;
    private String senha;

    public Cliente() {
    }

    public Cliente(int codCliente, String nome, String celular,
            String email, String senha) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString(){
        return this.nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
