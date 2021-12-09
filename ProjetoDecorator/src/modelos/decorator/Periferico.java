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
public abstract class Periferico implements IComputador {

    protected IComputador computador = null;
    
    public Periferico(IComputador computador) {
        this.computador = computador;
    } 
    
}
