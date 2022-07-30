package Aj2Capitulo04;

public class ExemploP84_02 {
	public static void main(String[] args) {
		ExemploP84_01 calc = new ExemploP84_01();
		calc.soma(24, 25);
		
		byte a = 24;
		byte b = 25;
		calc.soma(a, b);
		
		calc.soma((byte)24, (byte)25);
	}
}
