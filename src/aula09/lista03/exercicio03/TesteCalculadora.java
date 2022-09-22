package aula09.lista03.exercicio03;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora("HP", "12C", 32, TipoCalculadora.CIENTIFICA);
        c1.somar(2, 3);
        System.out.println(c1);
        c1.dividir(2, 1);
        System.out.println(c1);
        c1.multiplicar(2, 3);
        System.out.println(c1);
        c1.subtrair(2, 3);
        System.out.println(c1);
    }
}
