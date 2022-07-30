package Aj2Capitulo06;

public class ExemploP123_01 {
	private static int qtdLogs;
	
	public static void logIt(String mensagem){
		String dataHora = "" + new java.util.Date();
		System.out.println(dataHora + " : " + qtdLogs + " : " + mensagem);
		qtdLogs++;
	}
}
