package aula002;

import java.util.Scanner;

public class exercicio01 {
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o número inicial do intervalo: ");
            int start = scanner.nextInt();

            System.out.print("Informe o número final do intervalo: ");
            int end = scanner.nextInt();

            System.out.println("Números primos no intervalo de " + start + " a " + end + ":");

            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.println(num);
                }
            }
        }
    }

