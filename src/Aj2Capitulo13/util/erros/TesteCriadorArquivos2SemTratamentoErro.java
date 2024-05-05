/**
 * 
 */
package Aj2Capitulo13.util.erros;

import java.io.IOException;

/**
 * @author karlinhos987
 *
 */

//ExemploP318_01
public class TesteCriadorArquivos2SemTratamentoErro {
	public static void main(String[] args) {
		try {
			CriadorArquivos2 ca = new CriadorArquivos2();
			ca.criarArquivo("teste.txt");
		}catch(IOException e) {
			System.out.println("---------Tratamento do erro---------");
			System.out.
					println("Não foi possivel criar o arquivo: "+e.getMessage());
			System.out.println("------------------------------------");
		}	
	}
}
