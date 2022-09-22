package aula09.lista03.exercicio01;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        String s = "";
        s = s.concat(this.rua + ",");
        s = s.concat(this.numero + " - ");
        s = s.concat(this.bairro + " - ");
        s = s.concat(this.cidade + " - ");
        s = s.concat(this.estado + " - ");
        return s;
    }

}
