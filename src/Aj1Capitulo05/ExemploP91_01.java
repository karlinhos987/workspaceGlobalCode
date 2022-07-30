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
public class ExemploP91_01 {
    public static void main(String[] args) {
        //Operador Ternario
        //int a = 2;
        //int b = 3;
        //int c = 4;
        //a = b>c ? b : c;
        //A expressao do lado esquerdo da '?'eh avaliada (no caso b>c)
        //se 'b' eh maior que 'c', entao 'a = b';
        //se 'b' eh menor ou igual a 'c', entao 'a = c';
        
        //dessa maneira percebemos que 'a = b>c ? b : c seria igualmente representado com o seguinte codigo'
        //if(b>c){
        //  a=b;
        //}else{
        //  a = c;
        //}
        
        //Se o resto foi igual a '0' entao o numero eh par, se o resto for maior que '0' entao o numero impar
        String mensagem = "O número é ";
        int numero = 15;
        int resto = numero % 2;
        mensagem += (resto == 0) ? " Par" : " Impar";
        
        System.out.println(mensagem);
    }
}
