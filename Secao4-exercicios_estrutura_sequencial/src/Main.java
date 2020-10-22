import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		//Exercicio 01
		
		int x1, x2, x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva 2 valores numéricos: ");
		x1 = sc.nextInt();
		sc.nextLine();
		x2 = sc.nextInt();
		sc.nextLine();
		
		x = x1 + x2;
						
		System.out.println("SOMA = " + x);
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 02
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Escreva o valor do raio do círculo: ");
		raio = sc.nextDouble();
		sc.nextLine();
		
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("A área do círculo é de %.4f m².\n", area);
				
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 03
		
		int A, B, C, D, diferenca;
		
		System.out.println("Escreva o valor de A: ");
		A = sc.nextInt();
		sc.nextLine();
		System.out.println("Escreva o valor de B: ");
		B = sc.nextInt();
		sc.nextLine();
		System.out.println("Escreva o valor de C: ");
		C = sc.nextInt();
		sc.nextLine();
		System.out.println("Escreva o valor de D: ");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 04
		
		int num, horas;
		double valorHora, salario;
		
		System.out.println("Digite o número do funcionário: ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o número de horas trabalhadas: ");
		horas = sc.nextInt();		
		sc.nextLine();
		System.out.println("Digite o valor/hora: ");
		valorHora = sc.nextDouble();
		sc.nextLine();
		
		salario = valorHora * horas;
		
		Locale.setDefault(Locale.US);		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n.", salario);
		
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 05
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, valorPeca2, valorTotal;
		
		System.out.println("Digite o código da peça, o número de peças e o valor unitário: ");
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o código de outra peça, o número de peças e o valor unitário: ");
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		sc.nextLine();
		
		valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
		
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//Exercício 06
		
		float X, Y, Z, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		System.out.println("Digite 3 medidas: ");
		X = sc.nextFloat();
		Y = sc.nextFloat();
		Z = sc.nextFloat();
		sc.nextLine();
		
		TRIANGULO = (X * Z) / 2;
		CIRCULO = (float) (pi * Math.pow(Z, 2.0));
		TRAPEZIO = ((X + Y) * Z) / 2;
		QUADRADO = (float) Math.pow(Y, 2.0);
		RETANGULO = X * Y;
		
		System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n", QUADRADO);
		System.out.printf("RETANGULO: %.3f\n", RETANGULO);
		
		sc.close();
	}

}
