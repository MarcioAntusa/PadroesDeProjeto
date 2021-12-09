/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomposite;

import interfaces.Produto;
import fabrica.FabricaDeProdutos;
import classes.*;

/**
 *
 * @author M
 */
public class ProjetoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produto produto1 = FabricaDeProdutos.getInstancia("CONDULETE","Condulete Múltiplo 3/4 Tipo X", 20, 54.41);
        Produto produto2 = FabricaDeProdutos.getInstancia("FIOELETRICO" ,"Fio Elétrico Cabo Flexível 2,5mm Cobre Rolo 100m C/ Nf", 10, 78.90);
        Produto produto3 = FabricaDeProdutos.getInstancia("INTERRUPTOR" ,"Conjunto 4x2 com 3 Interruptores Paralelos 6 A 250 V Tramontina Aria Branco", 60, 28.40);
        Produto produto4 = FabricaDeProdutos.getInstancia("TOMADA", "Conjunto de Tomada Energia 10A Branco Stella Steck", 50, 4.99);

        Estoque estoque1 = new Estoque();
        estoque1.adiciona(produto1);
        estoque1.adiciona(produto2);
        estoque1.adiciona(produto3);
        estoque1.adiciona(produto4);

        System.out.println("\nPRODUTOS ADICINADOS AO ESTOQUE 1 : ");
        estoque1.imprime();
        System.out.println("\n============================================================================");

        
        Produto produto5 = FabricaDeProdutos.getInstancia("FIOELETRICO", "Fio Elétrico Cabo Flexível 2,5mm Cobre Rolo 100m C/ Nf", 200, 78.90);
        Produto produto6 = FabricaDeProdutos.getInstancia("INTERRUPTOR", "Conjunto 4x2 com 3 Interruptores Paralelos 6 A 250 V Tramontina Aria Branco", 160, 28.40);
       
        Estoque estoque2 = new Estoque();
        estoque2.adiciona(produto5);
        estoque2.adiciona(produto6);

        System.out.println("\nPRODUTOS ADICINADOS AO ESTOQUE 2 : ");
        estoque2.imprime();
        System.out.println("\n============================================================================");

    }

}
