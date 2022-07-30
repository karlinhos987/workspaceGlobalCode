package Aj2Capitulo06;

public class ExemploP123_02 {
	public static void main(String[] args) {
		ExemploP123_01.logIt("Logger");

		ExemploP123_01 log1 = new ExemploP123_01();
		log1.logIt("log1");

		ExemploP123_01 log2 = new ExemploP123_01();
		log2.logIt("log2");

		ExemploP123_01.logIt("LOGGER");
	}
}