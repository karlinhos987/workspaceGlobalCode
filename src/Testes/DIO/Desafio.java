package Testes.DIO;
//1 / 1 - Os Números São Iguais
//Desafio
//Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
      int A = 0;
      int B = 0;
      
      Scanner sc = new Scanner(System.in);
      A = sc.nextInt();
      
      B = sc.nextInt();
      
      if(A == B){
        System.out.println("Sao iguais!");
      }else{
        System.out.println("Nao sao iguais!");
      }
    }
}