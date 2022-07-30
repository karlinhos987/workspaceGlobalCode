package Aj2Capitulo04;

//Exemplo de erro de sobrecarga
//o erro ocorre, pois os dois metodos possuem a mesma quantidade de arqgumentos e assim o compilador não consegue
//identificar qual dos dois ele precisa executar;
public class ExemploP81_01 {
	public int soma(int a, int b) {
		return a + b;
	}
	
	public long soma(int a, int b, int c) {
		return a + b + c;
	}
	public float soma(float a, float b) {
		return a + b;
	}
	
	public long soma(int[] numeros) {
		long resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}
}