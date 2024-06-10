package br.edu.up.controle;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelo.Cliente;

public class ControleDeCliente {

    List<Cliente> clientes = new ArrayList<>();

    public ControleDeCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void adicionarCliente(){
        Cliente cliente=new Cliente(null, null, null, null);
        clientes.add(cliente);
    }

    
 

}
