package br.edu.up.modelo;

import java.util.List;

public class Servico {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

    public servico(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco; 
    }

    public int getID() {
        return id;
}

    

}
