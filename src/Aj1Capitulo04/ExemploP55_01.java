/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo04;

/**
 *
 * @author karlinhos
 */
public class ExemploP55_01 {
    public static void main(String[] args) {
        /* Numeros de ponto flutuante: float e double
           padrao IEE754
           Tipo     Valor Minimo        Valor Maximo       Byte
           float    1.4e�45             3.4e�38            4
           double   4.9e�324            1.7e�308           8
        */
        
        float f = 10F;
        System.out.println("float f = 10F => f = "+f);
        
        float f2 = 10.45454f;
        System.out.println("float f2 = 10.45454f => f2 = "+f2);
        
        double d = 12565484546d;
        System.out.println("double d = 12565484546d => d = "+d);
        
        double d2 = 12565484546.0;
        System.out.println("fdouble d2 = 12565484546.0 => d2 = "+d2);
    }
}
