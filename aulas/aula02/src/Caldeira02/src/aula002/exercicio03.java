

package aula002;
import java.util.Scanner;
public class exercicio03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo ao sistema de filas prioritárias!");

            // Solicitar ao usuário que selecione sua condição
            System.out.println("Selecione sua condição:");
            System.out.println("1 - Gestante");
            System.out.println("2 - Idosa");
            System.out.println("3 - Pessoa com Deficiência (PCD)");
            System.out.println("4 - Nenhuma das alternativas");
            System.out.print("Digite o número correspondente à sua condição: ");

            int escolha = scanner.nextInt();

            // Verificar a escolha do usuário e determinar o direito à fila prioritária
            switch (escolha) {
                case 1 -> System.out.println("Você tem direito à fila prioritária por ser Gestante.");
                case 2 -> System.out.println("Você tem direito à fila prioritária por ser Idosa.");
                case 3 ->
                        System.out.println("Você tem direito à fila prioritária por ser Pessoa com Deficiência (PCD).");
                case 4 -> System.out.println("Você não tem direito à fila prioritária.");
                default -> {
                }
            }
        }
}