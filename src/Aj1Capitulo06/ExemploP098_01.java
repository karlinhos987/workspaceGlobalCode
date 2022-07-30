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
public class ExemploP098_01 {
    public static void main(String[] args) {
        int x = 6;
        
        //estrutura if else
        if((x > 0) && (x % 2 == 0)){
            System.out.println("x eh positivo e divisivel por 2");
        }else{
            System.out.println("x eh negativo ou nao eh divisivel por 2");
        }//end if
        
        //estrutura if else
        if(x % 2 == 0){
            System.out.println(x + " eh divisivel por 2");
            if(x % 3 == 0){
                System.out.println(x + " tambem eh divisivel por 3");
            }
        }// end if
        
        
        if(x > 0){
            System.out.println("x eh POSITIVO");
        }else if(x < 0){
            System.out.println("x eh NEGATIVO");
        }else{
            System.out.println("X eh igual a ZERO");
        }
    }
}
