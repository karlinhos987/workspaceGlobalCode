/**
 * 
 */
package Aj3Capitulo01.testes;

import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP43_01
public class TesteImpressaoPrintln {
	public static void main(String[] args) {
		String nome = "Jose da Silva";
		double pagamento = 6500;
		Date data = new Date();
		System.out.println(nome + " recebeu um pagamento de R$"
				+ pagamento +" no dia " + data);
	}
}
