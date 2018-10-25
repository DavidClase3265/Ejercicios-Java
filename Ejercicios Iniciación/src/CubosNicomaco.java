import java.util.Scanner;

public class CubosNicomaco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Número entero: ");
		int n = in.nextInt();
		int sgteImpar = 1;
		for (int i=1; i<=n; i++) {
			int acumulador = 0;
			System.out.print(i + "^3 = ");
			for (int j=1; j<=i; j++) {
				System.out.print(sgteImpar + ((j != i)? " + ": ""));
				acumulador += sgteImpar;
				sgteImpar += 2;
			}
			System.out.println(" = " + acumulador);
		}

	}

}
