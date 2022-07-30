/*
 * ExemploP17_01
 *
 */

package Aj2Capitulo01;

public class ExemploP63_01 {
	private int dia, mes, ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	boolean isAnoBissexto() {
		if(((getAno() % 4 == 0) && !(getAno() % 100 == 0) || (getAno() % 400 == 0))){
			return true;
		}else {
			return false;
		}
	}
	
	void imprime() {
		System.out.println(getDia() + "/" + getMes() + "/" + getAno());
	}
}
