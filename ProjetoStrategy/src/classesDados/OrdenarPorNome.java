/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesDados;

import interfaces.ICriterioOrdenacao;

/**
 *
 * @author M
 */
public class OrdenarPorNome implements ICriterioOrdenacao {

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) { 
        return professor1.getNome().compareToIgnoreCase(professor2.getNome()) < 0;
    }

}
