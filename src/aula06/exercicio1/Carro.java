package aula06.exercicio1;

class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    private Cores cor;
    private boolean estaLigado;
    private int vel;

    public Carro(String modelo, String marca, int ano, String placa, Cores cor) {
        super();
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.estaLigado = false;
        this.vel = 0;
    }

    void ligar() {
        if (this.estaLigado) {
            System.out.println(this.marca + " " + this.modelo + " já está ligado");
        } else {
            this.estaLigado = true;
            System.out.println(this.marca + " " + this.modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (this.estaLigado) {
            this.estaLigado = false;
            this.vel = 0;
            System.out.println(this.marca + " " + this.modelo + " foi desligado.");
        } else {
            this.estaLigado = true;
            System.out.println(this.marca + " " + this.modelo + " já está desligado.");
        }
    }

    void acelerar() {
        if (this.estaLigado) {
            this.vel += 10;
            System.out.println(this.marca + " " + this.modelo + " acelerou.\nVelocidade atual:" + this.vel);
        } else {
            System.out.println(this.marca + " " + this.modelo + " não pode acelerar pois está desligado.");
        }
    }

    void frear() {
        if (this.estaLigado) {
            this.vel -= 10;
            System.out.println(this.marca + " " + this.modelo + " freou.\nVelocidade atual:" + this.vel);
        } else {
            System.out.println(this.marca + " " + this.modelo + " não pode frear pois está desligado.");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.marca).append(" ").append(this.modelo).append("\n");
        s.append("Placa: ").append(this.placa).append("\n");
        s.append("Ano: ").append(this.ano).append("\n");
        s.append("Cor: ").append(this.cor.toString().charAt(0)).append(this.cor.toString().substring(1).toLowerCase()).append("\n");
        s.append(this.estaLigado ? "" : "Não ").append((this.estaLigado ? "E" : "e") + "stá ligado").append("\n");
        if (this.estaLigado) {
            s.append("Velocidade atual: " + this.vel).append("\n");
        }
        return s.toString();
    }
}