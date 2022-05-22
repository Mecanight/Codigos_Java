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
public class ConsultaDePlanoPrata 
    extends ConsultaDePlano{

    public ConsultaDePlanoPrata() {
    }

    public ConsultaDePlanoPrata(PlanoSaude plano, int matricula, String data, double valor, Paciente paciente) {
        super(plano, matricula, data, valor, paciente);
    }
    
    @Override
    public double calculaDesconto() {
        double ret;
        if (this.getPlano().getAnoInicio() <= 2000){
            ret = valor * 50 / 100.;
        }else{
            ret = valor * 20 / 100.;
        }
        return ret;
    }
            
}
