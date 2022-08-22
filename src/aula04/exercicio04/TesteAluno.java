package aula04.exercicio04;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setRa("2386704");
		aluno.setCurso("Bacharel em Ciencias da Computaria");
		aluno.setPeriodo(4);
		aluno.setTurno("Integral");
		aluno.setCoeficiente(.55);
		aluno.setNome("Gabriel Schorsch");
		aluno.setSituacao("Regular");
		aluno.imprimirRelatorio();
		
	}
}
