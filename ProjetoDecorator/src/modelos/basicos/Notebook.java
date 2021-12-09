/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.basicos;

/**
 *
 * @author M
 */
public class Notebook implements IComputador {
    
    private String descricao;

    public Notebook() {
        descricao =  "Notebook Acer Core i5 8GB 1TBHD+128GB SSD GeForce® GTX1650 4GB Tela 15,6\" "
                +    "\nFull HD Windows 10 Aspire Nitro 5 Gamer AN515-54-528V Intel® Core™ i5-9300H\n\n";
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double preco() {
        return 5199.00;
    }
    
}
