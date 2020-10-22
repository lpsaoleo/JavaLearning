import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Exercicio01

		System.out.println("Digite um valor X para uma contagem de números impares até ele: ");
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// Exercicio02

		System.out.println("Digite um número N de números inteiros para serem lidos no intervalo de 10 a 20: ");
		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		System.out.println("Digite " + N + " números para verificar a presença no intervalod e 10 a 20: ");
		for (int i2 = 0; i2 < N; i2++) {
			int num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		// Exercicio03

		System.out.println("Insira um número de alunos para calcular a média: ");
		int N3 = sc.nextInt();

		for (int i3 = 0; i3 < N3; i3++) {
			int contI3 = i3 + 1;
			System.out.println("Insira as notas do " + contI3 + "º aluno.");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();

			double media = ((n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5));
			System.out.println(media);
		}
		System.out.println("Fim da média");

		// Exercicio04

		System.out.println("Escreva um número de pares a serem divididos: ");
		int N4 = sc.nextInt();

		for (int i4 = 0; i4 < N4; i4++) {

			int contI4 = i4 + 1;
			System.out.println("Insira as notas do " + contI4 + "º par.");
			double par1 = sc.nextInt();
			double par2 = sc.nextInt();

			if (par2 == 0) {
				System.out.println("DIVISAO IMPOSSÍVEL");
			} else {
				double divisao = par1 / par2;
				System.out.println(divisao);
			}
		}

		// Exercicio05

		System.out.println("Escreva um número para cálculo do fatorial: ");
		int N5 = sc.nextInt();
		int fatorial = 1;

		for (int i5 = 1; i5 <= N5; i5++) {
			fatorial = fatorial * i5;
		}
		System.out.println(fatorial);
		
		//Exercicio06
		
		System.out.println("Entre um número para cálculo dos divisores: ");
		int N6 = sc.nextInt();
		
		for (int i6 = 1; i6 <= N6; i6++) {
			
			if(N6 % i6 == 0) {
			int divisor = i6;
			System.out.println(divisor);
			}		
		}

		//Exercicio07
		
		System.out.println("Entre um número de linhas: ");
		int N7 = sc.nextInt();
		
		for(int i7 = 1; i7 <= N7; i7++) {
			int quadrado = (int) Math.pow(i7, 2);
			int cubo = (int) Math.pow(i7, 3);
			System.out.println(i7 +" " + quadrado + " " + cubo);
		}
		
		sc.close();
	}

}
