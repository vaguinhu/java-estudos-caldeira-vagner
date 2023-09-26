package Exercicio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Reserva> listaReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reservarPassagem(listaReservas, scanner);
                    break;
                case 2:
                    cancelarReserva(listaReservas, scanner);
                    break;
                case 3:
                    exibirListaReservas(listaReservas);
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

    public static void reservarPassagem(LinkedList<Reserva> listaReservas, Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o nome do passageiro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o local de destino: ");
        String local = scanner.nextLine();

        System.out.print("Digite o CPF do passageiro: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a data de entrada: ");
        String dataEntrada = scanner.nextLine();

        System.out.print("Digite a data de saída: ");
        String dataSaida = scanner.nextLine();

        Reserva reserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
        listaReservas.add(reserva);

        System.out.println("Passagem reservada com sucesso!");
    }

    public static void cancelarReserva(LinkedList<Reserva> listaReservas, Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o CPF do passageiro da reserva a ser cancelada: ");
        String cpf = scanner.nextLine();

        boolean reservaEncontrada = false;

        for (Reserva reserva : listaReservas) {
            if (reserva.getCpf().equals(cpf)) {
                listaReservas.remove(reserva);
                reservaEncontrada = true;
                System.out.println("Reserva cancelada com sucesso!");
                break;
            }
        }

        if (!reservaEncontrada) {
            System.out.println("Reserva não encontrada. Verifique o CPF e tente novamente.");
        }
    }

    public static void exibirListaReservas(LinkedList<Reserva> listaReservas) {
        if (listaReservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            for (Reserva reserva : listaReservas) {
                System.out.println(reserva.toString());
            }
        }
    }
}

class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nLocal de destino: " + local +
                "\nCPF: " + cpf +
                "\nData de entrada: " + dataEntrada +
                "\nData de saída: " + dataSaida +
                "\n";
    }
}