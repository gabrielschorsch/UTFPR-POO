package lista05.ex01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<ContaBancaria>();
    }

    public String criarConta(Cliente cliente) {
        String account = Utils.generateAccountNumber();
        ContaBancaria conta = new ContaBancaria(account, cliente);
        System.out.println("Conta criada com sucesso! Número da conta: " + conta.getNumero());
        this.contas.add(conta);
        return account;
    }

    public void consultarSaldo(String numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numero)) {
                System.out.println("Saldo: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void realizarSaque(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                if (conta.getSaldo() >= valor) {
                    conta.setSaldo(conta.getSaldo() - valor);
                    System.out.println("Saque realizado com sucesso!");
                    return;
                } else {
                    System.out.println("Saldo insuficiente!");
                    return;
                }
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void realizarDeposito(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                conta.setSaldo(conta.getSaldo() + valor);
                System.out.println("Depósito realizado com sucesso!");
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

}
