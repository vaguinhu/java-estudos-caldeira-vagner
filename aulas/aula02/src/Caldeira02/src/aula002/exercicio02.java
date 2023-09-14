package aula002;

import java.util.Scanner;

public class exercicio02 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe seu salário: ");
            double salario = scanner.nextDouble();

            if (idade >= 18 && salario > 2000) {
                System.out.println("Parabéns! Você pode comprar um automóvel.");
            } else {
                System.out.println("Desculpe, você não pode comprar um automóvel.");
            }
        }
}
