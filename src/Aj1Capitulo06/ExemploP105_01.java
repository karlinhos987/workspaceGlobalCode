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
public class ExemploP105_01 {
    public static void main(String[] args) {
        //A variavel 'i' esta dentro das condicoes 'do while'
        int i = 0;
        
        do {            
            i++;
            System.out.println("i = " + i);
        } while (i < 2);
        
        //A variavel 'j' esta fora das condicoes 'do while', no entanto,
        //o laco sera executado pelo menos uma vez
        int j = 20;
        do {            
            j++;
            System.out.println("j = " + j);
        } while (j < 20);
    }
}
