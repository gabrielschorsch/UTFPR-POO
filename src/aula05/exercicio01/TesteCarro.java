package aula05.exercicio01;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Logan";
        carro1.ligar();
        carro1.acelerar();
        carro1.frear();
        carro1.desligar();
    }
}
