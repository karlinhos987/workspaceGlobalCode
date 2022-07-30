package Aj2Capitulo08;

//ExemploP182_01
//O codigo abaixo n�o ir� compilar, pois no construtor da classe � atriubuido um valor
//para a vari�vel CODIGO, sendo ela do tipo FINAL e a existencia do metodo	
public class Pedido {
	public final static int NOVO = 1;
	public final static int APROVADO = 2;
	public final static int CANCELADO = 3;
	
	private final int codigo;
	private int status;
	
	public Pedido(int cod) {
		this.codigo = cod;
		this.setStatus(Pedido.NOVO);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}
	
	//public void setCodigo(int codigo) {
	//	this.codigo = codigo;
	//}
	
}
