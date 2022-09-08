package aula05.exercicio02;

class Pessoa {
    String nome;
    Sexo sexo;
    String cpf;
    int idade;
    double peso;


    void andar(){
        System.out.println(this.nome + " está andando.");
    }

    void correr(){
        System.out.println(this.nome + " está correndo.");
    }

    void falar(){
        System.out.println(this.nome + " está falando.");
    }

    void dormir(){
        System.out.println(this.nome + " está dormindo.");
    }
}
