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
public class ExemploP101_01 {
    public static void main(String[] args) {
        int diaSemana = 5;
        
        switch (diaSemana){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terca-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                //neste caso as operacoes sao executadas sequencialmente ate
                //que seja encontrado um break
                System.out.println("Sexta-Feira");
                System.out.println("Hoje eh dia de balada");
                //sem break, executado case '5'e '6'
                //break;
            case 6:
                System.out.println("Sabado");
                System.out.println("Hoje ainda eh dia de balada");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
