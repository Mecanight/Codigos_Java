/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Geri
 */
public class Consulta {
    private int matricula;
    private String data;
    protected double valor;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(int matricula, String data, double valor, Paciente paciente) {
        this.matricula = matricula;
        this.data = data;
        this.valor = valor;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" + "matricula=" + matricula + ", data=" + data + ", valor=" + valor + ", paciente=" + paciente + '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
        
}
