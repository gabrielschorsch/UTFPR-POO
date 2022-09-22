package aula09.lista03.exercicio03;

public class Calculadora {
    private String marca;
    private String modelo;
    private int memoriaInterna; // em MB
    private TipoCalculadora tipo;
    private int valorNoVisor;

    public Calculadora(String marca, String modelo, int memoriaInterna, TipoCalculadora tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaInterna = memoriaInterna;
        this.tipo = tipo;
        valorNoVisor = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public TipoCalculadora getTipo() {
        return tipo;
    }

    public void somar(int a, int b) {
        valorNoVisor = a + b;
    }

    public void subtrair(int a, int b) {
        valorNoVisor = a - b;
    }

    public void multiplicar(int a, int b) {
        valorNoVisor = a * b;
    }

    public void dividir(int a, int b) {
        valorNoVisor = a / b;
    }

    @Override
    public String toString() {
        return "Calculadora " + tipo.toString().charAt(0) + tipo.toString().substring(1).toLowerCase() + " " + marca
                + " " + modelo + " com " + memoriaInterna + " MB de memória interna\n" + "Valor atual: " + valorNoVisor;
    }

}
