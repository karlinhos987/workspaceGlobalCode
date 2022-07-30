package Aj2Capitulo05;

public class ExemploP106_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanhoLista = Integer.parseInt(args[0]);

		for (int i = 0; i < 5; i++) {
			ExemploP106_01 lista = new ExemploP106_01(i, tamanhoLista);
			//lista.finalize();
		}

		System.out.println("Finalizando programa");
	}

}
