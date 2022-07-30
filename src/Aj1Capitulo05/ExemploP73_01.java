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
public class ExemploP73_01 {
    public static void main(String[] args) {
        byte b = -127;
        int inteiro = 12;
        char caractere = 'f';
        long numeroLong = 901;
        float numeroFloat = 990.99f;
        double numeroDouble = 90.98;
        
        System.out.println("byte = "+b);
        System.out.println("int = "+inteiro);
        System.out.println("char = "+caractere);
        System.out.println("long = "+numeroLong);
        System.out.println("float = "+numeroFloat);
        System.out.println("double = "+numeroDouble);
        
        //upcasting - casting implicito (char para int)
        inteiro = caractere;
        System.out.println("caractere 'f' sendo visto como inteiro =  "+inteiro);
        
        //byte para int
        inteiro = b;
        System.out.println("byte -127 sendo visto como inteiro = "+inteiro);
        
        //downcasting - casting tem que ser explicito (float para int)
        inteiro = (int)numeroFloat;
        System.out.println("float 990.99f sendo visto como inteiro = "+inteiro);
        
        //downcasting - casting tem que ser explicito (int para byte)
        b = (byte)inteiro;
        System.out.println("inteiro '"+inteiro+"'sendo visto como byte = "+b);
    }
}
