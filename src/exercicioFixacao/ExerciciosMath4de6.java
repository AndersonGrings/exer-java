package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosMath4de6 {
	public static void main (String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFuc,hTrab;
		double salario,total;
		
		numFuc = sc.nextInt();
		hTrab = sc.nextInt();
		salario = sc.nextDouble();
		
	total = hTrab*salario;
	
	System.out.println("Numero trabalhador: "+ numFuc);
	System.out.printf("salario total: $%.2f%n", total);
	
	sc.close();
		
		System.out.println("");
		
		
		
	}

}
