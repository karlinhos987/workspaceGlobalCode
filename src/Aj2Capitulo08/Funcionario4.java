package Aj2Capitulo08;

public class Funcionario4 extends Pessoa4 {
	private long carteiraProssional;
	private double salario;
	private String dataAdmissao;
	
	
	public Funcionario4(Endereco4 endereco, String nome, String rg, long carteira, double salario, String dtAdmissao) {
		//System.out.println("");
		//o construtor da classe super deve ser a primeira instrucao
		super(endereco, nome, rg);
		this.setCarteiraProssional(carteira);
		this.setSalario(salario);
		this.setDataAdmissao(dtAdmissao);
	}
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
	
	public void imprime() {
		System.out.println("\n\nImprimindo dados do funcionario");
		super.imprime();
		System.out.println("\nCarteira profissional: " + carteiraProssional);
		System.out.println("Salario: " + salario);
		System.out.println("Data de Admissao: " + dataAdmissao);
	}
	
}
