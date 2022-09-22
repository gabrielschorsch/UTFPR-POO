package aula09.lista03.exercicio01;

import java.text.DateFormat;
import java.util.Date;

public class Funcionario {
    private int numeroRegistro;
    private String nomeCompleto;
    private Date dataNascimento;
    private Sexo sexo;
    private Endereco endereco;

    public Funcionario(int numeroRegistro, String nomeCompleto, Date dataNascimento, Sexo sexo, Endereco endereco) {
        this.numeroRegistro = numeroRegistro;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        String s = "";
        s = s.concat(this.nomeCompleto + ":\n");
        s = s.concat("- Numero de registro: " + this.numeroRegistro + "\n");
        s = s.concat("- Data de Nascimento: " + DateFormat.getDateTimeInstance().format(this.dataNascimento) + "\n");
        s = s.concat(
                "- Sexo: " + this.sexo.toString().charAt(0) + this.sexo.toString().substring(1).toLowerCase() + "\n");
        s = s.concat("- Endereço: \n " + this.endereco + "\n");
        return s;
    }
}
