package aula07.exercicio03;

public class TesteContaBancaria {
    public static void main(String[] args) {
        try {
            ContaBancaria conta1 = new ContaBancaria(1, "123457", "Gabriel");
            System.out.println(conta1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ContaBancaria conta2 = new ContaBancaria(1, "456789", "Gabriel");
            System.out.println(conta2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ContaBancaria conta3 = new ContaBancaria(1, "12", "Gabriel");
            System.out.println(conta3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
