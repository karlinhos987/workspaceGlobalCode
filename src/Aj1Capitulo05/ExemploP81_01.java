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
public class ExemploP81_01 {
    public static void main(String[] args) {
        System.out.println("Sem regras de deslocamento");
        
        int numero = -17;
        System.out.print(Integer.toBinaryString(numero));
        System.out.println(" = "+numero);
        
        int resultado = numero >>> 1;
        System.out.print(Integer.toBinaryString(resultado));
        System.out.println(" = "+resultado);
        
        resultado = resultado >>> 1;
        System.out.print(Integer.toBinaryString(resultado));
        System.out.println(" = "+resultado);
        
        resultado = resultado >>> 1;
        System.out.print(Integer.toBinaryString(resultado));
        System.out.println(" = "+resultado);
        
        resultado = resultado >>> 1;
        System.out.print(Integer.toBinaryString(resultado));
        System.out.println(" = "+resultado);
        
        resultado = resultado >>> 1;
        System.out.print(Integer.toBinaryString(resultado));
        System.out.println(" = "+resultado);
    }    
}
