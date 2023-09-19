package Exercicio3;

public class Tributacao {
    interface Tributavel {
        double calculaTributos();
    }

    abstract class Conta {
        protected double saldo;

        public void sacar(double valor) {
            saldo -= valor;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public double obterSaldo() {
            return saldo;
        }
    }

    class ContaCorrente extends Conta implements Tributavel {
        @Override
        public double calculaTributos() {
            return saldo * 0.01;
        }
    }

    class ContaPoupanca extends Conta {

    }

    static class SeguroVida implements Tributavel {
        @Override
        public double calculaTributos() {
            return 42.0;
        }
    }

    static class GerenciadorDeImpostoDeRenda {
        private double totalTributos;

        public void adicionar(Tributavel tributavel) {
            totalTributos += tributavel.calculaTributos();
        }

        public double getTotalTributos() {
            return totalTributos;
        }
    }

    public class TestaTributavel {
        public void main(String[] args) {
            ContaCorrente cc = new ContaCorrente();
            cc.depositar(1000);

            ContaPoupanca cp = new ContaPoupanca();
            cp.depositar(2000);

            SeguroVida sv = new SeguroVida();

            GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
            gerenciador.adicionar(cc);
            gerenciador.adicionar(sv);

            System.out.println("Total de tributos: " + gerenciador.getTotalTributos());
        }
    }
}
