package exercicioConstrutoresEncapsulamento;

public class ExercicioContaBanco {
	private int number;
	private String holder;
	private double balance;
	

	public ExercicioContaBanco(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public ExercicioContaBanco(int number, String holder, double depositoInicial) {
		this.number = number;
		this.holder = holder;
		deposito(depositoInicial);
	}


	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

	public void deposito (double saque) {
		balance+=saque;
	}
	
	public void saque (double saque) {
		balance-=saque + 5.0;
	}
	
	public String toString() {
		return "ExercicioContaBanco " 
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
	
	
	

}
