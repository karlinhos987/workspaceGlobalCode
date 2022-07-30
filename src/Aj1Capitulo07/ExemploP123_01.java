/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo07;

/**
 *
 * @author Carlos
 */
public class ExemploP123_01 {
    public static void main(String[] args) {
        //Declaracao
        int[][] matriz = new int[2][3];
        
        //Inicializacao elemento a elemento
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 8;
        matriz[1][0] = 3;
        matriz[1][1] = 6;
        matriz[1][2] = 12;
        
        //Impressao
        System.out.println("----------Matriz----------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + i + "," + j + "]="+matriz[i][j]);
            }
        }
        
        //Podemos Inicializar o array inteiro juntamente com a declaracao
        int[][] matriz2 = { {2, 4, 8}, {3, 6, 12} };
        
        //Impressao
        System.out.println("----------Matriz2----------");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("[" + i + "," + j + "]="+matriz2[i][j]);
            }
        }
        
        /*
        Quando trabalhamos com matrizes multidimensionais, cada linha pode ter diferentes tamanhos.
        */
        
        int matriz3[][] = new int [3][];
        int[] temp0 = {1, 2, 3};
        matriz3[0] = temp0;
        
        int[] temp1 = {1, 1, 1, 1, 1, 1};
        matriz3[1] = temp1;
        
        int[] temp2 = {0, 0, 0, 0, 0, 0, 0, 0};
        matriz3[2] = temp2;
        
         //Impressao
        System.out.println("----------matriz3----------");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.println("[" + i + "," + j + "]="+matriz3[i][j]);
            }
        }
    }
}
