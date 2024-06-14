package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelo.Viagem;

public class ControleDeViagem {

    public ControleDeViagem(List<Viagem> viagens) {
        this.viagens = viagens;
    }

    List<Viagem> viagens = new ArrayList<>();

    public void adicionarViagem() {
        Viagem viagem = new Viagem("Destino padrão", "Descrição padrão", "Data padrão", "Local padrão");
        viagens.add(viagem);
    }

    public void removerViagem(Viagem viagem) {
        viagens.remove(viagem);
    }

    public List<Viagem> listaViagem() {
        return new ArrayList<>(viagens);
    }

    public List<Viagem> buscarViagemPorLocal(String local) {
        List<Viagem> viagemsEncontrada = new ArrayList<>();
        for (Viagem viagem : viagens) {
            viagemsEncontrada.add(viagem);
        }
        return viagemsEncontrada;
    }

    public List<Viagem> buscarViagemPorData(String data) {
        List<Viagem> viagensEncontrada = new ArrayList<>();
        for (Viagem viagem : viagens) {
            viagensEncontrada.add(viagem);
        }
        return viagensEncontrada;
    }

}
