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
public class OrdenadorPorNome extends OrdenadorTemplate{
    
    @Override
    public boolean isPrimeiro(Pessoa pessoa, Pessoa pessoa2) {
        if (pessoa.nome.compareToIgnoreCase(pessoa2.nome) <= 0) {
            return true;
        }
        return false;
    }

}
