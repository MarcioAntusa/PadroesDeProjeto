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
public class Teclado extends Periferico{
    
    public Teclado(IComputador computador){
        super(computador);
    }
        
    @Override
    public String getDescricao() {
        return computador.getDescricao() + "Teclado Gamer Mecânico HyperX\n";
    }

    @Override
    public double preco() {
        return 529.90 + computador.preco();
    }
}


