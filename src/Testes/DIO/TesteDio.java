package Testes.DIO;

import java.util.Scanner;

public class TesteDio {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n=n-1;
        while (n > 0) {
            //TODO: Calcule o valor do fatorial de "n", atrinbuindo o retorno a "r".
            
          if(cnt == 1){
            System.out.println("Dentro do while"+n);
            tmp = tmp * n;
            cnt = 2;
            n=n-1;
            
          }else if(cnt == 2){
            System.out.println(n);
            tmp = tmp / n;
            cnt = 3;
            n=n-1;
          }else if(cnt == 3){
            System.out.println(n);
            tmp = tmp + n;
            cnt = 4;
            n=n-1;
          }else if(cnt == 4){
            System.out.println(n);
            tmp = tmp - n;
            cnt = 1;
            n=n-1;
          }
        }
        res = tmp;
        System.out.println(res);
    }
}
