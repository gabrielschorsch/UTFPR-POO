package aula10.exercicio01;

public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, int numero, String bairro, String cidade,String uf){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getUF(){
        return this.uf;
    }

    @Override
    public String toString() {
        return "Endereco:\n"+this.logradouro+","+this.numero
        +" - "+this.bairro+" - "+this.cidade+","+this.uf;
    }
}