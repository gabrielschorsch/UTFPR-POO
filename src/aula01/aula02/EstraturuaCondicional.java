package aula01.aula02;

public class EstraturuaCondicional {

	public static void main(String[] args) {
		
		double notaFinal = 10.0;
		
		if(notaFinal >= 6.0) {
			
			System.out.println("APROVADO");
		
		} else {
			
			if(notaFinal >= 4.0) {
				
				System.out.println("RECUPERA��O");
			
			} else {
				
				System.out.println("REPROVADO");
			}
		}
	}
}
