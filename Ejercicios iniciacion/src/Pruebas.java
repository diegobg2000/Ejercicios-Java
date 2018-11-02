import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		float n;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba un numero");
		n = teclado.nextFloat();
		
		
		if ((Math.abs(100-n) <=10 || Math.abs(200-n) <=10)){
			System.out.println("Verdadero");
			
		} else {
			System.out.println("Falso");

		}
	
		
	}
}
