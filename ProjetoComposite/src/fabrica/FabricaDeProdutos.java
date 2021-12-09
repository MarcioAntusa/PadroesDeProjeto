/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import classes.*;
import interfaces.Produto;

/**
 *
 * @author M
 */
public class FabricaDeProdutos {
        public enum opcoes {
        CONDULETE, DISJUNTOR,FIOELETRICO, INTERRUPTOR, TOMADA ;
    }

    public static Produto getInstancia(String tipoDoProduto, String descricao, int quantidade, double preco) {
        opcoes tipo = opcoes.valueOf(tipoDoProduto);
        switch (tipo) {
            case CONDULETE:
                return new Condulete(descricao, quantidade, preco);
            case DISJUNTOR:
                return new Disjuntor(descricao, quantidade, preco);
            case FIOELETRICO:
                return new FioEletrico(descricao, quantidade, preco);
            case INTERRUPTOR:
                return new Interruptor(descricao, quantidade, preco);
            case TOMADA:
                return new Tomada(descricao, quantidade, preco);
            default:
                return null;
        }
    }
}
