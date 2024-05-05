/**
 * 
 */
package Aj2Capitulo13.util.erros;


import java.io.File;
import java.io.IOException;
/**
 * @author karlinhos987
 *
 */

//ExemploP315_01
public class CriadorArquivos2 {
	public void criarArquivo(String name) throws IOException {
		//Criacao de um objeto da classe File representando o arquivo
		//com o nome name
		File f = new File(name);
		
		//Tentativa de criar um arquivo em disco
		f.createNewFile();
		System.out.println("Arquivo criado: " + name);
	}
}
