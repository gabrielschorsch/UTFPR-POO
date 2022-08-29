package aula05.exercicio04;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Como fazer programa, edição limitada";
        livro.autor = "Felipe";   
        livro.editora = "Editora Positivo";
        livro.numeroPaginas = 195;
        livro.anoPublicacao = 2025;
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.devolver();

        livro.mostrarRelatorio();
    }    
}
