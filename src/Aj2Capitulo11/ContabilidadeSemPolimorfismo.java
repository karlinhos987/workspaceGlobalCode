/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP250_01
public class ContabilidadeSemPolimorfismo {
	public void gerarDemonstrativo(FuncionarioCLT func) {
		System.out.println("O Funcionario: "+func.getNome());
		System.out.println("Recebeu o pagamento de : "+func.calculaPagamento());
	}
	
	public void gerarDemonstrativo(FuncionarioPJ func) {
		System.out.println("O Funcionario: "+func.getNome());
		System.out.println("Recebeu o pagamento de : "+func.calculaPagamento());
	}
}
