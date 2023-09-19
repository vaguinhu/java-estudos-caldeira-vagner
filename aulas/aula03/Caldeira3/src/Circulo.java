import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
        }
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
        }
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public boolean compararCirculo(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }

    public double calcularAreaSombreada(Circulo outroCirculo) {
        if (this.compararCirculo(outroCirculo)) {
            System.out.println("Os círculos são iguais, não há área sombreada.");
            return 0;
        } else {
            double area1 = this.calcularArea();
            double area2 = outroCirculo.calcularArea();
            return Math.abs(area1 - area2);
        }
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Círculo - Raio: " + raio + ", Área: " + df.format(calcularArea()) + ", Circunferência: " + df.format(calcularCircunferencia());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo 1: ");
        double raio1 = scanner.nextDouble();
        Circulo circulo1 = new Circulo(raio1);

        System.out.print("Digite o raio do círculo 2: ");
        double raio2 = scanner.nextDouble();
        Circulo circulo2 = new Circulo(raio2);

        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());

        System.out.print("Digite o novo raio do círculo 1: ");
        double novoRaio1 = scanner.nextDouble();
        circulo1.definirRaio(novoRaio1);
        System.out.println("Novo raio do circulo1: " + circulo1.raio);

        System.out.println("Área do circulo1: " + circulo1.calcularArea());
        System.out.println("Circunferência do circulo1: " + circulo1.calcularCircunferencia());

        System.out.println("Diâmetro do circulo2: " + circulo2.calcularDiametro());

        System.out.println("Comparação entre circulo1 e circulo2: " + circulo1.compararCirculo(circulo2));

        System.out.println("Área sombreada entre circulo1 e circulo2: " + circulo1.calcularAreaSombreada(circulo2));

        scanner.close();
    }
}