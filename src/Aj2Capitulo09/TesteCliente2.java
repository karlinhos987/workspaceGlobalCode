package Aj2Capitulo09;

//ExemploP196_01
public class TesteCliente2 {
	public static void main(String[] args) {
		Cliente2 c = new Cliente2("Maria", "maria@gc.com.br", Cliente2.TipoCliente.PESSOA_FISICA);
		
		System.out.println("Tipo de cliente criado = " + c.getTipo());
	}
}
