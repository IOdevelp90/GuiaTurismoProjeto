package br.edu.up.controle;

    import java.util.ArrayList;
    import java.util.List;
    import br.edu.up.modelo.Servico;
    
public class ControleDeServicos {

      List<Servico>servicos = new ArrayList<>();

      public ControleDeServicos(List<Servico> servicos) {
        this.servicos = servicos;
    
      }
    
      public void adicionarServicos(){
        Servico servico = new Servico(null, null, 0);
        servicos.add(servico);
      }
      // atualizacoes
    
}
    
    

