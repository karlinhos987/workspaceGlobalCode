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
public class ExemploP87_02_1 {
    public static void main(String[] args) {
        int i = 4;
        int j = 5;
        
        System.out.println("i = " + i + " = " + Integer.toBinaryString(i));
        System.out.println("j = " + j + " = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + 
                Integer.toBinaryString(i & j) + " = " + (i & j));
    }
}
