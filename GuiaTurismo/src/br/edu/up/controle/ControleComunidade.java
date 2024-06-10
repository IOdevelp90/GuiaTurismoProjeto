package br.edu.up.controle;

import br.edu.up.modelo.Postagem;
import br.edu.up.modelo.Avaliacao;
import java.util.ArrayList;
import java.util.List;

public class ControleComunidade {
    private List<Postagem> postagens;
    private List<Avaliacao> avaliacoes;

    public ControleComunidade() {
        this.postagens = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarPostagem(String titulo, String conteudo) {
        Postagem novaPostagem = new Postagem(titulo, conteudo);
        postagens.add(novaPostagem);
    }

    public void adicionarAvaliacao(String titulo, String conteudo, int nota) {
        Avaliacao novaAvaliacao = new Avaliacao(titulo, conteudo, nota);
        avaliacoes.add(novaAvaliacao);
    }

}
