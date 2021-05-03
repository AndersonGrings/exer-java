package exercicioFixacao;

import java.util.Locale;

public class exercicio1 {

	public static void main(String[] args) {
	   String product1 = "computer";
	   String product2 = "Office desk";
	   
	   int age = 30;
	   int code = 5290;
	   
	   
	   char gender = 'F';
	    
	   double prince1 = 2100.0;
	   double prince2 = 650.5;
	   double measure = 53.234567;
	   
	   //Locale.setDefault(Locale.BR);
	   System.out.println("procuct:");
	   System.out.printf("%s, whitch price is $%.2f%n", product1, prince1);
	   System.out.printf("%s, which price is $%.2f%n", product2, prince2);
	   System.out.printf("%n");
	   System.out.printf("Record: %d years old, code %d and gender:%s%n", age, code, gender);
	   System.out.printf("%n");
	   System.out.printf("measue with eight decimal places: %f00%n", measure);
	   System.out.printf("Rouded (three decimal places):%.3f%n",measure);
	   Locale.setDefault(Locale.US);
	   System.out.printf("US decimal point:%.3f%n", measure);
	   System.out.println("besta");
			   

	}

}
