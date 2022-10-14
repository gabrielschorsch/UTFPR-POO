package exercicio01;

public class Funcionario {
    private int numeroRegistro;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;

    private Endereco endereco;
    


    public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
            String telefone, Endereco endereco) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void emitirRelalorio() {
        System.out.println("Relatório do funcionário");
        System.out.println(this);
    }



    public int getNumeroRegistro() {
        return numeroRegistro;
    }



    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public String getSetor() {
        return setor;
    }



    public void setSetor(String setor) {
        this.setor = setor;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
                + ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone + ", endereco=" + endereco + "]";
    }
}
