package aula12.ex02;

public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno(String nome, int idade, String curso, Endereco endereco) {
        super(nome, idade,endereco);
        this.curso = curso;
    }

    public void realizarMatricula() {
        System.out.println("Matrícula realizada no curso " + curso);
    }
}
