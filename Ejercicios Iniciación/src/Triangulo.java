import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float a;
		float b;
		float c;
		
		System.out.println("Lado a");
		a = teclado.nextFloat();
		
		System.out.println("Lado b");
		b = teclado.nextFloat();
		
		System.out.println("Lado c");
		c = teclado.nextFloat();
		
		if(a < b+c && b < a+c && c < a+b) {
			System.out.println("Triángulo válido");
		}
		else {
			System.out.println("Triángulo no válido");
		}
	}

}
