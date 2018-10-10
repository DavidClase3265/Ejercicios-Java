import java.util.Scanner;

public class SueldoVendedor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float venta;
		float comision;
		float sueldo = 1200;
		final float porcentaje = 0.1f;

		System.out.println("Valor de la venta 1: ");
		venta = teclado.nextFloat();
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comisión por la venta 1:" + comision);

		{
		System.out.println("Valor de la venta 2: ");
		venta = teclado.nextFloat();
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comisión por la venta 2:" + comision);
		}
		
		System.out.println("Valor de la venta 3: ");
		venta = teclado.nextFloat();
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comisión por la venta 3:" + comision);

		System.out.println("Sueldo Final: " + sueldo);
		
		teclado.close();

	}
	
//	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//
//		float venta1;
//		float venta2;
//		float venta3;
//		float comision1;
//		float comision2;
//		float comision3;
//		final float sueldo = 1200;
//		final float porcentaje = 0.1f;
//
//		System.out.println("Valor de la venta 1: ");
//		venta1 = teclado.nextFloat();
//		comision1 = venta1 * porcentaje;
//
//		System.out.println("Valor de la venta 2: ");
//		venta2 = teclado.nextFloat();
//		comision2 = venta2 * porcentaje;
//
//		System.out.println("Valor de la venta 3: ");
//		venta3 = teclado.nextFloat();
//		comision3 = venta3 * porcentaje;
//
//		System.out.println("Valor Comisión 1: " + comision1);
//		System.out.println("Valor Comisión 2: " + comision2);
//		System.out.println("Valor Comisión 3: " + comision3);
//
//		System.out.println("Sueldo Final: " + (comision1 + comision2 + comision3 + sueldo));
//		
//		teclado.close();
//
//	}

}
