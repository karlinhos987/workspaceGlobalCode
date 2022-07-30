package Aj2Capitulo04;

//calculudora ambigua, os tipos dos parametros e dos retorno são diferentes
public class ExemploP84_01 {
	public int soma(byte b1, byte b2) {
		System.out.println("Soma de byte");
		return b1 + b2;
	}
	
	public long soma(long b1, long b2) {
		System.out.println("Soma de long");
		return b1 + b2;
	}
	
	public double soma(double b1, double b2) {
		System.out.println("Soma de double");
		return b1 + b2;
	}
}
