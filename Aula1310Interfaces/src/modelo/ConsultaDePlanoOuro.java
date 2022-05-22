/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.ConsultaDePlano;

/**
 *
 * @author Geri
 */
public class ConsultaDePlanoOuro 
    extends ConsultaDePlano{

    public ConsultaDePlanoOuro() {
    }
    
    public ConsultaDePlanoOuro(PlanoSaude plano, int matricula, String data, double valor, Paciente paciente) {
        super(plano, matricula, data, valor, paciente);
    }
    
    @Override
    public double calculaDesconto() {
        double ret;
        if (this.getPlano().getAnoInicio() <= 2000){
            ret = valor;
        }else{
            ret = valor * 30 / 100.;
        }
        return ret;
    }
    
    
}
