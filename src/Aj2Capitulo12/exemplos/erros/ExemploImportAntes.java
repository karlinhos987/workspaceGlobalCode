import java.util.Date;

package Aj2Capitulo12.exemplos.erros;

/**
 * @author karlinhos987
 *
 */

//ExemploP279_01

//erro por ao realziar o import no local errado. O import deve vir depois da package
public class ExemploFaltaImport{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
    }
}