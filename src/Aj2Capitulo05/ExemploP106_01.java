package Aj2Capitulo05;

public class ExemploP106_01 {
	private int[] inteiros;
	private int id;
	
	public ExemploP106_01(int id, int tamanho) {
		this.id = id;
		inteiros = new int[tamanho];
	}

	public void finalize() {
		System.out.println("Removendo objeto " + id + " da memoria");
	}
}
