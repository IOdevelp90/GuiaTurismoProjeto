package br.edu.up.telas;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CapyturApp {
    int opcao;

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

        boolean sucesso = controleUsuarios.login(username, senha);
        if (sucesso) {
            isAdmin = controleUsuarios.isAdmin(username);
            System.out.println("Login realizado com sucesso!");
            mostrarMenuInicial();
        } else {
            System.out.println("Username ou senha incorretos.");
        }
    }

}
}