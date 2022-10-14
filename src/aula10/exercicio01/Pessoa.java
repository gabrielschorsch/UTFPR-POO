package aula10.exercicio01;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String email;
    private Endereco endereco;
    private EstadoCivil estadoCivil;
    
    public Pessoa(String nome,String dataNascimento,String sexo,String email, Endereco endereco, EstadoCivil estadoCivil){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa:"+this.nome+", "+",Data Nascimento: "+this.dataNascimento
        +", Sexo: " + this.sexo + ",E-mail: " + this.email + 
        ",EstadoCivil: " + this.estadoCivil;
    }
}