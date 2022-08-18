package aula02;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe a idade:");
		int idade = entradaTeclado.nextInt();

		entradaTeclado.nextLine(); // limpeza de buffer
		
		System.out.println("Informe o nome:");
		String nome = entradaTeclado.nextLine();
		
		System.out.println("Informe o peso:");
		double peso = entradaTeclado.nextDouble();		
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		
		entradaTeclado.close();
	}
}
