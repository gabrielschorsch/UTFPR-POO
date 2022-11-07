package lista05.ex01;

public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("João", "123456789");
        String numeroConta = banco.criarConta(cliente);
        banco.consultarSaldo(numeroConta);
        banco.realizarDeposito(numeroConta, 100);
        banco.consultarSaldo(numeroConta);
        banco.realizarSaque(numeroConta, 50);
        banco.consultarSaldo(numeroConta);
        banco.realizarSaque(numeroConta, 100);
        
    }
}
