import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		float sueldo_base;
		float ventas;
		float sueldo_total;
		float comision;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Sueldo base del empleado:  ");
		sueldo_base = teclado.nextFloat();
		
		System.out.println("Introduzca ventas de empleado: ");
		ventas = teclado.nextFloat();
		
		comision = sueldo_base * (ventas * 0.1f);
		sueldo_total = sueldo_base +  comision;
		
		System.out.println("Su sueldo total es: "+sueldo_total);
		
		System.out.println("Su comision es  de: "+comision);
		
		teclado.close();
	}

}
