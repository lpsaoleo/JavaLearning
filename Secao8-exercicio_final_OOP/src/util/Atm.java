package util;

public class Atm {

	private int number; //conta
	private String holder; //usuario
	private double balance; //valor da conta
	
	//construtor com todos os argumentos
	public Atm(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //chamando a função deposit e depositando esta quantia inicial, para acrescentar ao que já existe na conta, e não sobrepô-la
	}
	//construtor sem o argumento de valor inicial
	public Atm(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//somente get do numero da conta, pois este nao deve ser alterado
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	//somente get do valor na conta, pois este valor só poderá ser alterado via deposito e saque
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f",balance);
	}
	
	
}
