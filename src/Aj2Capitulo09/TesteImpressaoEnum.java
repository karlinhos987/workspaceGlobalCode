package Aj2Capitulo09;

import java.util.Iterator;

//ExemploP198_01
public class TesteImpressaoEnum {
	public static void main(String[] args) {
		Cliente2 c = new Cliente2("Carlos", "karlinhos987@hotmail.com",Cliente2.TipoCliente.PESSOA_FISICA);
		
		System.out.println("Tipos de cliente");
		
		for (Cliente2.TipoCliente tipo : Cliente2.TipoCliente.values()) {
			System.out.println(tipo);
		}
	}
	
}
