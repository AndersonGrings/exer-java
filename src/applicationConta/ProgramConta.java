package applicationConta;

import java.util.Locale;
import java.util.Scanner;

import exercicioConstrutoresEncapsulamento.ExercicioContaBanco;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ExercicioContaBanco exercicioContaBanco;

		System.out.println("Entre com numero da conta: ");
		int number = sc.nextInt();
		System.out.println("Entre nome proprietario conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("deseja iniciar com um deposito (s/n)?");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println("valor do deposito inicial ?" );
			double depositoInicial = sc.nextDouble();
			exercicioContaBanco = new ExercicioContaBanco(number, holder, depositoInicial);
		}
		else {
			exercicioContaBanco = new ExercicioContaBanco(number, holder);
		}
		
		System.out.println();
		System.out.println("conta data: ");
		System.out.println(exercicioContaBanco);
		
		System.out.println();
		System.out.print("Entre valor deposito: ");
		double depositoValue = sc.nextDouble();
		exercicioContaBanco.deposito(depositoValue);
		System.out.println("atualiza valor conta: ");
		System.out.println(exercicioContaBanco);
		
		
		System.out.println();
		System.out.print("Entre valor saque: ");
		double saqueValue = sc.nextDouble();
		exercicioContaBanco.saque(saqueValue);
		System.out.println("atualiza valor conta: ");
		System.out.println(exercicioContaBanco);
		
		sc.close();
	}

}
