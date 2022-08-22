package aula04.exercicio05;

public class Calculadora {
	private String marca;
	private String modelo;
	private TipoCalculadora tipo;
	private int memoriaInterna;
	private boolean isOn;
	
	public void ligar() {
		if(isOn) {
			System.out.println("A calculadora já está ligada.");
			return;
		}
		isOn = true;
		System.out.println("Calculadora iniciada.");
	}
	
	public void desligar() {
		if(isOn) {
			isOn = false;
			System.out.println("A calculadora desligada.");
			return;
		}
		System.out.println("Calculadora já está desligada.");
	}
	
	public double somar(double a, double b) {
		return a+b;
		
	}
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public TipoCalculadora getTipo() {
		return tipo;
	}


	public void setTipo(TipoCalculadora tipo) {
		this.tipo = tipo;
	}


	public int getMemoriaInterna() {
		return memoriaInterna;
	}


	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}

	
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + "]";
	}


}
