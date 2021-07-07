package Familia28;

import java.util.Scanner;

public class ExemploArray3 {
/*Preencha um array do tipo matriz 3X3 e calcule a media dos valores
  e o somatorio da diagonal principal.*/
 
	public static void main(String[] args) {
		
		float [][] valor = new float [3][3];
		float somaValor = 0, mediaValor, somaDiagonal =0;
		int lin, col;
		
		Scanner leia = new Scanner (System.in);
		
		for(lin=0; lin<3; lin++) {
			for(col=0; col<3; col++) {
				System.out.println("\nEntre com um valor:" );
				valor[lin][col] = leia.nextFloat();
				
				somaValor = somaValor + valor[lin][col];
				
				if(lin == col) {
					somaDiagonal = somaDiagonal + valor[lin][col];
				}
			}
		}
		mediaValor = somaValor / 9;
		System.out.println("\nSomatório da diagonal principal: " + somaDiagonal);
		System.out.println("\nMédia dos valores: " + mediaValor);
	}

}
