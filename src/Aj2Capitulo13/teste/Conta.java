/**
 * 
 */
package Aj2Capitulo13.teste;

/**
 * @author karlinhos987
 *
 */

//ExemploP340_00
public class Conta {
	private double saldo;
	public String numero;
	
	public void abrirConta(String numero, double deposito, TipoConta tipo) {
		this.saldo = deposito;
		this.numero = numero;
	}
	
	public double getSaldo() {return saldo;}
	public void deposito(double valor) {this.saldo += valor;}
	public void saque(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
		}
	}
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
}
