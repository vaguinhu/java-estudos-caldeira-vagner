package aula002;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha uma operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0;

            switch (operacao) {
                case '+' -> resultado = num1 + num2;
                case '-' -> resultado = num1 - num2;
                case '*' -> resultado = num1 * num2;
                case '/' -> resultado = num1 / num2;
                default -> System.out.println("Operação inválida.");
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar? (s/n): ");
        } while (scanner.next().charAt(0) != 'n');
    }
}

