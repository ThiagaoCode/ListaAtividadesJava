package Familia28;

import java.util.Scanner;

public class exemploArray1 {

	public static void main(String[] args) {
		// ARRAY DO TIPO VETOR - crie um programa que leia as medias dos alunes e calcule a media
		
		
		final int tamanho =4; // definição de constante --> final // mantem sempre o mesmo tamanho
		float [] media = new float[tamanho];
		//String [] nome = new String[5]; --> array de string // guarda nomes
		float somaMedia=0, mediaGeral;
		int x;
						
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<4; x++) {
			System.out.println("\nEntre com a sua média: ");
			media[x] = leia.nextFloat();
			
			somaMedia = somaMedia + media[x];
		}
		
		mediaGeral = somaMedia /4;
		System.out.printf("\nMédia geral: %2.2f", mediaGeral);
		
	
	}

}
