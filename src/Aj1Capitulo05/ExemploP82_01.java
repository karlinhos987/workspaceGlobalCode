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
public class ExemploP82_01 {
    public static void main(String[] args) {
    /*
        <   menor que 
        >   maior que
        <=  menor ou igual que
        >=  maior ou igual que
        ==  igual
        !=  diferente
    */
    
    int num1 = 2;
    int num2 = 3;
    int num3 = 2;
    
    boolean diferente = (num1 != num2);
    System.out.println(num1 + " != " + num2 + " : "+diferente);
    
    boolean igual = (num1 == num3);
    System.out.println(num1 + " == " + num3 + " : "+igual);
    
    boolean iguais = (num2 <= num3);
    System.out.println(num2 + " <= " + num3 + " : "+iguais);
    
    }
}
