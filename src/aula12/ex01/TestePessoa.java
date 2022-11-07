package aula12.ex01;

public class TestePessoa {
    public static void main(String[] args) {
        Aluno a = new Aluno("João", 20, "Engenharia de Software");
        a.realizarMatricula();
        Professor p = new Professor("Maria", 30, 1000);
        p.calcularSalario();
    }
}
