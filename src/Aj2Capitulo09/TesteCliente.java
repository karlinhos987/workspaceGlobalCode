package Aj2Capitulo09;

//ExemploP194_01
public class TesteCliente {
	public static void main(String[] args) {
		Cliente c = new Cliente("Maria", "maria@gc.com.br", Cliente.PESSOA_FISICA);
		
		System.out.println("Tipo de cliente criado = " + c.getTipo());
	}
}
