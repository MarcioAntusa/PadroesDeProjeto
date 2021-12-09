/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.decorator;
import modelos.basicos.IComputador;

/**
 *
 * @author M
 */
public class HeadSet extends Periferico {

    public HeadSet(IComputador computador){
        super(computador);
    }
        
    @Override
    public String getDescricao() {
        return computador.getDescricao() + "Headset Gamer Redragon\n";
    }

    @Override
    public double preco() {
        return 369.00 + computador.preco();
    }
    
}
