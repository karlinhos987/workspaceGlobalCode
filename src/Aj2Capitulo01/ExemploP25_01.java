package Aj2Capitulo01;

public class ExemploP25_01 {
	public static void main(String[] args) {
		ExemploP24_01 calc = new ExemploP24_01();
		
		calc.print("Vamos testar a calculadora");
		
		int resultado1 = calc.soma(10, 11);
		System.out.println("10 + 11 = " + resultado1);
		
		double resultado2 = calc.multiplicacao(9, 5);
		System.out.println("9 * 5 = " + resultado2);
		
		boolean resultado3 = calc.maior(89, 91);
		System.out.println("89 > 91 " + resultado3);
	}	
}