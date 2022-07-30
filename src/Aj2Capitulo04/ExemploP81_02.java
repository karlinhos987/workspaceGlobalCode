package Aj2Capitulo04;

public class ExemploP81_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploP81_01 calc = new ExemploP81_01();

		System.out.println("1 + 9 = " + calc.soma(1,9));
		System.out.println("1 + 9.9F = " + calc.soma(1, 9.9F));

		int num[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + calc.soma(num));
	}
}