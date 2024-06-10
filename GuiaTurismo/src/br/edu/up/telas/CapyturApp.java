package br.edu.up.telas;

import br.edu.up.controle.ControleClientes;
import br.edu.up.controle.ControleComunidade;
import br.edu.up.modelo.Servico;

import java.util.List;
import java.util.Scanner;

public class CapyturApp {

    int opcao;

    ControleComunidade controleComunidade = new ControleComunidade();

    ControleClientes controleClientes = new ControleClientes();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("       Bem-vindo ao Capytur!     ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Login");
            System.out.println("2 - Registrar");
            System.out.println("3 - Sair");
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    login();
                    break;
                case 2:
                    registrar();
                    break;
                case 3:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

    }

    private void login() {

        System.out.println("=================================");
        System.out.println("              Login              ");
        System.out.println("=================================");
        System.out.println("Digite seu username: ");
        String username = scanner.next();

        System.out.println("Digite sua senha: ");
        String senha = scanner.next();

        boolean sucesso = controleClientes.login(username, senha);
        if (sucesso) {
            boolean isAdmin = controleClientes.isAdmin(username);
            System.out.println("Login realizado com sucesso!");
            mostrarMenuInicial(isAdmin);
        } else {
            System.out.println("Username ou senha incorretos.");
        }
    }

    private void registrar() {
        System.out.println("=================================");
        System.out.println("            Registrar            ");
        System.out.println("=================================");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu username: ");
        String username = scanner.next();

        System.out.println("Digite sua senha: ");
        String senha = scanner.next();

        System.out.println("Você deseja registrar como administrador? (S/N): ");
        boolean isAdmin = scanner.next().equalsIgnoreCase("S");

        controleClientes.registrar(nome, username, senha, isAdmin);
        System.out.println("Registro realizado com sucesso!");
    }

    private void mostrarMenuInicial(boolean isAdmin) {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("         Menu Inicial - Capytur  ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Comunidade");
            System.out.println("2 - Procurar Viagens");
            System.out.println("3 - Serviços");
            if (isAdmin) {
                System.out.println("4 - Gerenciar Clientes");
                System.out.println("5 - Gerenciar Profissionais");
                System.out.println("6 - Sair");
            } else {
                System.out.println("6 - Sair");
            }
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mostrarComunidade();
                    break;
                case 2:
                    procurarViagens();
                    break;
                case 3:
                    mostrarServicos();
                    break;
                case 4:
                    if (isAdmin) {
                        gerenciarClientes();
                    } else {
                        System.out.println("Até mais!");
                        opcao = 6;
                    }
                    break;
                case 5:
                    if (isAdmin) {
                        gerenciarProfissionais();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 6:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);
    }

    private void mostrarComunidade() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("        Comunidade - Capytur     ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Adicionar Postagem");
            System.out.println("2 - Adicionar Avaliação");
            System.out.println("3 - Voltar ao Menu Inicial");
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPostagem();
                    break;
                case 2:
                    adicionarAvaliacao();
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Inicial...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);
    }

    private void adicionarPostagem() {
        System.out.println("=================================");
        System.out.println("       Adicionar Postagem        ");
        System.out.println("=================================");
        System.out.println("Digite o título da postagem: ");
        String titulo = scanner.next();

        System.out.println("Digite o conteúdo da postagem: ");
        String conteudo = scanner.next();

        controleComunidade.adicionarPostagem(titulo, conteudo);
        System.out.println("Postagem adicionada com sucesso!");
    }

    private void adicionarAvaliacao() {
        System.out.println("=================================");
        System.out.println("       Adicionar Avaliação       ");
        System.out.println("=================================");
        System.out.println("Digite o título da avaliação: ");
        String titulo = scanner.next();

        System.out.println("Digite o conteúdo da avaliação: ");
        String conteudo = scanner.next();

        System.out.println("Digite a nota (0-5): ");
        int nota = scanner.nextInt();

        controleComunidade.adicionarAvaliacao(titulo, conteudo, nota);
        System.out.println("Avaliação adicionada com sucesso!");
    }

    private void procurarViagens() {
        System.out.println("=================================");
        System.out.println("       Procurar Viagens          ");
        System.out.println("=================================");
        System.out.println("Procurar Viagens - Em construção...");
    }

    private void mostrarServicos() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("          Serviços - Capytur     ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Contratar Guia de Turismo");
            System.out.println("2 - Contratar Professor");
            System.out.println("3 - Contratar Fotógrafo");
            System.out.println("4 - Voltar ao Menu Inicial");
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contratarGuia();
                    break;
                case 2:
                    contratarProfessor();
                    break;
                case 3:
                    contratarFotografo();
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Inicial...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }

    private void contratarGuia() {
        System.out.println("=================================");
        System.out.println("      Contratar Guia de Turismo  ");
        System.out.println("=================================");
        System.out.println("Digite o nome do guia: ");
        String nome = scanner.next();

        System.out.println("Digite a especialidade do guia: ");
        String especialidade = scanner.next();

        controleServicos.contratarProfissional("Guia de Turismo", nome, especialidade);
        System.out.println("Guia de Turismo contratado com sucesso!");
    }

    private void contratarProfessor() {
        System.out.println("=================================");
        System.out.println("       Contratar Professor       ");
        System.out.println("=================================");
        System.out.println("Digite o nome do professor: ");
        String nome = scanner.next();

        System.out.println("Digite a especialidade do professor: ");
        String materia = scanner.next();

        controleServicos.contratarProfissional("Professor", nome, materia);
        System.out.println("Professor contratado com sucesso!");
    }

    private void contratarFotografo() {
        System.out.println("=================================");
        System.out.println("       Contratar Fotógrafo       ");
        System.out.println("=================================");
        System.out.println("Digite o nome do fotógrafo: ");
        String nome = scanner.next();

        System.out.println("Digite a especialidade do fotógrafo: ");
        String especialidade = scanner.next();

        controleServicos.contratarProfissional("Fotógrafo", nome, especialidade);
        System.out.println("Fotógrafo contratado com sucesso!");
    }

    private void gerenciarClientes() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("       Gerenciar Usuários        ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Adicionar Usuário");
            System.out.println("2 - Remover Usuário");
            System.out.println("3 - Listar Usuários");
            System.out.println("4 - Voltar ao Menu Inicial");
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarUsuario();
                    break;
                case 2:
                    removerUsuario();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Inicial...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }

    private void adicionarUsuario() {
        System.out.println("=================================");
        System.out.println("       Adicionar Usuário         ");
        System.out.println("=================================");
        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.next();

        System.out.println("Digite o username do usuário: ");
        String username = scanner.next();

        System.out.println("Digite a senha do usuário: ");
        String senha = scanner.next();

        System.out.println("O usuário é um administrador? (S/N): ");
        boolean isAdmin = scanner.next().equalsIgnoreCase("S");

        controleUsuarios.registrar(nome, username, senha, isAdmin);
        System.out.println("Usuário adicionado com sucesso!");
    }

    private void removerUsuario() {
        System.out.println("=================================");
        System.out.println("       Remover Usuário           ");
        System.out.println("=================================");
        System.out.println("Digite o username do usuário a ser removido: ");
        String username = scanner.next();

        controleUsuarios.removerUsuario(username);
        System.out.println("Usuário removido com sucesso!");
    }

    private void listarUsuarios() {
        System.out.println("=================================");
        System.out.println("         Listar Usuários         ");
        System.out.println("=================================");
        System.out.println("Usuários registrados: ");
        for (String username : controleUsuarios.listarUsuarios()) {
            System.out.println(username);
        }
    }

private void gerenciarProfissionais() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("=================================");
            System.out.println("   Gerenciar Profissionais       ");
            System.out.println("=================================");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Adicionar Profissional");
            System.out.println("2 - Editar Profissional");
            System.out.println("3 - Remover Profissional");
            System.out.println("4 - Listar Profissionais");
            System.out.println("5 - Voltar ao Menu Inicial");
            System.out.println("=================================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contratarProfissional();
                    break;
                case 2:
                    editarProfissional();
                    break;
                case 3:
                    removerProfissional();
                    break;
                case 4:
                    listarProfissionais();
                    break;
                case 5:
                    System.out.println("Voltando ao Menu Inicial...");
                    break
                    default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }

    private void listarProfissionais() {
        System.out.println("=================================");
        System.out.println("   Lista de Profissionais        ");
        System.out.println("=================================");
        System.out.println("Profissionais registrados: ");
        List<String> profissionais = controleServicos.listarProfissionais();
        if (profissionais.isEmpty()) {
            System.out.println("Nenhum profissional registrado.");
        } else {
            for (String profissional : profissionais) {
                System.out.println(profissional);
            }
        }
    }

    private void contratarProfissional() {
        System.out.println("=================================");
        System.out.println("    Adicionar Profissional       ");
        System.out.println("=================================");
        System.out.println("Digite o tipo do profissional: ");
        String tipo = scanner.next();

        System.out.println("Digite o nome do profissional: ");
        String nome = scanner.next();

        System.out.println("Digite a especialidade do profissional: ");
        String especialidade = scanner.next();

        controleServicos.contratarProfissional(tipo, nome, especialidade);
        System.out.println("Profissional adicionado com sucesso!");
    }

    private void editarProfissional() {
        System.out.println("=================================");
        System.out.println("      Editar Profissional        ");
        System.out.println("=================================");
        System.out.println("Digite o índice do profissional a ser editado: ");
        int index = scanner.nextInt();

        System.out.println("Digite o novo tipo do profissional: ");
        String tipo = scanner.next();

        System.out.println("Digite o novo nome do profissional: ");
        String nome = scanner.next();

        System.out.println("Digite a nova especialidade do profissional: ");
        String especialidade = scanner.next();

        controleServicos.editarProfissional(index, tipo, nome, especialidade);
        System.out.println("Profissional editado com sucesso!");
    }

    private void removerProfissional() {
        System.out.println("=================================");
        System.out.println("     Remover Profissional        ");
        System.out.println("=================================");
        System.out.println("Digite o índice do profissional a ser removido: ");
        int index = scanner.nextInt();

        controleServicos.removerProfissional(index);
        System.out.println("Profissional removido com sucesso!");
    }

    public static void main(String[] args) {
        CapyturApp app = new CapyturApp();
        app.iniciar();
    }

}
