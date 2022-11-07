package aula12.ex02;

public class Professor extends Pessoa {

    private int salario;

    public Professor(String nome, int idade, int salario, Endereco endereco) {
        super(nome, idade,endereco);
        this.salario = salario;
    }
    
    public void calcularSalario() {
        System.out.println("Salário: " + salario);
    }
    
}
