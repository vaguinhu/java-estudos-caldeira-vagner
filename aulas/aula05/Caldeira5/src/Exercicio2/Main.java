package Exercicio2;

    import java.util.Random;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] numeros = gerarArrayAleatorio(10, 1, 100); // Gera um array de 10 números inteiros aleatórios entre 1 e 100

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            boolean encontrado = false;

            // Verifica se o número está presente no array
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numero) {
                    encontrado = true;
                    break;
                }
            }

            // Exibe a mensagem indicando se o número foi encontrado ou não
            if (encontrado) {
                System.out.println("O número " + numero + " está presente no array.");
            } else {
                System.out.println("O número " + numero + " não está presente no array.");
            }

            scanner.close();
        }

        // Método para gerar um array de números inteiros aleatórios
        public static int[] gerarArrayAleatorio(int tamanho, int minimo, int maximo) {
            int[] array = new int[tamanho];
            Random random = new Random();

            for (int i = 0; i < tamanho; i++) {
                array[i] = random.nextInt(maximo - minimo + 1) + minimo;
            }

            return array;
        }
    }

