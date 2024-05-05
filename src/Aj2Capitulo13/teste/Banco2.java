/**
 * 
 */
package Aj2Capitulo13.teste;

/**
 * @author karlinhos987
 *
 */

//ExemploP341_01
public class Banco2 {
	public Conta abrirConta(TipoConta tipo) {
		Conta conta = null;
		if(tipo==TipoConta.CONTA_CORRENTE) {
			conta = new ContaCorrente();
		}else {
			conta = new ContaPoupanca();
		}
		
		
		assert conta != null: "a conta nao foi criada!!";
		return conta;
	}
}
