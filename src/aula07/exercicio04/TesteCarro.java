package aula07.exercicio04;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Uno","Fiat",2021,Color.AZUL,"21231212","1221", "ABCCA1231");
        carro.acelerar(50);
        carro.frear(30);
        System.out.println(carro);
    }
}
