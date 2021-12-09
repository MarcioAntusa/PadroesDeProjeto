/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author M
 */
public class AdapterString implements ConverterString {

    @Override
    public String converterMaiusculo(String dados) {
        //Retorna a String convertida em maiusculo, pela função "toUpperCase"
        return dados.toUpperCase();
    }

    @Override
    public String converterMinusculo(String dados) {
        //Retorna a String convertida em minusculo, pela função "toLowerCase"
        return dados.toLowerCase();
    }

}
