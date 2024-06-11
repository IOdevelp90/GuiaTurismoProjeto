package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelo.Cliente;
import br.edu.up.modelo.Profissional;
import br.edu.up.modelo.Servico;

public class ControleDeServicos {

  List<Servico> servicos;
  List<Profissional> profissionais;

  public ControleDeServicos() {
    this.servicos = new ArrayList<>();
    this.profissionais = new ArrayList<>();

  }

  public void adicionarServicos(Servico servico) {
    servicos.add(servico);
  }

  public void contratarProfissional(String nome, String especialidade) {
    Profissional profissional = new Profissional(null, nome, especialidade);
    profissionais.add(profissional);
  }

  public void removerProfissional(Profissional profissional) {
    profissionais.remove(profissional);
  }

  public List<Profissional> gClienteEmpresa() {
    List<Profissional> listaEmpresa = new ArrayList<>();
    for (Profissional profissional : profissionais) {
      if (profissional instanceof Profissional) {
        listaEmpresa.add((Profissional) profissional);
      }
    }
    return listaEmpresa;
  }
}
