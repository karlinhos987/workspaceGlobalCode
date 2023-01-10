package Testes;

public class FooClass {
	private int value = 1;
	public void printVal(int value) {
		System.out.print(value);
	}
	
	public static void main(String[] args) {
		int a = 2;
		FooClass c = new FooClass();
		c.printVal(a);
	}
}
