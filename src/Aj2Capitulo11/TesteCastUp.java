/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP246_01
public class TesteCastUp {
	public static void main(String[] args) {
		
		//O objeto c foi declarando e instaciando como Cliente
		Cliente c = new Cliente();
		
		//Casting UP explicito do objeto da classe Cliente para classe Pessoa
		Pessoa p = (Pessoa)c;
		
		//Casting UP do objeto da classe Cliente para classe Pessoa
		Pessoa p2 = c;
		
		//Casting UP do objeto da classe Cleinte para classe Pessoa
		Pessoa p3 = new Cliente();
		
		//Casting UP explicito do objeto da classe Cliente para classe Object
		Object o = (Object)c;
		
		//Casting UP do objeto da classe Cliente para classe Object
		Object o2 = c;
		
	}
}
