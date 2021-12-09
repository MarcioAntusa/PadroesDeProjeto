/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author M
 */
public abstract class Produto  {
    //Atributos
    private String codigo;
    private float precoVenda;
    private String tipoProduto;
    
    //Metodos
    public abstract String descricao();
   
    //Construtor
    public Produto(String codigo, float precoVenda, String tipoProduto) {
       this.codigo = codigo;
       this.precoVenda = precoVenda;
       this.tipoProduto = tipoProduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
      
}
