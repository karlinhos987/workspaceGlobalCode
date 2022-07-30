package Aj2Capitulo01;

public class ExemploP63_02 {
	public static void main(String[] args) {
		ExemploP57_01 data = new ExemploP57_01();
		
		data.setDia(25);
		data.setMes(6);
		data.setAno(2024);
		data.imprime();
		
		String s = data.isAnoBissexto() ? "" : " nao ";
		
		System.out.println("O ano " + data.getAno() + s + " e bissexto ");
	}
}
