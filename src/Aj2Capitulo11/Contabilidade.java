/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP250_01
public class Contabilidade {
	public void gerarDemonstrativo(Funcionario func) {
		System.out.println("O Funcionario: "+func.getNome());
		System.out.println("Recebeu o pagamento de : "+func.calculaPagamento());
	}
}
