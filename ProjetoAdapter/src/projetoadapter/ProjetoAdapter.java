/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoadapter;
import Classes.*;

/**
 *
 * @author M
 */
public class ProjetoAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String teste = "VocE EntRou no MoDo de naVeGaCAO AnonImA";
        
        ConverterString texto = null;
        texto = new AdapterString();
        
        //texto = new AlteraString();
        
        System.out.println("String Original: " + teste + "\n");
        
        System.out.println("Minusculo: " + texto.converterMinusculo(teste));
        System.out.println("Maiusculo: " + texto.converterMaiusculo(teste));
    }
    
}
