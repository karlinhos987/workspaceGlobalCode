/**
 * 
 */
package Aj3Capitulo01.testes;

import java.beans.DefaultPersistenceDelegate;

/**
 * @author karlinhos987
 *
 */

//ExemploP22_01
public class DemoConcatenacao {
	public static void main(String[] args) {
		//lendo a qtde de iteracoes da linha de comando
		int qtde = Integer.parseInt(args[0]);
		
		//currentTimesMillis() retorna um long com o numero de ms desde
		//01/01/1970
		long inicio = System.currentTimeMillis();
		concatenaString(qtde);
		
		//captura o tempo final em ms
		long fim = System.currentTimeMillis();
		
		System.out.println("Classe String <=====>");
		System.out.println("Tempo total de processamento: " + (fim-inicio)+ "ms");
		
		inicio = System.currentTimeMillis();
		concatenaStringBuffer(qtde);
		fim = System.currentTimeMillis();
		System.out.println("Classe StringBuffer <=====>");
		System.out.println("Tempo total de processamento: " + (fim-inicio)+ "ms");
		
		inicio = System.currentTimeMillis();
		concatenaStringBuilder(qtde);
		fim = System.currentTimeMillis();
		System.out.println("Classe StringBuilder <=====>");
		System.out.println("Tempo total de processamento: " + (fim-inicio)+ "ms");
	}
	
	private static void concatenaString(int numConcatenacoes) {
		String s = "";
		for(int i=0; i<= numConcatenacoes; i++) {
			s = s +i;
		}
	}
	
	private static void concatenaStringBuffer(int numConcatenacoes) {
		StringBuffer s = new StringBuffer("");
		for(int i=0; i<= numConcatenacoes; i++) {
			s.append(i);
		}
	}
	
	private static void concatenaStringBuilder(int numConcatenacoes) {
		StringBuilder s = new StringBuilder("");
		for(int i=0; i<= numConcatenacoes; i++) {
			s.append(i);
		}
	}
}
