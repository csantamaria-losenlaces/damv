import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Declaración de variables
		String frase = "";
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de datos con validación que evita valores vacíos
		do {
			System.out.println("Introduce una frase:");
			frase = teclado.nextLine();
		} while (frase == "");
		
		teclado.close();
		
		// Salida de datos
		System.out.println("La frase introducida es: " + frase);	
	
	}

}