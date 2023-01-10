package Testes;

import java.util.Arrays;

public class DefaultSorter {
	public static void main(String[] args) {
		String[] brics = {"B", "R", "I", "C"};
		
		Arrays.sort(brics, null);
		
		for (String string : brics) {
			System.out.print(string + " ");
		}
	}
}
