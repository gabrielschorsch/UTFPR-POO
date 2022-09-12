package aula07.exercicio02;


public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO, "1234567890");
        Pessoa pessoa2 = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO,"0987654321");
        Pessoa pessoa3 = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO,"1234509876");
        System.out.println(pessoa);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
