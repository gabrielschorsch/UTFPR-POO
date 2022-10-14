package exercicio01;

public class TesteFuncionario {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "123", "Centro", "São Paulo", "SP");
        Funcionario f = new Funcionario(0, "Adalberto", "20/02/02", "Masculino", "Vendas", "11111111", endereco);

        f.emitirRelalorio();

    }
}
