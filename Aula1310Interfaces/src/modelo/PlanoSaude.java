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
public class PlanoSaude {
    private int codigo;
    private int anoInicio;
    private int numDependentes;
    private Paciente paciente;

    public PlanoSaude() {
    }

    public PlanoSaude(int codigo, int anoInicio, int numDependentes, Paciente paciente) {
        this.codigo = codigo;
        this.anoInicio = anoInicio;
        this.numDependentes = numDependentes;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "PlanoSaude{" + "codigo=" + codigo + ", anoInicio=" + anoInicio + ", numDependentes=" + numDependentes + ", paciente=" + paciente + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
    
}
