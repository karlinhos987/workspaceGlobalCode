package Aj2Capitulo08;

public class Funcionario2 extends Pessoa2 {
	private long carteiraProssional;
	private double salario;
	private String dataAdmissao;
	
	public long getCarteiraProssional() {
		return carteiraProssional;
	}
	public void setCarteiraProssional(long carteiraProssional) {
		this.carteiraProssional = carteiraProssional;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void impressaoRecibo(int dia, int mes, int ano) {
		System.out.println("\n\n--------Recibo de pagamento--------");
		System.out.print("Eu, " + super.nome + ", portador do RG de número: ");
		System.out.print(super.rg + " declaro que recebi o valor de R$ " + salario);
		System.out.print(" referente ao meu pagamento no dia " + dia + "/" + mes + "/" + ano);
		System.out.println("\n--------------------------------------");
	}
	
}
