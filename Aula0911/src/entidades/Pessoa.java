package entidades;

import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geri
 */
// implements Serializable serve para que os objetos desta
// classe possam ser gravados em arquivo
public class Pessoa implements Serializable{
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    private double imc;
    private String iimc;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura,
            double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        setImc();
        setIimc();
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIimc() {
        return iimc;
    }

    public void setIimc() {
        if (getImc() <= 18.5){
            this.iimc = "Abaixo do peso";
        }else if (getImc() <= 25){
             this.iimc = "Peso normal";
        }else if (getImc() <= 30){
            this.iimc = "Acima do peso";
        }else{
            this.iimc = "Obeso";
        }
    }

    public double getImc() {
        return imc;
    }

    public void setImc() {
        this.imc = getPeso()/(getAltura()*getAltura());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
