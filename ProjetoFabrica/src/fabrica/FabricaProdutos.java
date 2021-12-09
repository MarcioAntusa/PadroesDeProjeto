/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import modelos.*;

/**
 *
 * @author M
 */
public class FabricaProdutos {
    
    public enum opcoes{
        LIVRO, CDMUSICA, NOTEBOOK, CELULAR;
    }
    
public static Produto getProduto(String tipoDoProduto){
    opcoes tipo = opcoes.valueOf(tipoDoProduto);
        switch (tipo){
            case LIVRO:
                return new Livro("8456", 54.14f, "LIVRO", "asdfads", "fasdf", "sdafsdf", "sdfa", 2011);
            case CDMUSICA:
                return new CDMusica("8445661", 0.00f, "CDMUSICA", "gfdsg", "sdfg", "hfasd", "jghj");
            case NOTEBOOK:
                return new Notebook("113441", 5199.90f, "NOTEBOOK", "ACER", "Endless OS - AN515-54-58CL", "8G", "1TB", "i5", "15.6", "Windows 10");
            case CELULAR:
                    return new Celular("231147800", 5579.07f, "CELULAR", "iPhone 12", "APPLE", "128GB", "iOS", "6.1");
            default:
                return null;
        }
    }
  
}
