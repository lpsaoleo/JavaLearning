package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// criando uma lista do tipo Employee, ArrayList
		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered:");
		// numero de empregados a serem registrados
		int n = sc.nextInt();

		// Criando empregados

		// laço for
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary:");
			Double salary = sc.nextDouble();

			// Apos armazenar as variaveis, instanciamos um objeto com estas variaveis
			Employee employee = new Employee(id, name, salary);

			// inserir no final da lista, o objeto employee, recém criado acima
			list.add(employee);

		}

		// Atualizando o salário de um empregado

		System.out.println("Enter the employee id that will have salary increase:");
		Integer idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This employee ID does not exist!");
		} else {
			System.out.println("Enter the percentage:");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

	// função para procurar o ID do funcionario na lista
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id);
			return i;
		}
		return null;
	}

}
