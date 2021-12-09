/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import interfaces.ICriterioOrdenacao;
import classesDados.*;

/**
 *
 * @author M
 */
public class FabricaCriterioDeOrdenacao {

    public enum opcoes {
        NOME, MATRICULA, ESCOLA_NOME, TITULACAO_NOME, ESCOLA_TITULACAO_NOME, TITULACAO_ESCOLA_NOME;
    }

    public static ICriterioOrdenacao getInstancia(String tipoDoProduto) {
        opcoes tipo = opcoes.valueOf(tipoDoProduto);
        switch (tipo) {
            case NOME:
                return new OrdenarPorNome();
            case MATRICULA:
                return new OrdenarPorMatricula();
            case ESCOLA_NOME:
                return new OrdenarPorEscolaNome();
            case TITULACAO_NOME:
                return new OrdenarPorTitulacaoNome();
            case ESCOLA_TITULACAO_NOME:
                return new OrdenarPorEscolaTitulacaoNome();
            case TITULACAO_ESCOLA_NOME:
                return new OrdenarPorTitulacaoEscolaNome();
            default:
                return null;
        }
    }
}
