/*
 * ExemploP17_01
 *
 */

package Aj2Capitulo01;

public class ExemploP27_02 {
	public static void main(String[] args) {
		ExemploP27_01 data = new ExemploP27_01();

		data.dia = 12;
		data.mes = 12;
		data.ano = 2008;
		data.imprime();

		String bi = data.isAnoBissexto() ? "" : "não";
		System.out.println("O ano " + data.ano + " " + bi + "e bissexto ");

		ExemploP27_01 data2 = new ExemploP27_01();

		data2.dia = 25;
		data2.mes = 01;
		data2.ano = 2015;
		data2.imprime();

		String bi2 = data2.isAnoBissexto() ? "" : "não";
		System.out.println("O ano " + data2.ano + " " + bi2 + " e bissexto ");

	}

}
