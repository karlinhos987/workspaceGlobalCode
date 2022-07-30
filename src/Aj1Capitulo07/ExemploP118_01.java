/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aj1Capitulo07;

/**
 *
 * @author Carlos
 */
public class ExemploP118_01{
    
    /*
    Inicializacao default de arrays
    byte      = 0
    short     = 0
    int       = 0
    long      = 0
    float     = 0
    double    = 0
    char      = '\u0000'
    boolean   = False
    reference = null
    */
    
    public static void main(String[] args) {
        // Declaracao de um array e inicializacao
        float[] teste = {1F, 2.5F, 3F, 4.12F, 5.6F};
        
        System.out.println("--- Imprimindo os elementos do array ---");
        for (int i = 0; i < teste.length; i++) {
            // Para acessarmos as linhas da matriz, utilizamos: teste[posicao]
            System.out.println(teste[i]);
        }
        
        // numero de caracteres do alfabeto
        int numeroCaracteres = 26;
        
        // caractere ASCII da letra 'A'
        int ascCaractereA = 65;
        
        // criarmos um array de char com 26 posicoes
        // as duas declaracoes abaixo sao verdadeiras
        // char[] arrayCaractere = new char[numeroCaracteres];
        char arrayCaractere[] = new char[numeroCaracteres];
        
        // vamos inicializar o array com as letras do alfabeto
        for (int i = 0; i < numeroCaracteres; i++) {
            arrayCaractere[i] = (char)(ascCaractereA + i);
        }
        
        System.out.println(arrayCaractere);
    }
}
