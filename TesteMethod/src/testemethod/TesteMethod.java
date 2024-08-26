/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemethod;

/**
 *
 * @author 2020122760242
 */
public class TesteMethod {

    public static void main(String[] args) {

        ListaPessoas listaPessoas = new ListaPessoas(ModoDeReproducao.porNome);
        listaPessoas.adicionarPessoa("Pedro", 20, 100.2, 1.83);
        listaPessoas.adicionarPessoa("Luiz Gustavo", 21, 89.5, 1.78);
        listaPessoas.adicionarPessoa("Gustavo", 22, 105.5,1.80);
        listaPessoas.adicionarPessoa("André", 23,  98.7, 1.82);
        listaPessoas.adicionarPessoa("Gabriel", 21, 75.8, 1.75);

        System.out.println("-----------------   Lista por Nome   -----------------\n");
        listaPessoas.mostrarListaDeReproducao();

        System.out.println("\n-----------------   Lista por Idade   -----------------\n");
        listaPessoas.setModoDeReproducao(ModoDeReproducao.porIdade);
        listaPessoas.mostrarListaDeReproducao();

        System.out.println("\n-----------------   Lista por Peso   -----------------\n");
        listaPessoas.setModoDeReproducao(ModoDeReproducao.porPeso);
        listaPessoas.mostrarListaDeReproducao();

        System.out.println("\n-----------------   Lista por Altura   -----------------\n");
        listaPessoas.setModoDeReproducao(ModoDeReproducao.porAltura);
        listaPessoas.mostrarListaDeReproducao();
    }
    
}
