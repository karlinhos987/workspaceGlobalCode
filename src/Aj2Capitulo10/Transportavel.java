package Aj2Capitulo10;

//ExemploP222_01
public interface Transportavel {

	/*
	 * Em uma interface todos os atributos sao FINAL e STATIC por DEFAULT
	 * */
	public static final String UNIDADE_VOLUME = "cm3";
	public String UNIDADE_PESO = "kg";
	
	public double getVolume();
	public double getPeso();
	public int getEmpilhamentoMaximo();
}
