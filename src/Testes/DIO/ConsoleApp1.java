package Testes.DIO;
//1 / 1 - Fatorial desajeitado
//Desafio
//O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.

import java.util.*;

public class ConsoleApp1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        /*int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
            if (cnt == 1){
                tmp *= n;
                cnt++;

            }else if (cnt == 2) {
                tmp /= n;
                cnt++;

            } else if ((cnt == 3)) {
                tmp += n;
                cnt = 0;

            } else if ((cnt == 0) && (n>3)) {
                tmp-= n*(n-1)/(n-2);
                cnt=3;
                n-= 2;
            }else{
                tmp -= n*(n-1);
                n-=2;
            }
            n--;
        }
        res = tmp;
        System.out.println(res);*/
        ////////
        ////////
        int resultado = 0, cur = n, j = 0;
        char[] operador = new char[]{'*', '/', '+', '-'};
        for (int i = n - 1; i >= 1; --i) {
            if (operador[j] == '*') {
                cur *= i;
            } else if (operador[j] == '/') {
                cur /= i;
            } else if (operador[j] == '+') {
                resultado += i;
            } else {
                resultado += (i == n - 4) ? cur : -cur;
                cur = i;
            }
            j = (j + 1) % 4;
        }
        System.out.println(resultado + ((n <= 4) ? cur : -cur));
        
        
    }
}