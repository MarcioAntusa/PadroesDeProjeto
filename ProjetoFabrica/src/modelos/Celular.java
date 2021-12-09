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
public class Celular extends Produto {
    //Atributos
    private String modelo;
    private String marca;
    private String armazenamento;
    private String sistemaOperacional;
    private String tamanhoTela;
    
    //Construtor
    public Celular(String codigo, float precoVenda, String tipoProduto, 
                   String modelo, String marca, String armazenamento,
                   String sistemaOperacional, String tamanhoTela) {
        super(codigo, precoVenda, tipoProduto);
        this.modelo = modelo;
        this.marca = marca;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
    }
            
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String descricao() {

        return( "Modelo: " + getModelo() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Armazenamento: " + getArmazenamento()  + "\n" +
                "Sistema Operacional: " + getTamanhoTela() + "\n" +
                "Tamanho da Tela: " + getTamanhoTela());
    }
 
}
