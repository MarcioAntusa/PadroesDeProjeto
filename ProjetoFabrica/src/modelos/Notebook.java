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
public class Notebook extends Produto {
    //Atributos
    private String marca;
    private String modelo;
    private String memoriaRam;
    private String armazenamento;
    private String processador;
    private String tamanhoTela;
    private String sistemaOperacional;

   //Construtor
    public Notebook(String codigo, float precoVenda, String tipoProduto, 
                    String marca, String modelo, String memoriaRam, 
                    String armazenamento, String processador, 
                    String tamanhoTela, String sistemaOperacional) {
        super(codigo, precoVenda, tipoProduto);
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
    }   
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String descricao() {

        return( "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Memoria Ram: " + getMemoriaRam()  + "\n" +
                "Armazenamento: " + getArmazenamento() + "\n" +
                "Processador: " + getProcessador()  + "\n" +
                "Tamanho da Tela: " + getTamanhoTela()  + "\n" +
                "Sistema Operacional: " + getSistemaOperacional());
    }
    
}
