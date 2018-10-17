import java.util.Scanner;

public class Divisible {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (comprobar()) {
			System.out.println("Introduce un número: ");
			int x = in.nextInt();
			System.out.println("Introduce otro número: ");
			int y = in.nextInt();
			System.out.println(x + (x % y == 0 ? "" : " no") + " es divisible entre " + y);
//			if (x % y == 0)
//				System.out.println(x + " es divisible entre " + y);
//			else
//				System.out.println(x + " no es divisible entre " + y);
		}
	}
	
	static boolean comprobar() {
		System.out.println("¿Comprobar si un número es divisible entre otro? (s/n)");
		return in.next().toLowerCase().equals("s");
	}
	
}
