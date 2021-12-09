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
public class Livro extends Produto {
    //Atributos
    private String titulo; //Acrescentei está variavel.
    private String autor; 
    private String tradutor;
    private String editora;
    private int anoPublicacao;
    
    //Construtor
    public Livro(String codigo, float precoVenda, String tipoProduto, 
                 String autor, String tradutor, String titulo, String editora, int anoPublicacao) {
        super(codigo, precoVenda, tipoProduto);
        this.autor = autor;
        this.tradutor = tradutor;
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String descricao() {
        return( "Autor: " + getAutor() + "\n" +
                "Tradutor: " + getTradutor() + "\n" +
                "Titulo: " + getTitulo() + "\n" +
                "Editora: " + getEditora()  + "\n" +
                "Ano de Publicação: " + getAnoPublicacao());
    }
    
}
