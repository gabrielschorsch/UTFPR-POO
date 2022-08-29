package aula05.exercicio02;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Felipe";
        pessoa.sexo = Sexo.NAO_BINARIO;
        pessoa.andar();
        pessoa.correr();
        pessoa.falar();
        pessoa.dormir();
    }
    
}
