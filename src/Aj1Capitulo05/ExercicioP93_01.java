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
public class ExercicioP93_01 {
    public static void main(String[] args) {
        boolean c = false;
        String str = (c =! c) ? ((c =! c) ? "Hello" : "hello") : ((c =! c) ? "world" : "World");
        System.out.println(str);
    }
}
