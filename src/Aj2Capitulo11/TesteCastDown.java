/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP247_01
public class TesteCastDown {
	public static void main(String[] args) {
		
		//O objeto c foi declarando e instaciando como Cliente
		Cliente c = new Cliente();
		
		//Casting UP de Cliente para Pessoa
		Pessoa p = c;
		
		//Cast DOWN de Pessoa para Cliente
		Cliente c2 = (Cliente) p;
		
		//Criacao de uma instacia da classe Pessoa
		Pessoa p2 = new Pessoa();
		
		//Cast DOWN invalido de Pessoa para Cliente
		Cliente c3 = (Cliente) p2;
		
	}
}
