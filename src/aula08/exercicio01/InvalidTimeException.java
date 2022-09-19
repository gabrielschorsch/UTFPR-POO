package aula08.exercicio01;

public class InvalidTimeException extends Exception{
    public InvalidTimeException(){
        super("Horário inserido não é válido");
    }

    public InvalidTimeException(String customMessage){
        super(customMessage);
    }
}
