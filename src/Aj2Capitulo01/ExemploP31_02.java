package Aj2Capitulo01;

public class ExemploP31_02 {
	public static void main(String[] args) {
		ExemploP31_01 imp = new ExemploP31_01();

		String[] candidatos = new String[3];
		candidatos[0] = "XXXX";
		candidatos[1] = "YYYY";
		candidatos[2] = "TTTT";
		
		imp.listaNomes(candidatos);
		imp.listaNotas(new double[] {7.5 , 8.0, 2.9});
	}
}
