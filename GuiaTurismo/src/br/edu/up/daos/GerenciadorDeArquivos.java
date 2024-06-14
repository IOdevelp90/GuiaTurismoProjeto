package br.edu.up.daos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.edu.up.modelo.Cliente;

public class GerenciadorDeArquivos {

    public static void salvarClientesParaArquivo(String nomeDoArquivo, List<Cliente> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeDoArquivo))) {
            for (Cliente cliente : clientes) {
                writer.write(cliente.toCSV());
                writer.newLine();
            }
            System.out.println("Clientes salvos com sucesso em " + nomeDoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar clientes em arquivo: " + e.getMessage());
        }
    }
}
