package aula05.exercicio04;

public class Livro {
    String titulo;
    String autor;
    String editora;
    int numeroPaginas;
    int anoPublicacao;
    boolean estaDisponivel = true;

    void emprestar(){
        if(estaDisponivel){
            estaDisponivel = false;
            System.out.println("Livro foi emprestado!");
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    void devolver(){
        if(!estaDisponivel){
            estaDisponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro não pode ser devolvido pois já está disponível.");
        }
    }

    void mostrarRelatorio () {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.titulo + ", " +  this.autor + ", " + this.editora + ", " 
        + this.numeroPaginas + " páginas, " + this.anoPublicacao + ", " + 
        (estaDisponivel ? "disponível para impréstimo." : "indisponível para impréstivmo");
    }
}
