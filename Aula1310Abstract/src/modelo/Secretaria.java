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
public class Secretaria extends Funcionario {

    @Override
    public double getBonificacao() {
        return this.getSalario()*1.3;
    }
    
}
