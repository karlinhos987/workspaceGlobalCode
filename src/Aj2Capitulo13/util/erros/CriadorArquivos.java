/**
 * 
 */
package Aj2Capitulo13.util.erros;


import java.io.File;
/**
 * @author karlinhos987
 *
 */

//ExemploP314_01
public class CriadorArquivos {
	public void criarArquivo(String name) {
		//Criacao de um objeto da classe File representando o arquivo
		//com o nome name
		File f = new File(name);
		
		//Tentativa de criar um arquivo em disco
		f.createNewFile();
	}
}
