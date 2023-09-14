package aula002;
import java.util.Scanner;
public class exercicio07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int soldadosInimigos = 300000;
            int palpite;

            System.out.println("Leônidas: Vocês sabem quantos soldados inimigos iremos enfrentar?");
            System.out.print("Soldado: Digite o seu palpite: ");
            palpite = scanner.nextInt();

            while (palpite != soldadosInimigos) {
                if (palpite < soldadosInimigos) {
                    System.out.println("Leônidas: Um pouco mais!");
                } else {
                    System.out.println("Leônidas: Um pouco menos!");
                }

                System.out.print("Soldado: Digite o seu palpite: ");
                palpite = scanner.nextInt();
            }

            System.out.println("Leônidas: Parabéns! Você acertou. Enfrentaremos " + soldadosInimigos + " soldados inimigos.");
            System.out.println("Soldado: Cê tem para de de arrumar essas confusão aí Leonidas!");
        }
    }

