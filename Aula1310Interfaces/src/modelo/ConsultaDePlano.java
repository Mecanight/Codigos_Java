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
public abstract class ConsultaDePlano
    extends Consulta 
    implements CalculaDesconto{
    private PlanoSaude plano;

    public ConsultaDePlano() {
    }

    public ConsultaDePlano(PlanoSaude plano) {
        this.plano = plano;
    }

    public ConsultaDePlano(PlanoSaude plano, int matricula, String data, double valor, Paciente paciente) {
        super(matricula, data, valor, paciente);
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "ConsultaDePlano{" + "plano=" + plano + '}';
    }

    public PlanoSaude getPlano() {
        return plano;
    }

    public void setPlano(PlanoSaude plano) {
        this.plano = plano;
    }
            
}
