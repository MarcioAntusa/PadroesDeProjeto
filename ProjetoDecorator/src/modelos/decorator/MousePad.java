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
public class MousePad extends Periferico{

    public MousePad(IComputador computador) {
        super(computador);
    }

    @Override
    public String getDescricao() {
        return computador.getDescricao() + "Mousepad Gamer HyperX Fury S\n";
    }

    @Override
    public double preco() {
        return 79.90 + computador.preco();
    }
}
