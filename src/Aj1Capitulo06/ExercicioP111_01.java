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
public class ExercicioP111_01 {
    public static void main(String[] args) {
        int y4 = 0;
        
        while(y4++ < 5){
            switch (y4 % 2){
                default:
                    System.out.println("default ");
                    break;
                case 1:
                    System.out.println("1 ");
                    break;
            }
        }
    }
    
}
