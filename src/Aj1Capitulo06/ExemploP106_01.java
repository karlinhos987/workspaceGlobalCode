/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo06;

/**
 *
 * @author karlinhos
 */
public class ExemploP106_01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i = i +1) {
            System.out.println("i = " + i);
        }
       
        System.out.println("\n\n");
        
        for (int i = 0, z = 15; i < z; i++, z--) {
            System.out.println("i = " + i + " z = " + z);
            
        }
    }
}
