/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofabrica;
import javax.swing.JOptionPane;
import modelos.*;
import fabrica.FabricaProdutos;
/**
 *
 * @author M
 */
public class ProjetoFabrica {

    /**
     * @param args the command line arguments
     */
    
    private static void imprimirDados(Produto objeto){
        String saida =  "Descrição:\n\n" + 
                        "Tipo de Produto: " + objeto.getTipoProduto() + "\n" +
                        "Codigo: " + objeto.getCodigo() + "\n" +
                        "Preço: R$ " + objeto.getPrecoVenda() + "\n\n" +
                        objeto.descricao(); 

        JOptionPane.showMessageDialog(null, saida);
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = {"LIVRO", "CDMUSICA", "NOTEBOOK", "CELULAR"};
        Object tipoDoProduto;
        Produto obj = null;
        do{
            tipoDoProduto = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"LIVRO");
            obj = FabricaProdutos.getProduto(tipoDoProduto.toString());
            imprimirDados(obj);
        }while(controle);
    }
    
}
