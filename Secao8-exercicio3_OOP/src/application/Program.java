package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); //mudando o sistema de unidades para padrão americano
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student(); //criando o objeto st, na classe Student
		
		System.out.print("Enter student name: ");
		st.name = sc.nextLine(); //atribuindo a string ao atributo name, na classe
		
		System.out.println("Enter the three grades: ");
		st.grade1 = sc.nextDouble(); //atribuindo a nota 1
		st.grade2 = sc.nextDouble(); //atribuindo a nota 2
		st.grade3 = sc.nextDouble(); //atribuindo a nota 3
		
		System.out.printf("FINAL GRADE: %.2f\n", st.finalGrade()); //exibindo a função que soma as notas
		
		if (st.finalGrade() < 60) { //se o resultado final da funçao finalGrade() for menor que 60
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", st.missingPoints()); //exiba a função pontos faltantes
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
