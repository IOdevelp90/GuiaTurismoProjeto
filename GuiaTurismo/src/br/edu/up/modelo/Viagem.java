package br.edu.up.modelo;

public class Viagem {

    private String destino;
    private String descricao;
    private String data;
    private String local;

    public Viagem(String destino, String descricao, String data, String local) {
        this.destino = destino;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Viagem [destino=" + destino + ", descricao=" + descricao + ", data=" + data + ", local=" + local + "]";
    }
}
