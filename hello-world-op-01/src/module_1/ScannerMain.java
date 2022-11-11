package module_1;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author sebastian clase sobre el manejo de entrada y salida de datos con
 *         scanner
 */
public class ScannerMain {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * se leen los datos con scanner y system.in, permite leer diferentes tipos de datos
		 * se pueden leer archivos y escribir datos en archivos
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un nombre");
		String name = entrada.nextLine();

		System.out.println("introduce un número");
		int number = entrada.nextInt();

		System.out.println("El nombre introducido es: " + name);
		System.out.println("El número introducido es: " + number);
		
		System.out.println("Hola Sebas");
	}

}
