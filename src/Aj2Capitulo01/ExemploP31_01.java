package Aj2Capitulo01;

public class ExemploP31_01 {
	void listaNomes(String[] nomes) {
		System.out.println("Lista de nomes recebidos: ");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("\t " + nomes[i]);
		}
	}
	
	void listaNotas(double[] notas) {
		System.out.println("Lista de notas recebidas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\t " + notas[i]);
		}
	}
}