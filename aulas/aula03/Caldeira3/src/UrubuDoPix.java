public class UrubuDoPix {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Fulano de Tal", "123.456.789-00", "0123456789", "Banco X", "Rua A, 123", 1000.00);

        // Executar métodos da classe ContaBancaria
        conta.verificarInformacoes();
        conta.saque(500.00);
        conta.verificarSaldo();
        conta.pix(200.00);
        conta.transferencia(conta, 300.00);
    }
}