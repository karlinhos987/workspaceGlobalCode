package Testes.DIO;
//1 / 1 - Validação de Parênteses
//Desafio
//Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
  
        for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == '('){
            if(s.charAt(i+1) == ')'){
              return true;
            }
          }else if(s.charAt(i) == '['){
            if(s.charAt(i+1) == ']'){
              return true;
            }
          }else if(s.charAt(i) == '{'){
            if(s.charAt(i+1) == '}'){
              return true;
            }
          }
        }
        return false;
    }
}