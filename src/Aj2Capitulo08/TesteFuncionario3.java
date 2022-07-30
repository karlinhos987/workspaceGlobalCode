package Aj2Capitulo08;

public class TesteFuncionario3 {
	public static void main(String[] args) {
		//Criando o endereço para o funcionario f
		Endereco3 end1 = new Endereco3("Rua das Tulipas", 255);
		
		//criando o funcionario f
		Funcionario3 f = new Funcionario3(end1,"Pedro da Silva", "123456789");
		
		//atribuindo as caracteristicas herdadas da classe Pessoa
		f.setNome("Pedro da Silva");
		f.setEndereco(end1);
		f.setRg("123456789");
		
		//atribuindo as caracteristicas e
		f.setSalario(10000);
		f.setCarteiraProssional(123456789L);
		
		//chamando um metodo definido na classe Pessoa que, por sua vez,
		//"conhece" apenas os atributos da classe Pessoa
		
		//f.imprime();
		f.impressaoRecibo(24, 03, 2022);
	}
}
