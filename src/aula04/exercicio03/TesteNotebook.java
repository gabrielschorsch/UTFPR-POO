package aula04.exercicio03;

public class TesteNotebook {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.modeloProcessador = "Intel Core I9 9700K";
		notebook.quantidadeRam = 16;
		notebook.capacidadeArmazenamento = 1024;
		notebook.tamanhoTela =17;
		notebook.marca = "Dell";
		notebook.modelo = "Inspiron G15";
		System.out.println(notebook);

		notebook.ligar();
		notebook.conectarInternet();
		notebook.processarInformacoes();
		notebook.desligar();

	}
}
