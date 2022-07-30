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
public class ExemploP72_01 {
    public static void main(String[] args) {
        
        //cast de int para double (int eh menor do que double -> cast
        //automatico) por defaul 125 eh int
        double d = 125;
        System.out.println("int 125 convertido automaticamente para double "+d);
        
        //cast de int para char (int eh maior que char -> cast explicito)
        //mas neste caso eh um literal, entao o cast eh automatico, pois o 
        //compilador verifica a compatibilidade
        char c = 2154;
        System.out.println("literal 2154(int) convertido automaticamente para char = "+c);
        
        //cast de char para short (cast automatico)
        short s = 'a';
        System.out.println("char 'a' convertido automaticamente para short "+s);
        
        //cast de char para byte (byte eh menor que char -> cast explicito)
        //mas novamente estamos utilizando um literal ('a') entao a conversao
        //eh automantica
        byte b = 'a';
        System.out.println("char 'a' (literal) convertido automaticamente para byte "+b);
        
        //cast de float para int (float eh maior que int -> cast explicito)
        int i = (int)5658.0f;
        System.out.println("float 5658.0f convertido explicitamente para int "+i);
    }
}
