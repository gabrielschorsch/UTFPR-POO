package aula07.exercicio02;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Pessoa {
    String nome;
    Date dataNascimento;
    String telefone;
    String email;
    EstadoCivil estadoCivil;
    final String cpf;

    
    private Date getDateTime(String datetime){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            return df.parse(datetime);
        }catch(Exception e){
            return new Date();
        }
    }

    public Pessoa(String nome, String dataNascimento, String telefone, String email, EstadoCivil estadoCivil,String cpf){
        this.nome = nome;
        this.telefone=telefone;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        
        this.dataNascimento = getDateTime(dataNascimento);
    }
}
