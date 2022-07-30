package Aj2Capitulo06;

public class ExemploP127_01 {
	private static int[] cores = new int[7];
	
	ExemploP127_01(){
		System.out.println("Criando instancia da classe ExemploP127_01");
	}
	
	static {
		//serao atribuidos numeros inteiros as cores
		//como por exemplo: 0 branco, 1 azul, 2 vermelho
		System.out.println("Inicialização array de cores no bloco de incializacao estatico...");
		for(int i = 0; i < cores.length; i++) {
			cores[i] = i;
 		}
	}
}
