package aula11.exercicio03;

public class Empresa {
    String razaoSocial;
    String cnpj;
    UnidadeFederativa uf;

    public Empresa(String razaoSocial, String cnpj, UnidadeFederativa uf){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.uf = uf;
    }
}
