import java.util.Locale; //classe importada para trocar o sistema de unidades para Padrão americano
import java.util.Scanner; //classe importada para ler entradas de dados no teclado

public class Main {

	public static void main(String[] args) {
		//AULA DE SAÍDA DE DADOS (22)
		System.out.print("Olá mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x); //f indica que é formatado. 2f indica que é com 2 casas decimais \n indica uma quebra de linha
		Locale.setDefault(Locale.US); // utilizado para mudar o sistema para padrão Americano
		System.out.printf("%.4f\n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
				
		//Exercício de Saída de Dados (22)
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("");
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f.\n",product1,price1);
		System.out.printf("%s, which price is $ %.2f.\n",product2,price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %s.\n", age,code,gender);
		//%d para numeros inteiros, %s para textos e %f para ponto flutuante.
		System.out.println("");
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}
}
		