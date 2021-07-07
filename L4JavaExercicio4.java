package Familia28;

import java.util.Scanner;

/* 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/ 

public class L4JavaExercicio4 {

	public static void main(String[] args) {
		
		float[][] A = new float[2][2];
		float[][] B = new float[2][2];
		float[][] resultado = new float[2][2];
		int lin, col, valor, op;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um valor: ");
		valor = leia.nextInt();
		
		for(lin=0; lin<2; lin++) {
			for(col=0; col<2; col++) {
				System.out.println("\nEntre com o valor de A: ");
				A[lin][col] = leia.nextFloat();
				System.out.println("\nEntre com o valor de B: ");
				B[lin][col] = leia.nextFloat();
				
			}
		}
		System.out.println("\n\t\tMenu de opções:");
		System.out.println("\n1 - Somar as duas matrizes");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes");
		System.out.println("\n4 - Imprimir Matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		/*while(op<1 || op>4) {														// repetir para o usuario quando 
			System.out.println("\n\t\tPor favor entrar com número correto:");		// o mesmo colocar o numero invalido 
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes");
			System.out.println("\n4 - Imprimir Matrizes");
			System.out.println("\n1 - Digite sua opção: ");
			op = leia.nextInt();
		}*/

		switch(op) 
		{
		case 1:
			for(lin=0; lin<2; lin++) {
				for(col=0; col<2; col++) {
			resultado[lin][col] = A[lin][col] + B[lin][col];
			System.out.println("\nResultado da soma: " + resultado[lin][col]);
			
			}
				}
			break;
		
		case 2:
			for(lin=0; lin<2; lin++) {
				for(col=0; col<2; col++) {
			resultado[lin][col] = A[lin][col] - B[lin][col];
			System.out.println("\nResultado da subtração: " + resultado[lin][col]);
			
			}
				}
			break;
		
		case 3:
			System.out.println("\nEntre com um valor da constante");
			valor = leia.nextInt();
			
			for(lin=0; lin<2; lin++) {
				for(col=0; col<2; col++) {
			A[lin][col] = A[lin][col] + valor;
			System.out.println("\nConstante somada com a matriz A: " + A[lin][col]);
			B[lin][col] = B[lin][col] + valor;
			System.out.println("\nConstante somada com a matriz B: " + B[lin][col]);
			
			}
				}
			break;
			
		case 4:
			for(lin=0; lin<2; lin++) {
				for(col=0; col<2; col++) {
			
			System.out.println("\nMatriz A: " + A[lin][col]);
			
			System.out.println("\nMatriz B: " + B[lin][col]);
			
			}
				}
			break;
			default:
				System.out.println("\nOpção inválida!!!");
			
		}
		
			
			
	}

}
