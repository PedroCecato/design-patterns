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
public class FactoryMethod {
public static void main(String[] args) {
        ProdutoraFilme produtora = new Filme555();
        Filme filme = produtora.criarFilme();
        filme.exibirInfo();
        System.out.println();
        
        produtora = new Filme123();
        filme = produtora.criarFilme();
        filme.exibirInfo();
        System.out.println();

    }
    
}
