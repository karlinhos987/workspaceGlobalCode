package Testes.DIO;
//1 / 1 - Quadrados Perfeitos
//Desafio  
//Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        for (int i = 0; i <= n; i++){
            // inicializa d[i] com o máximo de quadrados possível
            d[i] = i;
 
            // percorre todos os inteiros positivos menores ou iguais ao
            // raiz quadrada de `i`
            for (int j = 1; j*j <= i; j++){
                // calcula o valor de T[i] usando o resultado de um menor
                // subproblema T[i-j×j]
                d[i] = Integer.min(d[i], 1 + d[i - j*j]);
            }
        }
        
        System.out.println(d[n]);
    }
}