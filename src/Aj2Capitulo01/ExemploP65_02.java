package Aj2Capitulo01;

public class ExemploP65_02 {
	public static void main(String[] args) {
		ExemploP64_01 prod1 = new ExemploP64_01();
		ExemploP65_01 prod2 = new ExemploP65_01();
		
		prod1.setMarca("TESTE");
		prod2.setMarca("TESTE2");
		
		System.out.println("Produto 1 = " + prod1.getMarca());
		System.out.println("Produto 2 = " + prod2.getMarca());
	}
}