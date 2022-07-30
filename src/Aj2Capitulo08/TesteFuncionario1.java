package Aj2Capitulo08;

public class TesteFuncionario1 {
	public static void main(String[] args) {
		//Criando o endereço para o funcionario f
		Endereco1 end1 = new Endereco1("Rua das Tulipas", 255);
		
		//criando o funcionario f
		Funcionario1 f = new Funcionario1();
		
		//atribuindo as caracteristicas herdadas da classe Pessoa
		f.setNome("Pedro da Silva");
		f.setEndereco(end1);
		f.setRg("123456789");
		
		//atribuindo as caracteristicas e
		f.setSalario(1200);
		f.setCarteiraProssional(123456789L);
		
		//chamando um metodo definido na classe Pessoa que, por sua vez,
		//"conhece" apenas os atributos da classe Pessoa
		
		f.imprime();
	}
}
