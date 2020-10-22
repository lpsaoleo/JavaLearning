package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax; //a função executará a subtração do salário bruto pela taxa
	}
	
	public void increaseSalary(double percentage) { //a declaração dentro do parênteses indica que ela deverá receber uma variável externa, de nome percentage, do tipo double
		grossSalary += grossSalary * percentage / 100; // a função irá executar a atualização do salário bruto, por meio do percentual de aumento inserido
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
	
}
