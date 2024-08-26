/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author gugag
 */
public class CalculaPotenciaModelosEspeciais implements CalculaPotencia{
    
    public double calculaPotencia(Carro fun){
        
        if(fun.getPotencia() >= 3500)
            return fun.getPotencia() * 0.8;
        else
            return fun.getPotencia() * 0.85;
    }
    
}
