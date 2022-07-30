/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo06;

/**
 *
 * @author karlinhos
 */
public class ExemploP109_01 {
    public static void main(String[] args) {
        double valorTotal = 15000;
        
        System.out.println("Valor total = " + valorTotal);
        
        for (int numeroParcelas = 10; numeroParcelas < 20; numeroParcelas++) {
            double parcela = valorTotal/numeroParcelas;
            
            if(parcela < 1000){
                System.out.println("Nao é possivel parcelar em mais vezes, " +
                        "pois não é permitido parcelas < 1000");
                break;
            }
            System.out.println(numeroParcelas + " parcelas de " + parcela);
        }
    }
}
