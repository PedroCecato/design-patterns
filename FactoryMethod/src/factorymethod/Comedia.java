/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author pedro
 */
public class Comedia implements Filme{
    
    @Override
    public void exibirInfo() {
         System.out.println("Nome: Deby e Loid(Comédia)\nProdutor: 123 filmes");
    }
    
}
