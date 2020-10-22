package application;

import java.util.Locale;
import java.util.Scanner;
import util.Atm;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Atm account; // declaração do objeto account

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();// para consumir a quebra de linha pendente no nextInt

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
	
		System.out.print("Is there a Initial Deposit? (y/n): ");
		char ans = sc.nextLine().charAt(0);
				
		if (ans == 'y' || ans == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Atm(number, holder, initialDeposit);
		} else {
			account = new Atm(number, holder);
		}

		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account); // irá puxar os dados do toString
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
