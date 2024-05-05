/**
 * 
 */
package Aj3Capitulo01.wrapper;

/**
 * @author karlinhos987
 *
 */

//ExemploP12_01
public class TesteWrapperClasses {
	public static void main(String[] args) {
		//exemplo de utilizacao da classe Boolean
		System.out.println("\nExemplo de utilizacao da classe Boolean:");
		Boolean b1 = new Boolean(true);//Construtor depreciado
		System.out.println("b1: " + b1.booleanValue());

		Boolean b2 = Boolean.valueOf(true);
		System.out.println("b2: " + b2.booleanValue());

		Boolean b3 = new Boolean("true");//Construtor depreciado
		System.out.println("b3: " + b3.booleanValue());

		Boolean b4 = Boolean.valueOf("true");
		System.out.println("b4: " + b4.booleanValue());

		//exemplo de utilizacao da classe Integer
		System.out.println("\nExemplo de utilizacao da classe Integer");
		Integer i1 = new Integer(12);//Construtor depreciado
		System.out.println("i1: " + i1.intValue());

		Integer i2 = Integer.valueOf(12);
		System.out.println("i2: " + i2.intValue());

		Integer i3 = new Integer("12");//Construtor depreciado
		System.out.println("i3: " + i3.intValue());

		Integer i4 = Integer.valueOf("12");
		System.out.println("i4: " + i4.intValue());

		String binaryString = Integer.toBinaryString(23);
		System.out.println("23(em numero binario) - binaryString: " + binaryString);

		int i5 = Integer.parseInt("12345");
		System.out.println("i5" + i5);

		//exemplo de utilizacao da classe Double
		System.out.println("\nExemplo de utilizacao da classe Double");
		Double d1 = new Double(45.9);//Construtor depreciado
		System.out.println("d1: " + d1.intValue());

		Double d2 = Double.valueOf(45.8);
		System.out.println("d2: " + d2.intValue());

		Double d3 = new Double("45.7");//Construtor depreciado
		System.out.println("d3: " + d3.intValue());

		Double d4 = Double.valueOf("45.6");
		System.out.println("i4: " + d4.intValue());
		
		//utilizando o metodo intValue para transformar um double em int
		System.out.println("d1=45.9(int): " + d1.intValue());
		
		//exemplo de utilizacao da classe Character
		System.out.println("\nExemplo de utilizacao da classe Character");
		Character c1 = new Character('1');//Construtor depreciado
		System.out.println("c1: " + c1.charValue());
		
		Character c2 = Character.valueOf('2');
		System.out.println("c2: " + c2.charValue());
		
		char c3 = '5';
		boolean isDigit = Character.isDigit(c3);
		System.out.println(c2 + " eh digito? " + isDigit);
		
		char c4 = 'a';
		boolean isLetterOrDigit = Character.isLetterOrDigit(c4);
		System.out.println(c4 + " eh digito ou letra? " + isLetterOrDigit);
		
		
	}
}
