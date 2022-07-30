package Aj2Capitulo08;

//ExemploP181_02
public class ContaPoupancaEspecial extends ContaPoupanca{

	protected double limite = 1000;
	
	public ContaPoupancaEspecial(double saldoInicial) {
		super(saldoInicial);
	}
	
	//não permitirá a sobrescrita
	public void saque(double valor) {
		if(saldo + limite > valor) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insulficiente");
		}
	}
}
