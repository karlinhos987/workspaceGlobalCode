/**
 * 
 */
package Aj3Capitulo01.testes;

/**
 * @author karlinhos987
 *
 */

//ExemploP18_01
public class TesteString {
	public static void main(String[] args) {
		String nome = "GlobalCode";
		char inicial = nome.charAt(0);
		System.out.println("Inicial = " + inicial);
		
		//concat sample
		String nome1 = "Global";
		String nome2 = "Code";
		String nome3 = nome1.concat(nome2);
		System.out.println("Nome: " + nome3);
		
		//indexOf sample
		String nome4 = new String("GlobalCode");
		int posicao = nome4.indexOf("Code");//case sensitive
		System.out.println("Posicao: " + posicao);
		
		//toLowerCase sample
		String nome5 = "GLOBALCOde";
		String minusculas = nome5.toLowerCase();
		System.out.println(nome5);
		System.out.println(minusculas);
		
		//trim sample
		String nome6 = " GlobalCode ";
		String semEspaco = nome6.trim();
		System.out.println("String com espaco -" + nome6 + "-");
		System.out.println("String sem espaco -" + semEspaco + "-");
	}
}
