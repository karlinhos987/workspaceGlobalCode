package Aj2Capitulo05;

public class ExercicioP109_01 {
	{
		System.out.println("inside instance initializer");
	}

	ExercicioP109_01(byte b){
		System.out.println("inside constructor with byte");
	}

	ExercicioP109_01(short s){
		System.out.println("inside constructor with short");
	}

	ExercicioP109_01(char c){
		System.out.println("inside constructor with char");
	}

	ExercicioP109_01(int i){
		System.out.println("inside constructor with int");
	}

	public static void main(String[] args) {
		ExercicioP109_01 foo = new ExercicioP109_01(2);
	}
}