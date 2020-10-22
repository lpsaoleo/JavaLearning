package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// ENTRADA Do TAMANHO DA MATRIZ
		System.out.print("Entre o número de linhas:");
		int m = sc.nextInt();
		System.out.print("Entre o número de colunas:");
		int n = sc.nextInt();
		
		// CRIAÇÃO DA MATRIZ
		int [][] matrix = new int [m][n];
		
		//PREENCHIMENTO DA MATRIZ
		System.out.println("Entre os valores da matriz:");
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		// VALOR DE PROCURA NA MATRIZ
		System.out.print("Entre com um valor para procurar na matriz:");
		int value = sc.nextInt();
		
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				//se o valor entrado for igual ao valor da matriz na posição atual i,j
				if(value == matrix[i][j]) {
					//imprima a posição
					System.out.println();
					System.out.println("Posição " + i + ","+ j + ":");
					//se a posição da coluna for maior que 0
					if (j > 0) {
						//imprima o valor na posição i e j-1
						System.out.println("Esquerda: " + matrix[i][j-1]);
					}
					//se a posição da linha for maior que 0
					if (i > 0) {
						//imprima o valor na posição i-1 (uma linha a cima) e j(na mesma coluna)
						System.out.println("Acima: " + matrix[i-1][j]);
					}
					//se a posição da coluna for menor que o comprimento total de colunas, menos 1
					if (j < matrix[i].length-1) {
						//imprima o valor da posição imediatamente ao lado direito
						System.out.println("Direita: " + matrix[i][j+1]);
					}
					//se a posição da linha for menor que o comprimento total de linha, menos 1
					if (i < matrix.length-1) {
						//imprima o valor da posição imediatamente ao abaixo
						System.out.println("Abaixo: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
