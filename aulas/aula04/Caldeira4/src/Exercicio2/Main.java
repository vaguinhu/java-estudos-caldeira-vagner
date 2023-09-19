package Exercicio2;

import java.util.ArrayList;
import java.util.List;

abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Losango extends FormaGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 3));
        formas.add(new Circulo(4));
        formas.add(new Triangulo(6, 8));
        formas.add(new Quadrado(7));
        formas.add(new Losango(5, 6));

        for (FormaGeometrica forma : formas) {
            double area = forma.calcularArea();
            System.out.println("Área da forma geométrica: " + area);
        }
    }
}
