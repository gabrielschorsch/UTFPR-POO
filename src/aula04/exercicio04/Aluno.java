package aula04.exercicio04;

public class Aluno {
	private String ra;

	private String nome;
	private String curso;
	private String turno;
	private int periodo;
	private double coeficiente;
	private String situacao;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}

	public void imprimirRelatorio() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Informações do aluno: \n" + 
				"RA: " + this.ra + 
				"\nNome: " + this.nome + 
				"\nCurso: " + this.curso +
				"\nTurno: " + this.turno +
				"\nPeriodo: " + this.periodo + 
				"\nCoeficiente: " + String.format("%.3f", this.coeficiente)  + 
				"\nSituação: " + this.situacao
				;
	}
}