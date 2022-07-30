package Aj2Capitulo08;

//ExemploP181_01
public class ContaPoupanca {

	protected double saldo;
	
	public ContaPoupanca(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	//não permitirá a sobrescrita
	public final void saque(double valor) {
		if(saldo > valor) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insulficiente");
		}
	}
}
