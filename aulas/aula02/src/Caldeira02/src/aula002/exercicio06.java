package aula002;
import java.util.Scanner;
public class exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        StringBuilder textoInvertido = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));

        }
        System.out.println("Texto invertido: " + textoInvertido);
    }
}




