package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

    import java.util.ArrayList;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir todas as tarefas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarTarefa(listaTarefas, scanner);
                    break;
                case 2:
                    removerTarefa(listaTarefas, scanner);
                    break;
                case 3:
                    exibirTarefas(listaTarefas);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void adicionarTarefa(ArrayList<Tarefa> listaTarefas, Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o título da tarefa: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite a data da tarefa: ");
        String data = scanner.nextLine();

        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        Tarefa tarefa = new Tarefa(titulo, data, descricao);
        listaTarefas.add(tarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void removerTarefa(ArrayList<Tarefa> listaTarefas, Scanner scanner) {
        System.out.print("Digite o índice da tarefa a ser removida: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaTarefas.size()) {
            listaTarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }

    public static void exibirTarefas(ArrayList<Tarefa> listaTarefas) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < listaTarefas.size(); i++) {
                Tarefa tarefa = listaTarefas.get(i);
                System.out.println("Tarefa " + i);
                System.out.println("Título: " + tarefa.getTitulo());
                System.out.println("Data: " + tarefa.getData());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("--------------------");
            }
        }
    }
}

class Tarefa {
    private String titulo;
    private String data;
    private String descricao;

    public Tarefa(String titulo, String data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}