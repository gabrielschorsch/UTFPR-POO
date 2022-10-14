package aula11.exercicio03;

public enum UnidadeFederativa {
    SAO_PAULO("São Paulo", "SP", "São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
    ESPIRITO_SANTO("Espirito Santo", "ES", "Vitória"),
    PARANA("Paraná", "PR", "Curitiba"),
    SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre");

    private String nome;
    private String sigla;
    private String capital;

    private UnidadeFederativa(String nome, String sigla, String capital) {
        this.capital = capital;
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public String getCapital(){
        return this.capital;
    }
}
