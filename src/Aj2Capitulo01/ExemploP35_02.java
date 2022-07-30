package Aj2Capitulo01;

public class ExemploP35_02 {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 2;
		
		ExemploP35_01 calculadora = new ExemploP35_01();
		
		System.out.println("O valor de num1 antes do metodo multiplica " + num1);
		System.out.println("O valor de num2 antes do metodo multiplica " + num2);
		
		calculadora.multiplicaValores(num1, num2);
		
		System.out.println("O valor de num1 apos do metodo " + num1);
		System.out.println("O valor de num2 apos do metodo " + num2);
	}
}
