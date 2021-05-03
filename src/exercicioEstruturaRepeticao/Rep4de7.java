package exercicioEstruturaRepeticao;

import java.util.Scanner;

public class Rep4de7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			
			if ( b == 0) {
				System.out.println("Divisão impossivel");
			}

			else {
				double div = (double)a / b;
				System.out.printf("Divisão = %.1f%n", div);
				

			}
		}

		sc.close();
	}

}
