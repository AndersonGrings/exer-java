package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosMath5de6 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	   int p1,p2,n1,n2;
	   double v1,v2,vTotal;
	   
	   p1 = sc.nextInt();
	   n1 = sc.nextInt();
	   v1 = sc.nextDouble();
	   
	   p2 = sc.nextInt();
	   n2 = sc.nextInt();
	   v2 = sc.nextDouble();
	   
	   vTotal = n1*v1 + n2*v2;
	   
	   System.out.printf("Valor a pagar: R$%.2f%n", vTotal);
	   System.out.println("produtos: " +p1+" e " +p2+" presentes na compra"); 
	   
	   sc.close();
	   
	   
	   
	   
	}
	

}
