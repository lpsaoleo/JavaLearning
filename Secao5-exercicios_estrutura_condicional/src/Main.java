import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exercício 01
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um número :");
		num = sc.nextDouble();
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 02
		
		double numParImpar;
		
		System.out.println("Digite um número :");
		numParImpar = sc.nextDouble();
		
		if (numParImpar % 2 == 0) {
			System.out.println("PAR");
		}	
		else {
			System.out.println("IMPAR");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 03
		
		int A, B;
		
		System.out.println("Digite dois números em sequencia :");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if ((A % B == 0) || (B % A == 0)) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 04
		
		int horaIni, horaFim, duracao;
		
		System.out.println("Digite a hora de início e fim da partida, em sequência: ");
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		
		if (horaIni > horaFim) {
			duracao = (24 - horaIni) + horaFim;
			System.out.println("O JOGO DUROU " + duracao + " HORAS");
		}
		else if (horaFim > horaIni){
			duracao = horaFim - horaIni;
			System.out.println("O JOGO DUROU " + duracao + " HORAS");
		}
		else {
			System.out.println("O JOGO DUROU 24 HORAS");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 05
		
		System.out.println("Digite o código do item e a quantidade, em sequência: ");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 06
		
		System.out.println("Digite um valor abaixo: ");
		double intervalo = sc.nextDouble();
		
		if (intervalo > 25 && intervalo <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if (intervalo >= 0 && intervalo <= 25) {
			System.out.println("Intervalo [0, 25]");
		}
		else if (intervalo > 75 && intervalo < 100) {
			System.out.println("Intervalo (75, 100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 07
		
		double coordX, coordY;
		
		System.out.println("Entre as coordenadas X e Y, em sequência:");
		
		coordX = sc.nextDouble();
		coordY = sc.nextDouble();
		
		if (coordX > 0 && coordY > 0) {
			System.out.println("Q1");
		}
		else if (coordX < 0 && coordY > 0) {
			System.out.println("Q2");
		}
		else if (coordX < 0 && coordY < 0) {
			System.out.println("Q3");
		}
		else if (coordX > 0 && coordY < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("ORIGEM");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" ");
		
		//Exercicio 08
		
		System.out.println("Entre com a sua renda abaixo: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f\n", imposto);
		}
				
		sc.close();
	}

}
