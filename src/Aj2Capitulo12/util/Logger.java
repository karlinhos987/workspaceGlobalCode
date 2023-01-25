/**
 * 
 */
package Aj2Capitulo12.util;

/**
 * @author karlinhos987
 *
 */

//ExemploP282_01
public class Logger {
	public static final int DEBUG = 0;
	public static final int ERROR = 1;
	public static void log(String msg, int level) {
		System.out.println("["+level+"]"+msg);
	}
}