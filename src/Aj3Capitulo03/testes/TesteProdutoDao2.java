/**
 * 
 */
package Aj3Capitulo03.testes;

import java.util.Iterator;
import java.util.List;

import Aj3Capitulo03.beans.Produto;
import Aj3Capitulo03.dao.ProdutoDao2;

/**
 * @author karlinhos987
 *
 */

//ExemploP149_01
public class TesteProdutoDao2 {
	public static void main(String[] args) throws Exception{
		ProdutoDao2 pDao = new ProdutoDao2();
		
		if(args.length == 1) {
			int id = Integer.parseInt(args[0]);
			Produto produto = pDao.getProduto(id);
			
			if(produto != null) {
				System.out.println("O produto encontrado foi...");
				System.out.println(produto);
			}else {
				System.out.println("O produto nao foi encontrado");
			}
		}else {
			List produtos = pDao.getAllProdutos();
			System.out.println("Foram encontrados " + produtos.size() + " produto(s)");
			
			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i));
			}
		}
	}
}
