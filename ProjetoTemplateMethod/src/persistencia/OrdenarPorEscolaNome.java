/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classesDados.Professor;

/**
 *
 * @author M
 */
public class OrdenarPorEscolaNome extends ProfessorPersistenciaTemplateMethod {

    public OrdenarPorEscolaNome(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
        /*
        int saida = professor1.getEscola().compareToIgnoreCase(professor2.getEscola());
        saida = (saida == 0) ? professor1.getNome().compareToIgnoreCase(professor2.getNome()) : saida;
        return(saida <= 0);
         */
        if (professor1.getEscola().compareToIgnoreCase(professor2.getEscola()) == 0
                && (professor1.getNome().compareToIgnoreCase(professor2.getNome()) < 0)) {
            return true;
        }
        return professor1.getEscola().compareToIgnoreCase(professor2.getEscola()) < 0;
    }
    
}
