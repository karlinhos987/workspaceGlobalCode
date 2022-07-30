package Aj2Capitulo01;

public class ExemploP26_02 {
	public static void main(String[] args) {
		ExemploP26_01 produto = new ExemploP26_01();
		produto.inicializaValores(9.41, "Produto X", "Marca Y");
		produto.imprime();
		
		produto.preco *= 1.1;
		produto.descricao = "Nova descricao";
		produto.marca = "Sem marca";
		produto.imprime();		
	}
}