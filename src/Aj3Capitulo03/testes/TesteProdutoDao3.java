/**
 * 
 */
package Aj3Capitulo03.testes;

import java.util.Iterator;
import java.util.List;

import Aj3Capitulo03.beans.Produto;
import Aj3Capitulo03.dao.ProdutoDao3;

/**
 * @author karlinhos987
 *
 */

//ExemploP155_01
public class TesteProdutoDao3 {
	public static void main(String[] args) throws Exception{
		ProdutoDao3 pDao = new ProdutoDao3();
		
		if(args.length == 1) {
			int id = Integer.parseInt(args[0]);
			int qtdeRemovidos = pDao.delete(id);
			System.out.println(qtdeRemovidos + " produto(s) removido(s).");
		}else {
			List produtos = pDao.getAllProdutos();
			System.out.println("Foram encontrados " + produtos.size() + " produto(s)");
			
			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i));
			}
		}
	}
}
