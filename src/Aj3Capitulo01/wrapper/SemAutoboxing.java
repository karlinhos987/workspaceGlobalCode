/**
 * 
 */
package Aj3Capitulo01.wrapper;

/**
 * @author karlinhos987
 *
 */

//ExemploP13_01
public class SemAutoboxing {
	public static void main(String[] args) {
		int i = 10;
		
		Integer objeto1 = new Integer(i);//Construtor depreciado
		Integer objeto2 = Integer.valueOf(i);
		
		if(objeto1.intValue() == 10) {
			System.out.println("Valor do objeto1 igual a 10 ");
		}
		
		if(objeto2.intValue() == 10) {
			System.out.println("Valor do objeto2 igual a 10 ");
		}
	}
}
