package Aj2Capitulo08;

public class ExemploSubClasse extends ExemploSuperClasse{
	int campo = 18;
	
	{
		System.out.println("Bloco de inicializacao da subclasse");
	}
	
	public ExemploSubClasse() {
		// TODO Auto-generated constructor stub
		System.out.println("Construtor da subclasse");
	}
	
}
