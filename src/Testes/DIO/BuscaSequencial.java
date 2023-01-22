package Testes.DIO;
//1 / 1 - Busca Sequencial
//Desafio
//Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso. 
//
//Considere um array de 10 elementos do tipo inteiro: 
//
//Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 
//
//● Carregue esses elementos em um array.  
//
//● Implementação da busca sequencial: 
//
//● Crie um método  que realiza uma busca sequencial.  
//
//● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int numero = 0;
        int i = 0;
        boolean x = false;
        
        numero = leitor.nextInt();
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        
        do{
          if(  numero == elementos[i]){
            System.out.println("Achei "+elementos[i]+" na posicao "+i);
            x = true;
          }
          i++;
        }while(i<elementos.length);
        
        if(!x){
           System.out.println("Numero "+numero+" nao encontrado!");
        }
    }
}