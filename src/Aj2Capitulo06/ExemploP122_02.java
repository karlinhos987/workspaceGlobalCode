package Aj2Capitulo06;

public class ExemploP122_02 {
	public static void main(String[] args) {
		System.out.println("1 + 9 = " + ExemploP122_01.soma(1, 9));
		System.out.println("1 + 9.5 = " + ExemploP122_01.soma(1, 9.5F));
		
		int num[] = {1,3,5,7};
		
		System.out.println("1 + 3 + 5 + 7 = " + ExemploP122_01.soma(num));
	}
}
