/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import classesDados.Professor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author M
 */
public abstract class ProfessorPersistenciaTemplateMethod {
    //Atributos
    private String nomeDoArquivo;
    
    //Metodos
    public ProfessorPersistenciaTemplateMethod(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    //Metodo abstrato que ira compor o algoritmo de ordenacao da listagem
    public abstract boolean ePrimeiro(Professor professor1, Professor professor2);
    
    public Iterator listagemDeProfessoresOrdenados()throws Exception{
        try{
            ArrayList<Professor> dadosDosProfessores = new ArrayList<>();
            //ArrayList<Professor> dadosDosProfessores = new ArrayList<Professor>();
            
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            
            String linha = "";

            while((linha=br.readLine()) != null){
                String[] vetorDeString = linha.split(";");
                if(vetorDeString.length < 4) throw new Exception("Erro de leitura de dados");
                //Integer.parseInt(string) converter de String para int
                Professor objetoProfessor = new Professor(Integer.parseInt(vetorDeString[0]), vetorDeString[1], vetorDeString[2], vetorDeString[3]);
                dadosDosProfessores.add(objetoProfessor);
            }
            br.close();
            
            //Algoritmo de Ordenação
            for (int i = 0; i < dadosDosProfessores.size(); i++) {
                for (int j = i+1; j < dadosDosProfessores.size(); j++) {
                    
                    if (!ePrimeiro(dadosDosProfessores.get(i),dadosDosProfessores.get(j))) {    
                        Professor temp = dadosDosProfessores.get(j);
                        dadosDosProfessores.set(j, dadosDosProfessores.get(i));
                        dadosDosProfessores.set(i, temp);
                    }
                }
            }
            return dadosDosProfessores.iterator();
            
        }catch(Exception erro){
            throw erro;
        } 
    }
    
}
