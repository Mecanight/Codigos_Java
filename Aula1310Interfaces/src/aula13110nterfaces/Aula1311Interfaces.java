/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13110nterfaces;

/**
 *
 * @author Geri
 */

import modelo.Consulta;
import modelo.ConsultaDePlano;
import modelo.ConsultaDePlanoOuro;
import modelo.ConsultaDePlanoPrata;
import modelo.Paciente;
import modelo.PlanoSaude;
public class Aula1311Interfaces {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.setCelular("91151432");
        p.setCpf("648471");
        p.setEmail("geri@geri.com.br");
        p.setNome("Géri Dutra");
        PlanoSaude ps = new PlanoSaude();
        ps.setAnoInicio(1999);
        ps.setCodigo(1);
        ps.setNumDependentes(2);
        ps.setPaciente(p);
        Consulta c = new Consulta();
        c.setData("13/11/2017");
        c.setMatricula(123);
        c.setPaciente(p);
        c.setValor(500);
        ConsultaDePlanoOuro cpo = new 
        ConsultaDePlanoOuro();
        cpo.setData("13/11/2017");
        cpo.setMatricula(123);
        cpo.setPaciente(p);
        cpo.setPlano(ps);
        cpo.setValor(500);
        System.out.println("Valor do desconto: "+
                cpo.calculaDesconto());
    }
    
}
