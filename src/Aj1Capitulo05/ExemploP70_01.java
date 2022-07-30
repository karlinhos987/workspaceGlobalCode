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
public class ExemploP70_01 {
    public static void main(String[] args) {
        int i = 38;
        System.out.println("38 invertido = "+ ~i);
        
        i = 39;
        System.out.println("39 invertido = "+ ~i);
        
        i = -40;
        System.out.println("-40 invertido = "+ ~i);
        
        short s = 12;
        //quando aplicamos inversao de bits o resultado eh promovido a int
        
        int shortInvertido = ~s;
        System.out.println("12 invertido = " + shortInvertido);
        
        char c = 'a';
        //quando aplicamos inversao de bits o resultado eh promvido a int, e 
        //neste caso, o caractere 'a' sera promovido a int (97) antes da
        //inversao
        
        int charInvertido = ~c;
        System.out.println("'a' invertido = "+ charInvertido);
                
    }
}
