import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		float capital;
		float retribucion;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe el capital: ");
		
		capital = teclado.nextFloat();
		
		retribucion = (float) (capital * .02);		//Conversión de tipo explícita.
		//retribucion = capital * .02f;	
		
		System.out.println("La retribuci�n de la persona es " + retribucion);
		//System.out.println("La retribucion de la persona es " + (capital * 0.2f);
		
		teclado.close();
	}

}