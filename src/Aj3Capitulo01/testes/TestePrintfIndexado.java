/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP48_01
public class TestePrintfIndexado {
	public static void main(String[] args) {
		String nome = "Jose da Silva";
		double pagamento = 6500;
		Date data = new Date();
		System.out.printf("%s recebeu um pagamento de R$ %.2f no dia %td/%3$tm/%3$tY", 
				nome, pagamento, data);
	}
}
