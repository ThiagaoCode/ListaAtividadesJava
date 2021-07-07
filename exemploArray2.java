package Familia28;

import java.util.Scanner;

public class exemploArray2 {

	public static void main(String[] args) {
		/* ARRAY DE MATRIZ -- preencha uma matriz 2X3 e a cada valor inserido, 
		 verifique se é impar ou par informando issso no console*/ 
		
		int [][] numero = new int [2][3];
		int linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(linha =0; linha<2; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
			}
		}
		
		for(linha =0; linha<2; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				if(numero[linha][coluna] % 2 ==0) {
					System.out.println("\n" + numero[linha][coluna] + "é Par!!!");
				}
				else {
					System.out.println("\n" + numero[linha][coluna] + "é Impar!!!");
				}
				
				
			}
		}

	}

}
