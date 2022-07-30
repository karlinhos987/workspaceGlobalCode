package Aj2Capitulo09;

//ExemploP197_01
public class TesteMes {
	public static void main(String[] args) {
		Mes mes = Mes.JANEIRO;
		
		String mensagem = (mesFeriasEscolares(mes)? " " : "nao") + "EH mes de ferias escolares";
		System.out.println(mes + mensagem);
	}
	
	public static boolean mesFeriasEscolares(Mes mes) {
		switch (mes) {
		case DEZEMBRO:
		case JANEIRO:
		case FEVEREIRO:
		case JULHO:
			return true;
		default:
			return false;
		}
	}
}
