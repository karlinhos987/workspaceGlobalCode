package Aj2Capitulo04;

//Exemplo de erro de sobrecarga
//o erro ocorre, pois os dois metodos possuem a mesma quantidade de arqgumentos e assim o compilador não consegue
//identificar qual dos dois ele precisa executar;
public class ExemploP80_01 {
	public int multiplica(int a, int b) {
		return a * b;
	}
	
	public long multiplica(long c, int d) {
		return c * d;
	}
	
	public void usaMultiplicacao() {
		multiplica(100, 31);
	}	
}