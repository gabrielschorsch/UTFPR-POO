package aula12.ex02;

public class TestePessoa {
    public static void main(String[] args) {
        Endereco e = new Endereco("RUa",12,"Bairro","Cidade");
        Aluno a = new Aluno("João", 20, "Engenharia de Software", e);
        a.realizarMatricula();
        Professor p = new Professor("Maria", 30, 1000,e);
        p.calcularSalario();
    }
}
