package aula09.lista03.exercicio05;

public class Carro {
    private int velocidade;
    private Marcha marchaAtual;
    private final int LIMITE_VELOCIDADE = 130;

    public Carro() {
        velocidade = 0;
        marchaAtual = Marcha.NEUTRO;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Marcha getMarchaAtual() {
        return marchaAtual;
    }

    private void mudarMarcha() {
        if (this.velocidade == 0) {
            marchaAtual = Marcha.NEUTRO;
        } else if (this.velocidade > 0 && this.velocidade < 20) {
            marchaAtual = Marcha.PRIMEIRA;
        } else if (this.velocidade >= 20 && this.velocidade < 40) {
            marchaAtual = Marcha.SEGUNDA;
        } else if (this.velocidade >= 40 && this.velocidade < 60) {
            marchaAtual = Marcha.TERCEIRA;
        } else if (this.velocidade >= 60 && this.velocidade < 80) {
            marchaAtual = Marcha.QUARTA;
        } else if (this.velocidade >= 80 && this.velocidade < this.LIMITE_VELOCIDADE) {
            marchaAtual = Marcha.QUINTA;
        }
    }

    public void acelerar() {
        this.velocidade += 5;
        if (this.velocidade > LIMITE_VELOCIDADE) {
            System.out.println("Velocidade máxima atingida");
            this.velocidade = LIMITE_VELOCIDADE;
        }
        mudarMarcha();
    }

    public void frear() {
        this.velocidade -= 5;
        if (this.velocidade < 0) {
            System.out.println("Carro parado");
            this.velocidade = 0;
        }
        mudarMarcha();
    }

    @Override
    public String toString() {

        return "Carro: " + "\n" + "Velocidade atual: " + velocidade + "km/h" + " Marcha atual: "
                + "\n"
                + marchaAtual.toString().charAt(0) + marchaAtual.toString().substring(1).toLowerCase()
                + " marcha";
    }
}
