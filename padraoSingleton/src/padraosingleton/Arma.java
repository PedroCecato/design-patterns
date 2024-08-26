/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraosingleton;

/**
 *
 * @author gugag
 */
public class Arma {
    
    private String nome;
    
    private double cadenciaTiros;
    
    private static Arma arma;
    
    public static Arma getInstance(){
        if(arma == null)
            arma = new Arma();
        
        return arma;
    }
    
    private Arma(){
        this.nome = "Não informado";
        this.cadenciaTiros = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCadenciaTiros() {
        return this.cadenciaTiros;
    }

    public void setCadenciaTiros(double cadenciaTiros) {
        this.cadenciaTiros = cadenciaTiros;
    }
    
    
    
}
