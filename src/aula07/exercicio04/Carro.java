package aula07.exercicio04;

public class Carro {
    String modelo;
    String marca;
    int ano;
    Color color;
    String renavam;
    String chassi;
    String placa;
    private int velocidadeAtual;

    public Carro(String modelo, String marca, int ano, Color color, String renavam, String chassi, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.color = color;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
        velocidadeAtual = 0;
    }
    public void acelerar(int velocidade){
        this.velocidadeAtual +=velocidade;
    }
    
    public void frear(int velocidade){
        this.velocidadeAtual -=velocidade;
    }
    
    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", chassi=" + chassi + ", color=" + color + ", marca=" + marca + ", modelo="
                + modelo + ", placa=" + placa + ", renavam=" + renavam + ", velocidadeAtual=" + velocidadeAtual + "]";
    }
    
}
