package aula06.exercicio2;

public class Data {
    private int dia;
    private int mes;
    private int ano;    

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int mes, int ano){
        this.dia = 1;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia){
        this.dia = dia;
        this.mes = 1;
        this.ano = 2010;
    }

    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 2010;
    }

    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}
