
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP252_01
public class TesteParametroPolimorfico {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("TESTE_PESSOA");
		p.setRg(1234567890);
		
		Cliente c = new Cliente();
		c.setNome("TESTE_CLIENTE");
		c.setRg(1234567890);
		c.setCpf("123456789-00");
		
		Funcionario f = new Funcionario();
		f.setNome("TESTE_FUNCIONARIO");
		f.setRg(1234567890);
		f.setSalario(3000.00);
		f.setCarteiraProfissional("1234567890");
		
		RelatorioPessoa rel = new RelatorioPessoa();
		rel.imprime(p);
		rel.imprime(c);
		rel.imprime(f);
	}
}
