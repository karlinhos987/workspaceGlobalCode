package Aj2Capitulo08;

public class TestePessoaToString {
	public static void main(String[] args) {
		Endereco5 e = new Endereco5 ("Av. XXXXXXX", 123);
		Pessoa5 p = new Pessoa5(e, "Carlos Oliveira", "123456789");
		
		//o metodo toString() sera chamado automaricamente
		System.out.println(p);
		System.out.println();
		String texto = "Dados da pessoa: \n" + p;
		System.out.println(texto);
	}
}
