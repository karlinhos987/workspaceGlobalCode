package Aj2Capitulo11;

//ExemploP245_01
public class Funcionario extends Pessoa{
	private String carteiraProfissional;
	private double salario;
	
	public String getCarteiraProfissional() {return carteiraProfissional;}
	public double getSalario() {return salario;}
	public void setSalario(double salario) {this.salario = salario;}
	public double calculoPagamento() {return salario;}
	
	public void setCarteiraProfissional(String carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}
}