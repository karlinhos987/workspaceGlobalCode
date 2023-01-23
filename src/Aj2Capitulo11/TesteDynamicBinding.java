/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP251_01
public class TesteDynamicBinding {
	public static void main(String[] args) {
		Funcionario f = new FuncionarioCLT();
		f.calculaPagamento();
		f = new FuncionarioPJ();
		f.calculaPagamento();
	}
}
