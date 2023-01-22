package Testes.DIO;
//1 / 1 - Checagem de Palíndromos
//Desafio
//Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 
//
//Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 
//
//Logo, NÃO é um Palíndromo. 
//
//Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.


// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        String invertida = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(invertida)){ 
          System.out.println("TRUE");
        }else{ 
          System.out.println("FALSE");
        }
    }
}