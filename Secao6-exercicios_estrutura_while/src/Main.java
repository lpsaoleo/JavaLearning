import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercicio01

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a senha abaixo: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida, tente novamente: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido.");

		// -------------------------------------------------------------------------------

		// Exercicio02

		System.out.println("Entre as coordenadas X e Y: ");
		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != 0 || Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro quadrante");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo quadrante");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro quadrante");
			} else if (X > 0 && Y < 0) {
				System.out.println("quarto quadrante");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		// -------------------------------------------------------------------------------

		// Exercicio03

		int somaAlcool = 0;
		int somaGas = 0;
		int somaDiesel = 0;
		int cod = 0;

		System.out.println("Entre um código para determinar seu combustível: ");
		System.out.println("1 para Álcool");
		System.out.println("2 para Gasolina");
		System.out.println("3 para Diesel");
		System.out.println("4 para sair");

		cod = sc.nextInt();

		while (cod != 4) {
			switch (cod) {
			case 1:
				somaAlcool += 1;
				break;
			case 2:
				somaGas += 1;
				break;
			case 3:
				somaDiesel += 1;
				break;
			default:
				System.out.println("Digite um código válido");
				break;
			}
			cod = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Quantidade de clientes que abasteceram Álcool: " + somaAlcool);
		System.out.println("Quantidade de clientes que abasteceram Gasolina: " + somaGas);
		System.out.println("Quantidade de clientes que abasteceram Diesel: " + somaDiesel);

		sc.close();
	}

}
