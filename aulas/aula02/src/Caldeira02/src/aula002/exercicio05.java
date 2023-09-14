package aula002;
import java.util.Scanner;
public class exercicio05 {

        public static void main(String[] args) {
            //linha de codigo teste

            String texto1 = "abcdefghi";

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma string: ");
            //leitura do texto do usuario
            String texto2 = scanner.nextLine();


            //varia para a divisão do texto que o usuario digitou
            int metade = texto2.length() / 2;
            String primeiraParte = texto2.substring(0, metade);

            System.out.println("Primeira parte da string: " + primeiraParte);
        }
    }
