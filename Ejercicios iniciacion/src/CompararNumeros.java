import java.util.Random;

public class CompararNumeros {
	
	public static void main(String[] args) {
		Random r = new Random (System.nanoTime());
		
		int a = r.nextInt(1000);
		
		int b = r.nextInt(1000);
		
		System.out.println("Numero a: " + a);

		System.out.println("Numero b: " + b);

		if (a > b) {
			System.out.println("El numero a es mayor que el numero b.");
		}else if(b > a) {
			System.out.println("El numero b es mayor que el numero a.");
		}else {
			System.out.println("Los numero a y b son iguales.");
		}
	}
}
