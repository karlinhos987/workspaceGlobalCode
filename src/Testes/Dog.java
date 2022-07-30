package Testes;

public class Dog {
	private int instancias;

	Dog(){

	instancias++;

	}

	public int getInstancias() {

	return instancias;

	}

	public static void main(String[] args) {

	Dog bob = new Dog();

	Dog rex = new Dog();

	System.out.println("Imprime:" + rex.instancias + bob.instancias);

	}
}
