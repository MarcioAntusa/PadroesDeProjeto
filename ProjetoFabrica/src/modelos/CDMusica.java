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
public class CDMusica extends Produto {
    //Atributos
    private String nomeAlbum;
    private String banda;
    private String cantor;
    private String generoMusical;
    
    //Construtor
    public CDMusica(String codigo, float precoVenda, String tipoProduto, 
                    String nomeAlbum, String banda, String cantor, 
                    String generoMusical) {
        super(codigo, precoVenda, tipoProduto);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }    
        
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String descricao() {
        return( "Nome do Album: " + getNomeAlbum() + "\n" +
                "Banda: " + getBanda() + "\n" +
                "Cantor: " + getCantor()  + "\n" +
                "Genero Musical: " + getGeneroMusical());
    }
    
}
