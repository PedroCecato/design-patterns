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
public class CalculaPotenciaModeloComum implements CalculaPotencia{
    
    public double calculaPotencia(Carro car){
        
        if(car.getRodas() >= 4)
            return (car.getPotencia() * 0.95)+ car.getPotencia();
        else
            return (car.getPotencia() * 0.75)+ car.getPotencia();
    }
}
