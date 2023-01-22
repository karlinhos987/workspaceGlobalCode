package Testes.DIO;
//1 / 1 - Classificando Matrizes
//Desafio
//Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
//
//Retorne um array que satisfaça essa condição.

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
          
    Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[] nums = new int[N];
        int auxValorImpar = 0;
        
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (nums[i]%2 != 0) {
                auxValorImpar = nums[i];
                for (int j = 0; j < N; j++) {
                    if ((nums[j]%2 == 0)&&(j>i)) {
                        nums[i] = nums[j];
                        nums[j] = auxValorImpar;
                        break;
                    }
                }
            }
            System.out.println(nums[i]);
        }
        input.close();
  }
}