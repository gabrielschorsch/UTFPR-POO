package aula06.exercicio1;

public class TesteCarro {
    public static void main(String[] args) {
        Carro uno = new Carro("Uno", "Fiat", 2020, "ABC123", Cores.VERMELHO);
        uno.ligar();
        uno.acelerar();
        uno.acelerar();
        uno.frear();
        System.out.println(uno);
        uno.desligar();

    }
}
