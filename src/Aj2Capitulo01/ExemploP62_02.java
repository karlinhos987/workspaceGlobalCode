package Aj2Capitulo01;

public class ExemploP62_02 {
	public static void main(String[] args) {
		ExemploP62_01 produto = new ExemploP62_01();
		produto.inicializaValores(9.41, "Produto X", "Marca Y");
		produto.imprime();
		
		produto.aumentarPreco(10);;
		produto.setDescricao("nova descrição");
		produto.setMarca("Sem marca");
		produto.imprime();		
	}
}