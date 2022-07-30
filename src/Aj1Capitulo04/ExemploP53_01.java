/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo04;

/**
 *
 * @author karlinhos
 */
public class ExemploP53_01 {
    public static void main(String[] args) {
        /* Tipo     Valor Minimo        Valor Maximo       Byte
           byte     -128                127                1
           short    -32768              32767              2
           int      -2147483648         2147483647         4
           long     -922337203685475808 922337203685475807 8
        */
        
        int i = 10;
        System.out.println("int i = 10 => i = "+i);
        
        long l = 2566L;
        System.out.println("long l = 2566L => l = "+l);
        
        long l2 = 2236565656l;
        System.out.println("long l2 = 2236565656l => l2 = "+l2);
        
        byte b = (byte)123;
        System.out.println("byte b = (byte)123 => b = "+b);
        
        byte b2 = (byte)123568545;
        System.out.println("byte b2 = (byte)123568545 => b2 = "+b2);
        
        short s = (short)12565;
        System.out.println("short s = (short)12565 => s = "+s );
        
        short s2 = (short)1231321;
        System.out.println("short s2 = (short)12565 => s2 = "+s2 );
                
    }
}
