package aula09.lista03.exercicio05;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        for (int i = 0; i < 26; i++) {
            c.acelerar();
            System.out.println(c);
        }

        for (int i = 26; i > 0; i--) {
            c.frear();
            System.out.println(c);
        }
    }
}
