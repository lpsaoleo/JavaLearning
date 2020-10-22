package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// painel de boas vindas
		System.out.println("-----------------------------------------");
		System.out.println("--------PENSIONATO DA DONA COTINHA-------");
		System.out.println("-----------------------------------------");
		System.out.println();

		System.out.print("Digite o número de estudantes que irão alugar quartos: ");
		int n = sc.nextInt();

		while (n > 10 || n < 0) { // condição para garantir que a capacidade seja respeitada.
			System.out.println();
			System.out.println("Capacidade excedida!");
			System.out.print("Digite um número até 10 estudantes: ");
			n = sc.nextInt();
			System.out.println();
		}

		Rooms[] vector = new Rooms[10]; // declaração do vetor

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.print("Digite o nome do estudante: ");
			String name = sc.nextLine();
			System.out.print("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.print("Digite o número do quarto que deseja se hospedar (0 a 9): ");
			int room = sc.nextInt();
			
			while (vector[room] != null) {
				System.out.println("Este quarto está ocupado, por favor escolha outro!");
				System.out.print("Digite o número do quarto que deseja se hospedar (0 a 9): ");
				room = sc.nextInt();
			}
			
			vector[room] = new Rooms(name, email, room);
		}
		
		System.out.println("Muito obrigado pelo seu cadastro!");
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null) {
				System.out.println(i + ": " + vector[i]);
			}
		}
		
		sc.close();
	}
}
