/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Produto;

/**
 *
 * @author M
 */
public class FioEletrico implements Produto {

    private String descricao;
    private int quantidade = 0;
    private double preco = 0;

    public FioEletrico(String descricao, int quantidade, double preco) {
        this.descricao = descricao;
        this.quantidade += quantidade;
        this.preco = preco;
    }

    public void imprime() {
        System.out.println("\nFio Eletrico:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço Unitario: $" + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidade);
    }
}
