package Aj2Capitulo06;

public class ExemploP113_02 {
	public static void main(String[] args) {
		ExemploP113_01 curso1 = new ExemploP113_01("Academia Java", "AJ", 128);
		System.out.println("O curso " + curso1.getNome() + " tem a carga horaria de " + curso1.getCargaHoraria());
		
		ExemploP113_01 curso2 = new ExemploP113_01("Academia Web", "AW", 128);
		System.out.println("O curso " + curso2.getNome() + " tem a carga horaria de " + curso2	.getCargaHoraria());
	}
}
