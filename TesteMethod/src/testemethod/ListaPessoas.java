/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemethod;

import java.util.ArrayList;

/**
 *
 * @author 2020122760242
 */
public class ListaPessoas {
    protected ArrayList<Pessoa> pessoas;
    protected OrdenadorTemplate ordenador;
    public ListaPessoas(ModoDeReproducao modo) {
        pessoas = new ArrayList<Pessoa>();
        switch (modo) {
            case porIdade:
                ordenador = new OrdenadorPorIdade();
                break;
            case porPeso:
                ordenador = new OrdenadorPorPeso();
                break;
            case porAltura:
                ordenador = new OrdenadorPorAltura();
                break;
            case porNome:
                ordenador = new OrdenadorPorNome();
                break;
            default:
                break;
        }
    }
    public void setModoDeReproducao(ModoDeReproducao modo) {
        ordenador = null;
        switch (modo) {
            case porIdade:
                ordenador = new OrdenadorPorIdade();
                break;
            case porPeso:
                ordenador = new OrdenadorPorPeso();
                break;
            case porAltura:
                ordenador = new OrdenadorPorAltura();
                break;
            case porNome:
                ordenador = new OrdenadorPorNome();
                break;
            default:
                break;
        }
    }
    public void adicionarPessoa(String nome, int idade, double peso, double altura) {
        pessoas.add(new Pessoa(nome, idade, peso, altura));
    }

    public void mostrarListaDeReproducao() {
        ArrayList<Pessoa> novaLista = new ArrayList<Pessoa>();
        novaLista = ordenador.OrdenarPessoa(pessoas);

        for (Pessoa pessoa : novaLista) {
            System.out.println(pessoa.nome + " \n Idade: " + pessoa.idade + "\n Peso: "
                    + pessoa.peso + "\n Altura: " + pessoa.altura + "\n");
        }
    }
}
