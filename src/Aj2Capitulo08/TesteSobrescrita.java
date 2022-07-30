package Aj2Capitulo08;

public class TesteSobrescrita {
	public static void main(String[] args) {
		//Criando o endereço para o funcionario f
		Endereco4 end1 = new Endereco4("Rua das Tulipas", 255);
		
		//criando a pessoa e imprimindo seus dados
		Pessoa4 pessoa = new Pessoa4(end1, "Maria da Silva", "987654321");
		pessoa.imprime();
		
		System.out.println();
		
		//criando o funcionario f
		Funcionario4 f = new Funcionario4(end1,"Pedro da Silva", "123456789", 123456L, 10000, "25/03/2022");
		f.imprime();
		
		//atribuindo as caracteristicas herdadas da classe Pessoa
		//f.setNome("Pedro da Silva");
		//f.setEndereco(end1);
		//f.setRg("123456789");
		
		//atribuindo as caracteristicas e
		//f.setSalario(10000);
		//f.setCarteiraProssional(123456789L);
		
		//chamando um metodo definido na classe Pessoa que, por sua vez,
		//"conhece" apenas os atributos da classe Pessoa
		
		//f.imprime();
		f.impressaoRecibo(24, 03, 2022);
	}
}
