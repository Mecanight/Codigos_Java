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
        return "Proprietario{" + "nome=" + nome + ", celular=" + celular + ", email=" + email + '}';
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
