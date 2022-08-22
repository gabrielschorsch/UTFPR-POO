package aula04.exercicio03;

public class Notebook {
	String marca;
	String modelo;
	int tamanhoTela;
	int quantidadeRam; // analyze
	String modeloProcessador;
	int capacidadeArmazenamento; // analyze

	public void ligar() {
		System.out.println("Ligando...");
	}

	public void desligar() {
		System.out.println("Desligando...");
	}

	public void processarInformacoes() {
		System.out.println("Processando informa��es...");
	}

	public void conectarInternet() {
		System.out.println("Conectando-se � internet...");
		System.out.println("Conectado!");
	}

	@Override
	public String toString() {
		return this.marca + " " + this.modelo + "\n" 
				+ "Especifica��es:\n" + "Processador: " + this.modeloProcessador + 
				"\nMem�ria RAM: " + this.quantidadeRam + " GB\nArmazenamento interno: " 
				+ this.capacidadeArmazenamento + " GB\nTamanho da tela: " + this.tamanhoTela + " polegadas.";
	}

}
