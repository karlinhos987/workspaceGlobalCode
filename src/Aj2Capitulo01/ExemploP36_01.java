package Aj2Capitulo01;

public class ExemploP36_01 {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		System.out.println("Valores iniciais para data1");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mes: " + data1.mes);
		System.out.println("Ano: " + data1.ano);
		
		ExemploP36_01 testador = new ExemploP36_01();
		testador.alteraData(data1);
		
		System.out.println("Valores atuais para data1");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mes: " + data1.mes);
		System.out.println("Ano: " + data1.ano);
	}	
	
	void alteraData(Data data2) {
		data2.dia = 29;
		data2.mes = 4;
		data2.ano = 2019;
	}
}
