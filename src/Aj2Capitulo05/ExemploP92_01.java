package Aj2Capitulo05;

public class ExemploP92_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeCurso = "Curso de Java";
		String descricaoCurso = "Neste curso voce ira aprender tudo sobre Java";
		String codigo = "Java";
		int cargaHoraria = 180;
		
		ExemploP91_01 curso = new ExemploP91_01();
		curso.inicializaCurso(nomeCurso, descricaoCurso, codigo, cargaHoraria);
		curso.imprime();
	}

}
