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
public class Desktop implements IComputador {
    
    private String descricao;

    public Desktop() {
        descricao =  "PC GAMER T-GAMER, FRAMEMASTER, AMD RYZEN 5 5600X / "
                +    "GeForce RTX 2060 6GB / DDR4 8GB / SSD 120GB\n\n";
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double preco() {
        return 7400.43;
    }
    
}
