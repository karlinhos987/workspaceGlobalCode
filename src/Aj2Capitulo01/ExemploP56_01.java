package Aj2Capitulo01;

public class ExemploP56_01 {
	public static void main(String[] args) {
		ExemploP55_01 produto = new ExemploP55_01();
		produto.inicializaValores(9.41, "Produto X", "Marca Y");
		produto.imprime();
		
		produto.aumentarPreco(10);;
		produto.setDescricao("nova descrição");
		produto.setMarca("Sem marca");
		produto.imprime();		
	}
}