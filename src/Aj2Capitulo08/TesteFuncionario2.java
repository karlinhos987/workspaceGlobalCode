package Aj2Capitulo08;

public class TesteFuncionario2 {
	public static void main(String[] args) {
		//Criando o endereço para o funcionario f
		Endereco2 end1 = new Endereco2("Rua das Tulipas", 255);
		
		//criando o funcionario f
		Funcionario2 f = new Funcionario2();
		
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
