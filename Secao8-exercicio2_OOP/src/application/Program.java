package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee; //chamando o pacote entities, classe Employee

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //mudando o sistema de unidades para padrão americano
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee(); //criando o objeto emp, na classe Employee
		
		System.out.print("Name: ");
		emp.name = sc.nextLine(); // atribuindo a entrada para o atributo name, na classe Employee
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble(); //atribuindo esta entrada para o atributo grossSalary, na classe Employee
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble(); //atribuindo esta entrada para o atributo tax, na classe Employee
		
		System.out.println();;
		System.out.println("Employee: "+ emp); // exibindo a função toString() da classe Employee
		System.out.println();
		
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble(); //criando uma variável percentagem
		emp.increaseSalary(percentage); //entrando essa variável na função increaseSalary, no objeto emp, da classe Employee
		
		System.out.println();
		System.out.println("Updated data: " + emp); // exibindo novamente a função toString() da classe Employee
		
		sc.close();
	}

}
