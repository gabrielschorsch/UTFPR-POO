package aula09.lista03.exercicio04;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + String.format("%.2f",valor) + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + String.format("%.2f", valor));
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + String.format("%.2f", saldo));
    }

    @Override
    public String toString() {
        return "Conta Corrente:" + "\nNúmero: " + numero + "\nAgência: " + agencia;
    }

}
