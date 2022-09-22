package aula09.lista03.exercicio04;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 456);
        System.out.println(conta);
        conta.depositar(100);
        conta.sacar(50);
        conta.sacar(100);
        conta.verificarSaldo();
        
    }
}
