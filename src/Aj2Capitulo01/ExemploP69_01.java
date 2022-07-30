
package Aj2Capitulo01;

//Departamento
public class ExemploP69_01 {
	private String nome;
	private int numPosicoesLivres = 0;
	private ExemploP67_01[] pessoas;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ExemploP67_01[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(ExemploP67_01[] pessoas) {
		this.pessoas = pessoas;
	}

	public void addPessoas(ExemploP67_01 pessoa) {
		System.out.println("Adicionado " + pessoa.getNome() + " ao departamento");
		if(numPosicoesLivres > 0) {
			System.out.println("Existem posições livres no departamento");
			pessoas[pessoas.length - numPosicoesLivres] = pessoa;
			numPosicoesLivres--;
		}else {
			System.out.println("Aumentando a capacidade de pessoas do depto");
			ExemploP67_01 novoArrayPessoas[] = new ExemploP67_01[pessoas.length + 1];

			for (int i = 0; i < pessoas.length; i++) {
				novoArrayPessoas[i] = pessoas[i];
			}

			novoArrayPessoas[novoArrayPessoas.length - 1] = pessoa;
			pessoas = novoArrayPessoas;
		}
	}

	public ExemploP67_01 getPessoa(String rg) {
		for (int i = 0; (i < pessoas.length - numPosicoesLivres); i++) {
			if(pessoas[i].getRg().equals(rg)) {
				return pessoas[i];
			}
		}
		return null;
	}

	public ExemploP67_01 removePessoa(ExemploP67_01 p) {
		String rgPessoa = p.getRg();
		int i = 0;

		while (i < pessoas.length - numPosicoesLivres) {
			if(pessoas[i].getRg().equals(rgPessoa)) {
				ExemploP67_01 pessoaRemovida = pessoas[i];
				pessoas[i] = pessoas[pessoas.length - 1 - numPosicoesLivres];
				pessoas[pessoas.length - 1 - numPosicoesLivres] = null;
				numPosicoesLivres++;

				System.out.println(pessoaRemovida.getNome() + " foi removido(a) do departamento");
				return pessoaRemovida;
			}
			i++;
		}
		return null;
	}

	public void imprime() {
		System.out.println("---------------------------");
		System.out.println("Departamento: " + this.getNome());

		if(pessoas != null) {
			int i = 0;
			while(i < pessoas.length) {
				System.out.println("[" + i + "]");
				if(pessoas[i] != null) {
					System.out.println(pessoas[i].getNome());
					System.out.println(" " + pessoas[i].getRg());
				}else {
					System.out.println("Posição livre");
				}
				i++;
			}
		}else {
			System.out.println("Não há pessoas neste departamento");
		}
		System.out.println("---------------------------");
	}
}
