package Exercicio5;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Impressao> filaImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar documento à fila de impressão");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarDocumento(filaImpressao, scanner);
                    break;
                case 2:
                    imprimirDocumento(filaImpressao);
                    break;
                case 3:
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

    public static void adicionarDocumento(LinkedList<Impressao> filaImpressao, Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o nome do documento: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de páginas do documento: ");
        int numeroPaginas = scanner.nextInt();

        Impressao documento = new Impressao(nome, numeroPaginas);
        filaImpressao.add(documento);

        System.out.println("Documento adicionado à fila de impressão com sucesso!");
    }

    public static void imprimirDocumento(LinkedList<Impressao> filaImpressao) {
        if (filaImpressao.isEmpty()) {
            System.out.println("Nenhum documento na fila de impressão.");
        } else {
            Impressao documento = filaImpressao.removeFirst();
            System.out.println("Imprimindo documento: " + documento.getNome());
            System.out.println("Número de páginas: " + documento.getNumeroPaginas());
            System.out.println("Documento impresso com sucesso!");
        }
    }
}

class Impressao {
    private String nome;
    private int numeroPaginas;

    public Impressao(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}