package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//os dois colchetes indicam matriz
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		//verificador da diagonal
		System.out.println("Main Diagonal:");
		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		//contador de numeros negativos
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Existem " + count + "números negativos na matriz");
		
		sc.close();

	}

}
