package aula07.exercicio01;


public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO);
        Pessoa pessoa2 = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO);
        Pessoa pessoa3 = new Pessoa("a","12/09/2022","119952041331","a@email.com",EstadoCivil.SOLTEIRO);
        System.out.println(pessoa);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
