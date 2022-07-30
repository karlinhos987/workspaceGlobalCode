/*
 * ExemploP18_01
 *
 */
package Aj2Capitulo01;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		p.nome = "Carlos";
		p.sobrenome = "Oliveira";
		p.dataNasc = "28/08/1987";
		String osTelefones[] = {"16992616748","1636381045"};
		p.telefones = osTelefones;

		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data de nascimento: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones: ");
		for (int i = 0; i < osTelefones.length; i++) {
			System.out.println(p.telefones[i]);
		}
	}
}
