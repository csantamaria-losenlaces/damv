import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Declaración de variables
		String frase = "";
		Scanner teclado = new Scanner(System.in);

		// Entrada de datos con validación que evita valores vacíos (frase 1)
		do {
			System.out.println("Introduce una frase:");
			frase = teclado.nextLine();
		} while (frase == "");

		// Salida de datos
		System.out.println("La primera frase introducida es: " + frase);

		// Reiniciamos la variable "frase"
		frase = "";

		// Entrada de datos con validación que evita valores vacíos (frase 2)
		do {
			System.out.println("Introduce una frase:");
			frase = teclado.nextLine();
		} while (frase == "");

		// Salida de datos
		System.out.println("La segunda frase introducida es: " + frase);

		teclado.close();

	}

}