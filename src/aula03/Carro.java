package aula03;

public class Carro {

	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade = 50;
	
	public void ligar() {
		System.out.println(modelo + " ligou");
	}
	
	public void desligar() {
		
	}
	
	public void acelerar(int valor) {
		
		velocidade = velocidade + valor;
	}
	
	public void frear() {
		
	}
}
