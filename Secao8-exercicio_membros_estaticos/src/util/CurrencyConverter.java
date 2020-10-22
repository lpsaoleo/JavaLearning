package util;

public class CurrencyConverter {
	
	public static double dollar;
	public static double amount;
	
	public static double reais() {
		return (dollar * amount) * 1.06;
	}

}
