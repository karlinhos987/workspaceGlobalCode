package Aj2Capitulo10;

//ExemploP227_01
public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobilia mob = new Mobilia("Mesa", "Moveis Silva", "madeira/formica/metal", 115, 70, 90, 11);
		
		System.out.println("Mobilia: " + mob.getTipo());
		System.out.println("Volue: " + mob.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("Peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("Empilhamento MAX: " + mob.getEmpilhamentoMaximo());
		System.out.println();
		
		Alimento junk = new Alimento("Hamburguer", -2, 350, 260, 6, 30);
		System.out.println("Alimento: " + junk.getNome());
		System.out.println("Volume: " + junk.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("Peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("Empilhamento MAX: " + junk.getEmpilhamentoMaximo());
		System.out.println("Conservacao: " + junk.getTemperaturaDeConservacao() + "C");
		System.out.println("Dias de validade: " + junk.getDiasDeValidade());
	}

}
