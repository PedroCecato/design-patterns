/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Luiz Gustavo Gomes Damasceno e Pedro Caliman Cecato
 */
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro car = new Carro(Carro.TURBO,715);
        System.out.println("A potência do car1 eh: " + car.calcularPotenciaComBaseModelos());
        
        Carro car2 = new Carro(Carro.COMUM,846);
        System.out.println("A potência do car2 eh: " + car2.calcularPotenciaComBaseModelos());
        
    }
    
}
