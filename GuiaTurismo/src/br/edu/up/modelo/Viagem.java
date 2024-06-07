package br.edu.up.modelo;

public class Viagem {

    private String destino;
    private String descricao;
    private String data;

    public Viagem(String destino, String descricao, String data) {
        this.destino = destino;
        this.descricao = descricao;
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Viagem [destino=" + destino + ", descricao=" + descricao + ", data=" + data + "]";
    }

}
