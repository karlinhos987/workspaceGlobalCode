/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo07;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ExercicioP129_01 {
    public static void main(String[] args) {
        
        //Array cliente
        String[] arrayCliente = new String[3];
        
        String cliente = new String();
        
        Scanner ler = new Scanner(System.in);
        
        for (int i = 0; i < arrayCliente.length; i++) {
            System.out.printf("Informe o email do cliente:\n"); 
            cliente = ler.nextLine();
            arrayCliente[i] = cliente;
        }
        
        int i = 1;
        
        for (String valor : arrayCliente) {
            System.out.println("Cliente " + i++ + " - " + valor);
        }

    }

    
}
