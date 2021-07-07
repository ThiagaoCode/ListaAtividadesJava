package Familia28;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
public class L4JavaExercicio3 {

	public static void main(String[] args) {
		float[][] valor = new float [3][3];
		int x=0, lin, col;
		
		Scanner leia = new Scanner(System.in);
		
		for(lin =0; lin<3; lin++) {
			for(col=0; col<3; col++) {
				System.out.println("\nEntre com um número: ");
				valor[lin][col] = leia.nextInt();
				
				if(valor[lin][col] > 10) {
					x++;
				}
				
				
	} 

} 
		System.out.println("\n Tem " + x + " valores maior(es) que 10!!!");
}
	}
