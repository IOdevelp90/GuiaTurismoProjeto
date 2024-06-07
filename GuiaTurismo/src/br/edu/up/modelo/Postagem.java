package br.edu.up.modelo;

public class Postagem {
    private String titulo;
    private String conteudo;
    public Postagem(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    @Override
    public String toString() {
        return "Postagem [titulo=" + titulo + ", conteudo=" + conteudo + "]";
    }
    
    

}
