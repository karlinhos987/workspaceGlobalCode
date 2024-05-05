/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Aj3Capitulo02.beans.Pessoa5;

/**
 * @author karlinhos987
 *
 */

//ExemploP105_01
public class TesteHashMap {
	public static void main(String[] args) {
		Pessoa5 p1 = new Pessoa5("Joao Silva",111L,"01/01/1995");
		Pessoa5 p2 = new Pessoa5("Joao da Silva",222L,"02/02/1987");
		Pessoa5 p3 = new Pessoa5("Joana Soares",333L,"04/07/1999");
		
		Map pessoas = new HashMap();
		pessoas.put(p1.getRg(), p1);
		pessoas.put(p2.getRg(), p2);
		pessoas.put(p3.getRg(), p3);
		
		imprimeMap(pessoas);
		removeElemento(pessoas, 222L);
		imprimeMap(pessoas);
	}
	
	public static void imprimeMap(Map map) {
		System.out.println("\n==========Impressao do Map==========\n");
		Set chaves = map.keySet();
		Iterator i = chaves.iterator();
		
		//atraves do Iterador i  vamos navegar no Set chaves
		while(i.hasNext()) {
			//recuperando as chaves armazenadas no Set para entao obter
			//o valor associado
			Long chave = (Long) i.next();
			
			//recuperando o objeto pessoa atraves do rg
			System.out.println("[Chave]: " + chave);
			System.out.println(map.get(chave) + "\n");
		}
	}
	
	public static void removeElemento(Map map, Long chave){
		Pessoa5 valorRemovido = null;
		
		//verificando se a chave existe no HashMap
		if(map.containsKey(chave)) {
			System.out.println("\n==========Removendo Elemento do Map==========\n");
			
			//lembrar de fazer cast de objetos que vem do HashMap
			valorRemovido = (Pessoa5)map.remove(chave);
			System.out.println("Valor removido: " + valorRemovido);
		}else {
			System.out.println("Chave nao encontrada no HashMap");
		}
	}
}
