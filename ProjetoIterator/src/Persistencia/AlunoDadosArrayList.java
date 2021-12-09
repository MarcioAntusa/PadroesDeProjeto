/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelos.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author M
 */
public class AlunoDadosArrayList implements IDados {

    @Override
    public Iterator obterListagemDeAluno(String nomeArquivoDisco) throws Exception {

        List dadosSaida = new ArrayList();
        FileReader fr = new FileReader(nomeArquivoDisco);
        BufferedReader br = new BufferedReader(fr);

        String linha = "";

        while ((linha = br.readLine()) != null) {
            String[] vetorDeString = linha.split(";");
            if (vetorDeString.length < 4) {
                throw new Exception("Erro de leitura de dados");
            }
            Aluno objetoAluno = new Aluno(vetorDeString[0], vetorDeString[1], vetorDeString[2], vetorDeString[3]);
            dadosSaida.add(objetoAluno);
        }
        return dadosSaida.iterator();
    }

}
