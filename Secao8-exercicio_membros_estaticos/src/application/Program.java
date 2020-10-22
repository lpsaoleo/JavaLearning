package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter; // importando o package util, classe CurrencyConverter

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		CurrencyConverter.dollar = sc.nextDouble(); //como o metodo é estatico, nao é necessário instanciar. Basta chamar direto a classe e o atributo
		
		System.out.print("How many dollars will be bought?: ");
		CurrencyConverter.amount = sc.nextDouble();//como o metodo é estatico, nao é necessário instanciar. Basta chamar direto a classe e o atributo
				
		System.out.printf("Amount to be paid in reais: %.2f\n", CurrencyConverter.reais());
		
		sc.close();
	}
}
