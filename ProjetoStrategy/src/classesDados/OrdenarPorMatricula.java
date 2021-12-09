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
public class OrdenarPorMatricula implements ICriterioOrdenacao {

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
        return professor1.getMatricula() < professor2.getMatricula();
    }

}
