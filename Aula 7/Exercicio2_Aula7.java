package main;
import java.util.Scanner;
import java.util.Locale;

//Exercicio 1

/*Fazer um programa para ler um número inteiro N
 *  e uma matriz de ordem N contendo números inteiros.
 *   Em seguida, mostrar a diagonal principal e a 
 *   quantidade de valores negativos da matriz.*/

public class Exercicio2_Aula7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int quantidade = 0, i, j, contador = 0, somaDeImpares = 0, somaColuna1= 0,somaColuna2= 0,somaColuna3= 0,somaLinha1= 0,somaLinha2= 0,somaLinha3= 0;
		
		int [][] matriz= new int[3][3];

		System.out.println("Digite os elementos de uma matriz 3x3:");
		
		for (i = 0; i < quantidade; i++){
			for(j = 0; j < quantidade; j++) {
				matriz[i][j] = sc.nextInt(); 
				if(matriz[i][j] % 2 == 0) {
					somaDeImpares += matriz[i][j];
				}
				if (j == 0) {
					somaColuna1 += matriz[i][j];
				}
				if (j == 1) {
					somaColuna2 += matriz[i][j];
				}
				if (j == 2) {
					somaColuna3 += matriz[i][j];
				}
				if (i == 0) {
					somaLinha1 += matriz[i][j];
				}
				if (i == 1) {
					somaLinha2 += matriz[i][j];
				}
				if (i == 2) {
					somaLinha3 += matriz[i][j];
				}
			}
		}
		
		System.out.println("A matriz digitada é:");
		
		for (i = 0; i < quantidade; i++){
			for(j = 0; j < quantidade; j++) {
				System.out.printf("%d\t", matriz[i][j]);
				if (j == (quantidade - 1)) {
					System.out.println("");
				}
			}
		}
		
		System.out.println("\nA soma dos numeros da coluna 1 é:"+ somaColuna1);
		System.out.println("\nA soma dos numeros da coluna 2 é:"+ somaColuna2);
		System.out.println("\nA soma dos numeros da coluna 3 é:"+ somaColuna3);
		System.out.println("\nA soma dos numeros da linha 1 é:"+ somaLinha1);
		System.out.println("\nA soma dos numeros da linha 2 é:"+ somaLinha2);
		System.out.println("\nA soma dos numeros da linha 3 é:"+ somaLinha3);
		
		sc.close();
	}
}