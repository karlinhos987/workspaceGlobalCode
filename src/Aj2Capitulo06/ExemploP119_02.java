package Aj2Capitulo06;

public class ExemploP119_02 {
	public static void main(String[] args) {
		
		System.out.println("Velocidade maxima permitida: ");
		System.out.println(ExemploP116_01.velocidadeMaximaPermitida);
		
		ExemploP119_01 c1 = new ExemploP119_01("GM", "IBM9876", 50);
		ExemploP119_01 c2 = new ExemploP119_01("Fiat", "KLMN1548", 420);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite ?");
		System.out.println(c1.ultrapassouLimite());
		
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite ?");
		System.out.println(c1.ultrapassouLimite());
		
		ExemploP116_01.velocidadeMaximaPermitida = 80;
	
		System.out.println("Velocidade maxima permitida: ");
		System.out.println(ExemploP116_01.velocidadeMaximaPermitida);
		
		System.out.println("Carro " + c1.getPlaca() + " ultrapassou o limite ?");
		System.out.println(c1.ultrapassouLimite());
		
		System.out.println("Carro " + c2.getPlaca() + " ultrapassou o limite ?");
		System.out.println(c1.ultrapassouLimite());
	}
}
