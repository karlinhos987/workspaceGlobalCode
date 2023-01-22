/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP247_01
public class TesteOperadorInstanceof {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		if(p instanceof Cliente) {
			Cliente c = (Cliente) p;
			System.out.println("CPF: " + c.getCpf());
		}else if(p instanceof Funcionario) {
			Funcionario f = (Funcionario) p;
			System.out.println("Salario: " + f.getSalario());
		}else {
			System.out.println("Não eh Cliente nem Funcionario...é um OVNI");
		}
	}
}
