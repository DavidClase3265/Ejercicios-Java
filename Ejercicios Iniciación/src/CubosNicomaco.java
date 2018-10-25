import java.util.Scanner;

public class CubosNicomaco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Número entero: ");
		int n = in.nextInt();
		int sgteImpar = 1;
		for (int i=1; i<=n; i++) {
			int acumulador = 0;
			for (int j=1; j<=i; j++) {
				acumulador += sgteImpar;
				sgteImpar += 2;
			}
			System.out.println(i + "^3 = " + acumulador);
		}

	}

}
