package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;


import br.edu.up.modelo.Avaliacao;
import br.edu.up.modelo.Postagem;

public class ControleDeComunidade {
    private List<Postagem> postagems=new ArrayList<>();
    private List<Avaliacao> avaliacoes=new ArrayList<>();

    public ControleDeComunidade(List<Postagem> postagems, List<Avaliacao>avaliacoes) {
        this.postagems = postagems;
        this.avaliacoes = avaliacoes;
    }
    public void adicionarPostagem(){
        Postagem postagem= new Postagem(null, null);
        postagems.add(postagem);
    }
    public void adicionarAvaliacao(){
        Avaliacao avaliacao= new Avaliacao(null, null, 0);
        avaliacoes.add(avaliacao);
    }
}
