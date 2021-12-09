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
public class OrdenarPorMatricula extends ProfessorPersistenciaTemplateMethod {

    public OrdenarPorMatricula(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
        /*
        if(professor1.getMatricula() <= professor2.getMatricula()) return true;
        else return false;  
         */
        return professor1.getMatricula() < professor2.getMatricula();
    }

}
