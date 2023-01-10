package Aj2Capitulo10;

//ExemploP206_01
public class TesteRecibo {
	public static void main(String[] args) {
		FormatadorRecibo fr = new FormatadorRecibo();
		
		fr.setNomeEmpresa("TESTE");
		String texto = fr.gerarRecibo("TESTE1", 200.0, "01/01/2020", "TESTANDO");
	}
}
