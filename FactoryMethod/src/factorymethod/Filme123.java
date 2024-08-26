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
public class Filme123 implements ProdutoraFilme{
    
    @Override
     public Filme criarFilme() {
        return new Comedia();
    }
}
