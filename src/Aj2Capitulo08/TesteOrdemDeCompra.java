package Aj2Capitulo08;

//ExemploP184_02
public class TesteOrdemDeCompra {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Carlos Roberto de Oliveira Jr");
		OrdemDeCompra ordem = new OrdemDeCompra(cliente);
		
		//� poss�vel alterar os dados do cliente
		ordem.cliente.setNome("Thais Pazelli");
		
		//n�o � poss�vel atribuir um novo cliente ao pedido
		Cliente cliente2 = new Cliente("Luiza Lima");
		//ordem.cliente = cliente2;
		
	}
}
