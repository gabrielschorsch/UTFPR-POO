package aula09.lista03.exercicio02;

public class TesteDisciplina {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("INF011", "Programação Orientada a Objetos", Modalidade.PRESENCIAL, 80, "Introdução a POO\nHerança\nPolimorfismo\nEncapsulamento\n");
        System.out.println(disciplina);
    }
}
