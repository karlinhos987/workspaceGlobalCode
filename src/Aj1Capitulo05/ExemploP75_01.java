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
public class ExemploP75_01 {
    public static void main(String[] args) {
        int a = 12345;
        int b = 222222;
        int mod;
        int meuInt;
        long meuLong;
        long meuLongComCast;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        meuInt = a + b;
        System.out.println("a+b (como inteiro) = "+meuInt);
        
        meuInt = a - b;
        System.out.println("a-b (como inteiro) = "+meuInt);
        
        meuInt = a * b;
        System.out.println("a*b (como inteiro) = "+meuInt);
        
        //a*b eh promovido a int antes de ser atribuido a meuLong
        meuLong = a * b;
        System.out.println("a*b (armazenados em um long) = "+meuLong);
        
        //Como a variavel a eh explicitamente convertida para um long, 
        //o resultado do produto torna-se um long
        meuLongComCast = (long)a * b;
        System.out.println(" a*b (como long) = "+meuLongComCast);
        //o resultado da operacao a*b eh feita como um long
        
        meuLongComCast = (long)a / b;
        System.out.println(" a/b (como long) = "+meuLongComCast);
        
        //operador mod => resto da divisao de b por a
        mod = 12 % 4;
        System.out.println("12 % 4 ="+mod);
        //operador mod => resto da divisao de b por a
        
        mod = 15 % 2;
        System.out.println("15 % 2 = "+mod);
    }
}
