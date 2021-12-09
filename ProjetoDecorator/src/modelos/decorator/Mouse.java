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
public class Mouse extends Periferico {

    public Mouse(IComputador computador) {
        super(computador);
    }

    @Override
    public String getDescricao() {
        return computador.getDescricao() + "Mouse Gamer Corsair\n";
    }

    @Override
    public double preco() {
        return 329.90 + computador.preco();
    }
}
