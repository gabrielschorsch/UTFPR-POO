package lista05.ex01;

public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(String numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0;
        this.cliente = cliente;
    }



    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
