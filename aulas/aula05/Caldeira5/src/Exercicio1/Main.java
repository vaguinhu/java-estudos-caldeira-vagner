package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Cria um array para armazenar os números inteiros
        int soma = 0; // Variável para armazenar a soma dos números

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt(); // Lê o número digitado pelo usuário e o armazena no array
            soma += numeros[i]; // Adiciona o número à soma total
        }

        double media = (double) soma / numeros.length; // Calcula a média dos números

        System.out.println("Soma dos números: " + soma); // Exibe a soma dos números
        System.out.println("Média dos números: " + media); // Exibe a média dos números

        scanner.close();
    }
}