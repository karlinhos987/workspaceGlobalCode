package Aj2Capitulo10;

//ExemploP207_01
public class TesteReciboModeloA2 {
	public static void main(String[] args) {
		FormatadorModeloA2 fa = new FormatadorModeloA2();
		
		fa.setNomeEmpresa("TESTE");
		fa.setSimboloMoeda("Euro$");
		String texto = fa.gerarRecibo("TESTE1", 200.0, "01/01/2020", "TESTANDO");
		
		System.out.println(texto);
	}
}
