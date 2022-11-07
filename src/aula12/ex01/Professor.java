package aula12.ex01;

public class Professor extends Pessoa {

    private int salario;

    public Professor(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }
    
    public void calcularSalario() {
        System.out.println("Salário: " + salario);
    }
    
}
