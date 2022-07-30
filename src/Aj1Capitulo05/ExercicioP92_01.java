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
public class ExercicioP92_01 {
    public static void main(String[] args) {
        String sexo = "M";
        String nome = "Teste";
        String rg = "00.000.000-99";
        String sexoPorExtenso = "";
        
        int anoNascimento;
        int idade = 28;
        int anoAtual = 2015;
        
        double salario = 2000.00;
        double aliquota = 13.00;
        double impostoDevido;
        
        anoNascimento = anoAtual - idade;
        
        sexoPorExtenso += (sexo.equals("M")) ? "Masculino" : "Femino";
        
        impostoDevido = salario * (aliquota/100);
        
        System.out.println("O Senhor(a) " + nome + ", de " + idade + " anos, nascido no ano de " + anoNascimento + ", portador(a)"
                + " do RG de numero " + rg + ", do sexo " + sexoPorExtenso + ", está registrado(a)"
                + " com salario de R$ " + salario + ", atualmente paga " + aliquota + "% de imposto, o valor do imposto que devera pagar"
                + " sera de " + impostoDevido);
        
    }
}
