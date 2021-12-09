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
public class AlteraString implements ConverterString {

    @Override
    public String converterMaiusculo(String dados) {
        //Converte a String recebida para maiusculo
        String saida = "";
        char c;

        for (int i = 0; i < dados.length(); i++) {
            c = dados.charAt(i); //Armazena na variavel "c" letra a letra da String
            /*if (c >= 'a' && c <= 'z') {
                saida += (char) ((int) c - 32); //Converte para maiusculo usando a tabela ascii
            } else {
                saida += c;
            }
            */
            saida += (c >= 'a' && c <= 'z') ? (char) ((int) c - 32) : c; //Operador Ternary
        }
        return saida; //Retorna a String convertida

    }

    @Override
    public String converterMinusculo(String dados) {
        //Converte a String recebida para minusculo
        String saida = "";
        char c;

        for (int i = 0; i < dados.length(); i++) {
            c = dados.charAt(i); //Armazena na variavel "c" letra a letra da String
            /*if (c >= 'A' && c <= 'Z') {
                saida += (char) ((int) c + 32); //Converte para minusculo usando a tabela ascii
            } else {
                saida += c;
            }
            */
            saida += (c >= 'A' && c <= 'Z') ? (char) ((int) c + 32) : c; //Operador Ternary
        }
        return saida; //Retorna a String convertida
    }

}
