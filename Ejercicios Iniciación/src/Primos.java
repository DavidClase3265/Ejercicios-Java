import java.util.Scanner;

public class Primos {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¿Cuántos números primos deseas generar? ");
		int n = in.nextInt();
		int candidato = 3;
		while (n > 0) {
			int divisor = candidato - 1;
			int resto;
//			do {
//				resto = candidato % divisor;
//				if (resto != 0)
//					divisor--;
//			} while (divisor > 1 && resto > 0);
//			if (divisor == 1) {
//				System.out.println(candidato + " es primo");
//				n--;
//			}
			do {
				resto = candidato % divisor;
				divisor--;
			} while (divisor > 1 && resto > 0);
			if (resto != 0) {
				System.out.println(candidato + " es primo");
				n--;
			}
			candidato++;
		}
		
	}
	
}
