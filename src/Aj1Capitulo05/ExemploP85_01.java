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
public class ExemploP85_01 {
    public static void main(String[] args) {
        int x = 9;
        int y = 0;
        
        boolean a = x > y && x > 0;
        System.out.println("X>Y e X>0 = "+a);
        
        boolean b = (y == 0) || (x == 0);
        System.out.println("Um dos dois eh igual a zero = "+b);
    }
}
