/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Produto;
import java.util.*;

/**
 *
 * @author M
 */
public class Estoque implements Produto {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(Produto produto) {
        this.produtos.remove(produto);
    }

    @Override
    public void imprime() {
        for (Produto produto : this.produtos) {
            produto.imprime();
        }
    }
}
