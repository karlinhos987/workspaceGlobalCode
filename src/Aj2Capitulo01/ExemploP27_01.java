/*
 * ExemploP17_01
 *
 */

package Aj2Capitulo01;

public class ExemploP27_01 {
	int dia, mes, ano;
	
	boolean isAnoBissexto() {
		if(((ano % 4 == 0) && !(ano % 100 == 0) || (ano % 400 == 0))){
			return true;
		}else {
			return false;
		}
	}
	
	void imprime() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
