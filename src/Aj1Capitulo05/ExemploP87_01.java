/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo05;

/**
 *
 * @author karlinhos
 */
public class ExemploP87_01 {
	public static void main(String[] args) {

		/*
            &  and
            ^  XOR(eXclusive OR)
            |  OR
		 */

		int i = 0;
		int j = 4;

		boolean a = (i != 0) && (j++ > 2);
		System.out.println("Resultado  com && = " + a);
		System.out.println("&& > i: "+ i + " j: " + j);

		boolean b = (i != 0) & (j++ > 2);
		System.out.println("Resultado com & = " + b);
		System.out.println("& > i: " + i + " j: " + j);
	}
}
