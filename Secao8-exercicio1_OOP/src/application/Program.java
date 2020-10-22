package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle; //importando o pacote entities,classe Rectangle


public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle(); //objeto rect, da classe Rectangle, sendo criado
		
		System.out.print("Entre a largura do retangulo: ");
		rect.width = sc.nextDouble(); //este objeto irá entrar o dado da largura
		System.out.print("Entre a altura do retangulo: ");
		rect.height = sc.nextDouble(); //este objeto irá entrar a altura
	
		System.out.printf("AREA = %.2f\n", rect.area()); //irá exibir o resultado do objeto rect aplicado ao método area()
		System.out.printf("PERIMETER = %.2f\n", rect.perimeter()); //idem perimeter()
		System.out.printf("DIAGONAL = %.2f\n", rect.diagonal()); //idem diagonal ()

		sc.close();
	}

}
