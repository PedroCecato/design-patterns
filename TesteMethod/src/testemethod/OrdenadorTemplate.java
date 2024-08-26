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

public abstract class OrdenadorTemplate {
    public abstract boolean isPrimeiro(Pessoa pessoa, Pessoa pessoa2);
    protected ArrayList<Pessoa> OrdenarPessoa(ArrayList<Pessoa> lista) {
        ArrayList<Pessoa> novaLista = new ArrayList<Pessoa>();
        for (Pessoa pessoa : lista) {
            novaLista.add(pessoa);
        }
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                    Pessoa temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }

        return novaLista;
    }
}
