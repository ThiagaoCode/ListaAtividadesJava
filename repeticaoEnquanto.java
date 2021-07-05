package Familia28;

import java.util.Scanner;

public class repeticaoEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, somaMedia=0, media, mediaGeral;
		int cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		
		media = (nota1+nota2+nota3)/3;
		System.out.printf("\nMédia: %2.2f", media, "\n ");
		
		while(media!=0) 
		{
			somaMedia = somaMedia + media;
			cont++;
			System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3)/3;
			System.out.printf("\nMédia: %2.2f", media, "\n ");
		}
		
		mediaGeral = somaMedia / cont;
		System.out.println("\nMédia geral: " + mediaGeral + "\n ");

	}

}
