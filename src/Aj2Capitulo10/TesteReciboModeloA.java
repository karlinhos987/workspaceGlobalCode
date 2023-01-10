package Aj2Capitulo10;

//ExemploP207_01
public class TesteReciboModeloA {
	public static void main(String[] args) {
		FormatadorModeloA fa = new FormatadorModeloA();
		
		fa.setNomeEmpresa("TESTE");
		String texto = fa.gerarRecibo("TESTE1", 200.0, "01/01/2020", "TESTANDO");
		
		System.out.println(texto);
	}
}
