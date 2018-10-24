import java.util.Scanner;

public class CruzAsteriscos {

	static int obtenerFC(String fc) {
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("Número de " + fc + ": ");
			x = in.nextInt();
			if (x < 3 || x % 2 == 0)
				System.out.println("Número de " + fc + " incorrecto, vuelve a intentarlo");
		} while (x < 3 || x % 2 == 0);
		return x;
	}
	
	public static void main(String[] args) {
		int n = obtenerFC("filas");
		int m = obtenerFC("columnas");
//		for (int i=0; i<n; i++) {
//			if (i == n / 2) {
//				for (int j = 0; j<m; j++)
//					System.out.print("*");
//			}
//			else {
//				for (int j = 0; j<m; j++) {
//					if (j == m / 2) {
//						System.out.print("*");
//					}
//					else
//						System.out.print(" ");
//						
//				}
//			}
//			System.out.println();
//		}
		
//		for (int i=0; i<n; i++) {
//			for (int j=0; j<m; j++) {
//				if (i == n/2 || j==m/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++)
				System.out.print((i == n/2 || j==m/2) ? "*" : " ");
			System.out.println();
		}
		
	}

}
