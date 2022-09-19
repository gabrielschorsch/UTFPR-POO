package aula08.exercicio01;

public class Relogio {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public Relogio(String marca, int hora, int minuto) throws InvalidTimeException{
        this.marca = marca;
        setHora(hora);
        setMinuto(minuto);
    }

    private int hora;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws InvalidTimeException{
        if (hora < 0 || hora > 23) {
            throw new InvalidTimeException("A hora inserida não é válida.");
        } else {
            this.hora = hora;
        }
    }

    private int minuto;

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws InvalidTimeException{
        if (minuto < 0 || minuto > 59) {
            throw new InvalidTimeException("O minuto inserido não é válido.");
        } else {
            this.minuto = minuto;
        }
    }

    @Override
    public String toString() {
        String s = "Relógio: \n";
        s += "Marca: " + getMarca() + "\n";
        s += "Horário: " + getHora() + ":" + getMinuto() + "\n";
        return s;
    }

}
