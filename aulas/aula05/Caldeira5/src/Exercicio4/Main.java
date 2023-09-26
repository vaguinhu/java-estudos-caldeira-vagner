package Exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compra> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar item à lista");
            System.out.println("2. Remover item da lista");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarItem(listaCompras, scanner);
                    break;
                case 2:
                    removerItem(listaCompras, scanner);
                    break;
                case 3:
                    exibirLista(listaCompras);
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

    public static void adicionarItem(ArrayList<Compra> listaCompras, Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de validade do item: ");
        String dataValidade = scanner.nextLine();

        Compra item = new Compra(nome, dataValidade);
        listaCompras.add(item);

        System.out.println("Item adicionado à lista de compras com sucesso!");
    }

    public static void removerItem(ArrayList<Compra> listaCompras, Scanner scanner) {
        System.out.print("Digite o índice do item a ser removido: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaCompras.size()) {
            listaCompras.remove(indice);
            System.out.println("Item removido da lista de compras com sucesso!");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }

    public static void exibirLista(ArrayList<Compra> listaCompras) {
        if (listaCompras.isEmpty()) {
            System.out.println("Nenhum item na lista de compras.");
        } else {
            for (int i = 0; i < listaCompras.size(); i++) {
                Compra item = listaCompras.get(i);
                System.out.println("Item " + i);
                System.out.println("Nome: " + item.getNome());
                System.out.println("Data de Validade: " + item.getDataValidade());
                System.out.println("--------------------");
            }
        }
    }
}

class Compra {
    private String nome;
    private String dataValidade;

    public Compra(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
