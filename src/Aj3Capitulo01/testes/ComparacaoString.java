/**
 * 
 */
package Aj3Capitulo01.testes;

/**
 * @author karlinhos987
 *
 */

//ExemploP20_01
public class ComparacaoString {
	public static void main(String[] args) {
		if(args.length == 2) {
			String str1 = args[0];
			String str2 = args[1];
			
			System.out.println("Argumento 1: " + str1);
			System.out.println("Argumento 2: " + str2);
			
			//utilizando o operador ==
			if(str1 == str2) {
				System.out.println("Strings sao iguais utilizando o operador ==");
			}else {
				System.out.println("Strings NAO sao iguais utilizando o operador ==");
			}
			
			//utilizando o metodo equals
			if(str1.equals(str2)) {
				System.out.println("Strings sao iguais utilizando o equals");
			}else {
				System.out.println("Strings NAO sao iguais utilizando o equals");
			}
			
			//utilizando o metodo equalsIgnoreCase
			if(str1.equalsIgnoreCase(str2)) {
				String msg = "Strings sao iguais utilizando o equalsIgnoreCase";
				System.out.println(msg);
			}else {
				String msg = "Strings NAO sao iguais utilizando o equalsIgnoreCase";
				System.out.println(msg);
			}
			
			//utilizando o meotodo compareTo
			int dif = str1.compareTo(str2);
			if(dif ==0) {
				System.out.println("Strings sao iguais utilizando compareTo");
			}else {
				System.out.println("Strings NAO sao iguais utilizando compareTo");
			}
		}else {
			String msg = "Sintaxe correta: java ComparacaoString <str1> <str2>";
			System.out.println(msg);
		}
	}
}
