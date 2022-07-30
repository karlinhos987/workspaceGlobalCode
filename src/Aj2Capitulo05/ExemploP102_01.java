package Aj2Capitulo05;

public class ExemploP102_01 {
	private int atributo = 15;
	
	//bloco inicializador
	{
		System.out.println("Dentro do inicializador de instancia");
		System.out.println("Valor do atributo = " + atributo);
	}
	
	//construtor
	public ExemploP102_01() {
		System.out.println("Dentro do construtor");
	}
}
