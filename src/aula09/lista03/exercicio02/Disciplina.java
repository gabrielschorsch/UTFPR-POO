package aula09.lista03.exercicio02;

public class Disciplina {
    private String codigo;
    private String nome;
    private Modalidade modalidade;
    private int cargaHoraria;
    private String conteudo;

    public Disciplina(String codigo, String nome, Modalidade modalidade,
            int cargaHoraria, String conteudo) {
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.conteudo = conteudo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina: " + nome + "\n");
        sb.append("Código: " + codigo + "\n");
        sb.append("Modalidade: " + modalidade.toString().charAt(0) + modalidade.toString().substring(1).toLowerCase() + "\n");
        sb.append("Carga Horária: " + cargaHoraria + " horas\n");
        sb.append("Conteúdo: \n" + getConteudo() + "\n");
        return sb.toString();
    }
}
