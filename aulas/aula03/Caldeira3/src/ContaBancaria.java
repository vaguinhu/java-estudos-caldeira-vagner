import java.time.LocalDateTime;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalDateTime.now();
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void pix(double valor) {
        if (saldo >= valor && isHorarioPermitido()) {
            saldo -= valor;
            System.out.println("Transferência PIX de " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Não foi possível realizar a transferência PIX.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (saldo >= valor && isHorarioPermitido()) {
            saldo -= valor;
            destino.deposito(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso para a conta de " + destino.getNome());
        } else {
            System.out.println("Não foi possível realizar a transferência para a conta de " + destino.getNome());
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual);
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        verificarSaldo();
        verificarHorario();
    }

    private boolean isHorarioPermitido() {
        int hora = horarioAtual.getHour();
        return hora >= 8 && hora <= 19;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(String identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(LocalDateTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }
}
