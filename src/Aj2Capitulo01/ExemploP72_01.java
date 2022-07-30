package Aj2Capitulo01;

public class ExemploP72_01 {
	public static void main(String[] args) {
		ExemploP67_01 p1 = new ExemploP67_01();
		p1.setNome("Carlos");
		p1.setRg("123456");
		
		ExemploP67_01 p2 = new ExemploP67_01();
		p2.setNome("SolraC");
		p2.setRg("654321");
		
		ExemploP67_01 pessoasDpto[] = {p1, p2};
		
		ExemploP69_01 dpto = new ExemploP69_01();
		dpto.setNome("Dpto compras");
		dpto.setPessoas(pessoasDpto);
		System.out.println("Departamento recem criado");
		dpto.imprime();
		
		ExemploP67_01 novaPessoa = new ExemploP67_01();
		novaPessoa.setNome("Nova Pessoa da Silva");
		novaPessoa.setRg("987654");
		dpto.addPessoas(novaPessoa);
		dpto.imprime();
		
		dpto.removePessoa(p1);
		dpto.imprime();
		
		ExemploP67_01 p3 = new ExemploP67_01();
		p3.setNome("Teste da Cunha");
		p3.setRg("741258");
		dpto.addPessoas(p3);
		dpto.imprime();
		
		ExemploP67_01 p4 = new ExemploP67_01();
		p4.setNome("Teste de Oliveira");
		p4.setRg("951357");
		dpto.addPessoas(p4);
		dpto.imprime();
		
		System.out.println("Procurando a pessoa com RG = 741258");
		ExemploP67_01 procurada1 = dpto.getPessoa("741258");
		if(procurada1 != null) {
			System.out.println(procurada1.getNome());
		}
		System.out.println("Procurando a pessoa com RG = 585858");
		ExemploP67_01 procurada2 = dpto.getPessoa("585858");
		if(procurada2 != null) {
			System.out.println(procurada2.getNome());
		}else {
			System.out.println("Pessoa não econtrada");
		}
		
	}
}
