import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = in.nextInt();
		if (numero % 2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	}

}
