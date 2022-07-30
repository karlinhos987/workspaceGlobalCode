/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo05;

import java.util.Scanner;

/**
 *
 * @author karlinhos
 */
public class ExemploP84_01 {
    public static void main(String[] args) {
        String nome = "";
        Scanner scan = new Scanner(System.in);
        
        if(scan instanceof Scanner){
            System.out.println("scan é do tipo Scanner");
        }else{
            System.out.println("scan não é do tipo Scanner");
        }
        
        
        if(nome instanceof String){
            System.out.println("nome eh String");
        }else{
            System.out.println("nome nao eh String");
        }
    }
}
