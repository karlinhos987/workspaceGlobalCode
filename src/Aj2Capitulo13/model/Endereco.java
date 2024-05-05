/**
 * 
 */
package Aj2Capitulo13.model;

import Aj2Capitulo13.exceptions.NumeroInvalidoException2;

/**
 * @author karlinhos987
 *
 */

//ExemploP330_02
public class Endereco {
	private String rua;
	private int numero;
	
	//Como o construtor chama o metodo setNumero eh necessario indicar na
	//assintura que ele pode lancar uma exception NumeroInvalidoException2
	public Endereco(String rua, int numero) throws NumeroInvalidoException2 {
		this.rua = rua;
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) throws NumeroInvalidoException2 {
		if(numero > 0) {
			this.numero = numero;
		}else {
			throw new NumeroInvalidoException2(numero + " nao eh valido! ");
		}
	}
}
