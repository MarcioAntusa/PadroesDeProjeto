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
public class WebCam extends Periferico {

    public WebCam(IComputador computador) {
        super(computador);
    }

    @Override
    public String getDescricao() {
        return computador.getDescricao() + "\nWebcam Loosafe";
    }

    @Override
    public double preco() {
        return 239.90 + computador.preco();
    }

}
