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
public class ExercicioP107_02 {
    public static void main(String[] args) {
        char letraF = 'F';
        char letraZ = 'Z';
        int letraFNumInicio = (int)letraF;
        int letraZNumFim = (int)letraZ;
        
        while (letraFNumInicio <= letraZNumFim) {            
            System.out.print((char)letraFNumInicio+" ");
            letraFNumInicio++;
        }
    }
}
