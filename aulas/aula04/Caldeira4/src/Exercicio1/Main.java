package Exercicio1;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularCustoViagem(int distancia);
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.20;
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.15;
    }
    public static class Polimorfismo {
        public static void main(String[] args) {
            Carro carro = new Carro("Ford", "Fiesta", 2020);
            double custoCarro = carro.calcularCustoViagem(150);
            System.out.println("Custo da viagem de carro: R$" + custoCarro);

            Moto moto = new Moto("Honda", "CG", 2021);
            double custoMoto = moto.calcularCustoViagem(100);
            System.out.println("Custo da viagem de moto: R$" + custoMoto);
        }
    }

}