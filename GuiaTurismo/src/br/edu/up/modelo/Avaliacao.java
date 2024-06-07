package br.edu.up.modelo;

public class Avaliacao {  
    private String titulo;
    private String conteudo;
    private int nota;

    public Avaliacao(String titulo, String conteudo, int nota) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.nota = nota;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    

}
