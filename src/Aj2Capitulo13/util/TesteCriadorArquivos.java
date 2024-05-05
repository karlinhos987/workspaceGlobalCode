/**
 * 
 */
package Aj2Capitulo13.util;


import java.io.IOException;

import Aj2Capitulo13.util.erros.CriadorArquivos2;
/**
 * @author karlinhos987
 *
 */

//ExemploP318_01
public class TesteCriadorArquivos {
	public static void main(String[] args) {
		try {
			CriadorArquivos2 ca = new CriadorArquivos2();
			ca.criarArquivo("Teste.txt");
		}catch(IOException e) {
			System.out.println("-----------Tratamento de Erro-----------");
			System.out.println("Não foi possivel criar o arquivo! "+e.getMessage() );
			System.out.println("----------------------------------------");
		}
	}
}
