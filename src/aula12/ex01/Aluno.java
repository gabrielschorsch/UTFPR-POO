package aula12.ex01;

public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void realizarMatricula() {
        System.out.println("Matrícula realizada no curso " + curso);
    }
}
