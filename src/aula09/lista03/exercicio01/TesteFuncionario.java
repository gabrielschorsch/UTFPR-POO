package aula09.lista03.exercicio01;

import java.util.Calendar;

public class TesteFuncionario {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 03, 20);
        Funcionario f = new Funcionario(1, "João", cal.getTime(), Sexo.MASCULINO,
                new Endereco("Rua 1", 1, "Bairro 1", "Cidade 1", "Estado 1"));
        System.out.println(f);
        cal.set(2005, 02, 20);
        Funcionario f2 = new Funcionario(2, "Maria", cal
                .getTime(), Sexo.FEMININO,
                new Endereco("Rua 2", 2, "Bairro 2", "Cidade 2", "Estado 2"));

        System.out.println(f2);
    }
}
