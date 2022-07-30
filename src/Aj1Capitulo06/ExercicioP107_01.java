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
public class ExercicioP107_01 {
    public static void main(String[] args) {
        String sexo = "M";
        String nome = "Teste";
        String rg = "00.000.000-99";
        String sexoPorExtenso = new String();
        String print = new String();
        
        int anoNascimento;
        int idade = 28;
        int anoAtual = 2015;
        
        double salario = 2000.00;
        double aliquota = 13.00;
        double impostoDevido;
        
        anoNascimento = anoAtual - idade;
        
        //sexoPorExtenso += (sexo.equals("M")) ? "Masculino" : "Femino";
        if(sexo.equals("M")){
            sexoPorExtenso = "Masculino";
        }else{
            sexoPorExtenso = "Femino";
        }
        
        impostoDevido = salario * (aliquota/100);
        
        switch (sexo){
            case "M":
                    print += "O Senhor " + nome + ", de " + idade + " anos, nascido no ano de " + anoNascimento + ", \nportador"
                + " do RG de numero " + rg + ", do sexo " + sexoPorExtenso + ", está registrado"
                + " com salario de R$ " + salario + ", \natualmente paga " + aliquota + "% de imposto, o valor do imposto que devera pagar"
                + " sera de " + impostoDevido;
                break;
                
            case "F":
                    print+= "O Senhora " + nome + ", de " + idade + " anos, nascida no ano de " + anoNascimento + ", \nportadora"
                + " do RG de numero " + rg + ", do sexo " + sexoPorExtenso + ", está registradoa"
                + " com salario de R$ " + salario + ", \natualmente paga " + aliquota + "% de imposto, o valor do imposto que devera pagar"
                + " sera de " + impostoDevido;
                break;
                
            default:
                    print += "O Senhor(a) " + nome + ", de " + idade + " anos, nascido no ano de " + anoNascimento + ", \nportador(a)"
                + " do RG de numero " + rg + ", do sexo " + sexoPorExtenso + ", está registrado(a)"
                + " com salario de R$ " + salario + ", \natualmente paga " + aliquota + "% de imposto, o valor do imposto que devera pagar"
                + " sera de " + impostoDevido;
                break;
        }
        
        System.out.println(print);
    }
}
