/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodecorator;
import modelos.basicos.*;
import modelos.decorator.*;

/**
 *
 * @author M
 */
public class ProjetoDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IComputador computador1 = new Desktop();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Computador:   " + computador1.getDescricao());
        System.out.println("Preco:  " + computador1.preco());
        System.out.println("-------------------------------------------------");
        computador1 = new Mouse(computador1);
        System.out.println("Computador:   " + computador1.getDescricao());
        System.out.println("Preco:  " + computador1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        computador1 = new Teclado(computador1);
        System.out.println("Computador:   " + computador1.getDescricao());
        System.out.println("Preco:  " + computador1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
        computador1 = new WebCam(computador1);
        System.out.println("-------------------------------------------------");
        System.out.println("Computador:   " + computador1.getDescricao());
        System.out.println("Preco:  " + computador1.preco());

        IComputador computador2 = new Notebook();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Computador:   " + computador2.getDescricao());
        System.out.println("Preco:  " + computador2.preco());
        computador2 = new MousePad(computador2);
        System.out.println("-------------------------------------------------");
        System.out.println("Computador:   " + computador2.getDescricao());
        System.out.println("Preco:  " + computador2.preco());
        computador2 = new Mouse(computador2);
        System.out.println("-------------------------------------------------");
        System.out.println("Computador:   " + computador2.getDescricao());
        System.out.println("Preco:  " + computador2.preco());
       
    }

}
