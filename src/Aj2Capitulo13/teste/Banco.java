/**
 * 
 */
package Aj2Capitulo13.teste;

/**
 * @author karlinhos987
 *
 */

//ExemploP340_02
public class Banco {
	public Conta abrirConta(TipoConta tipo) {
		Conta conta = null;
		if(tipo==TipoConta.CONTA_CORRENTE) {
			conta = new ContaCorrente();
		}
		
		assert conta != null: "a conta nao foi criada!!";
		return conta;
	}
}
