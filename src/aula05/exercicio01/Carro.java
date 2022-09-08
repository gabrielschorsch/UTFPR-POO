package aula05.exercicio01;

class Carro {
    String modelo;
    String marca;
    String cor;
    String renavam;
    String chassi;
    String placa;

    void ligar(){
        System.out.println(this.modelo + " está ligando.");
    }

    void desligar(){
        System.out.println(this.modelo + " está desligando.");
    }

    void acelerar(){
        System.out.println(this.modelo + " está acelerando.");
    }

    void frear(){
        System.out.println(this.modelo + " está freando");
    }

    
}