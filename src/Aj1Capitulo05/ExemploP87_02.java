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
public class ExemploP87_02 {
	public static void main(String[] args) {

		/*
            &  and
            ^  XOR(eXclusive OR)
            |  OR
		 */

		int i = 4;
		int j = 5;

		System.out.println("\ni = " + i + " = " + Integer.toBinaryString(i));
		System.out.println("\nj = " + j + " = " + Integer.toBinaryString(j));
		System.out.println("\ni & j = " + Integer.toBinaryString(i & j) + " = " + (i & j) );
	}
}
