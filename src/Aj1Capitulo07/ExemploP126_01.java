/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo07;

/**
 *
 * @author Carlos
 */
public class ExemploP126_01 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4 };
        
        //Com a nova sintaxe enhanced for
        for (int valor : array) {
            System.out.println("\t [" + valor + "] = " + valor);
        }
    }
}
