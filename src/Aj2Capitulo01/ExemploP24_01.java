package Aj2Capitulo01;

public class ExemploP24_01 {
	int soma(int x, int y) {
		return x + y;
	}
	
	double multiplicacao(double d1, double d2) {
		double resultado = d1 * d2;
		return resultado;
	}
	
	boolean maior(int num1, int num2) {
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	void print(String texto) {
		System.out.println("Texto: " + texto);
	}
	
}
