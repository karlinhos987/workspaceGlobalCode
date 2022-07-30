package Aj2Capitulo04;

public class ExemploP83_02 {
	public static void main(String[] args) {
		ExemploP82_01 p = new ExemploP82_01();

		p.inicializaValores(36.7, "PRODUTO X", "MARCA Y");
		p.imprime();

		ExemploP82_01 p2 = new ExemploP82_01();

		p2.inicializaValores(36.7, "MARCA ABC");
		p2.imprime();
	}
}