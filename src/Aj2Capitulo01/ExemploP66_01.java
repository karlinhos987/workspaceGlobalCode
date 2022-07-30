
package Aj2Capitulo01;

//MauDepartamento
public class ExemploP66_01 {
	private String nome;
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
	
	public void imprime() {
		System.out.println("---------------------------");
		System.out.println("Departamento: " + this.getNome());
		
		if(pessoas != null) {
			for (int i = 0; i < pessoas.length; i++) {
				System.out.println(pessoas[i].getNome());
			}
		}else {
			System.out.println("Não há pessoas neste departamento");
		}
		System.out.println("---------------------------");
	}
}
