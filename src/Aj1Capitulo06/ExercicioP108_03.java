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
public class ExercicioP108_03 {
    public static void main(String[] args) {
        
        int limiteInferior = 100;
        int limiteSuperior = 200;
        int numerosDiv6 = 0;
        
        for (int i = 100; i <= 200; i++) {
            if((i % 2) == 0){
                System.out.println(i + " é divisivel por 2");
            }else if((i % 3) == 0){
                System.out.println(i + " é divisivel por 3");
            }
            if( ((i % 2) == 0) && ((i % 3) == 0) ){
                System.out.println(i + " é divisivel por 2 e 3");
            } 
        }
        
        while(limiteInferior <= limiteSuperior){
            if( ((limiteInferior % 2) == 0) && ((limiteInferior % 3) == 0) ){
                numerosDiv6++;
            }
            limiteInferior++;
        }
        
        System.out.println("Quantidade de numeros divisiveis por 6 é igual a " + numerosDiv6);
    }
}
