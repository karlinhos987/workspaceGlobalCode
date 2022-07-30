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
public class ExemploP68_01 {
    public static void main(String[] args) {
        //incremeto pos-fixado, primeiro imprime depois incrementa
        int x = 5;
        System.out.println("x = "+ x++);
        //System.out.println("x = "+ x);
        
        //decremento pos-fixadom primeiro imprime depois decrementa
        int y = 5;
        System.out.println("y = "+ y--);
        //System.out.println("y = "+ y);
        
        //incremeto pre-fixado, primeiro incrementa depois imprime
        int w = 5;
        System.out.println("w = "+ ++w);
        
        //decremento pos-fixadom primeiro decrementa depois imprime
        int z = 5;
        System.out.println("y = "+ --z);
    }
}
