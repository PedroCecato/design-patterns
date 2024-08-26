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
public class Carro {
    
    public static final int TURBO = 1;
    public static final int COMUM = 2;
    public static final int CABINE_DUPLA = 3;
    
    protected double potencia;
    protected int modelo;
    protected int qntRodas;
    protected CalculaPotencia estrategiaCalculo;
    
    public Carro(int modelo, double potencia){
        
        this.potencia = potencia;
        
        switch(modelo){
            
            case TURBO:
                this.estrategiaCalculo = new CalculaPotenciaModelosEspeciais();
                this.modelo = TURBO;
                this.qntRodas = 4;
            break;
            
            case CABINE_DUPLA:
                estrategiaCalculo = new CalculaPotenciaModelosEspeciais();
                modelo = CABINE_DUPLA;
                this.qntRodas = 6;
            break;
            
            case COMUM:
                estrategiaCalculo = new CalculaPotenciaModeloComum();
                modelo = COMUM;
                this.qntRodas = 4;
            break;
            
            default:
                throw new RuntimeException("Modelo não encontrado!\n");
        }
    }
    
    public double calcularPotenciaComBaseModelos(){
        return estrategiaCalculo.calculaPotencia(this);
    }
    
    public double getPotencia(){
        return this.potencia;
    }

    int getRodas() {
        return this.qntRodas;
    }
    
    
}
