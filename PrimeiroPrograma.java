package Familia28;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) 
	{
		float nota1, nota2, nota3, media; //*real do portugol
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("\nMédia: " + media);
		System.out.printf("\nMédia: %2.2f", media);
		
		
		/*
		
		nota1 = Math.sqrt(nota2); //raiz quadrada 
		nota2 = Math.pow(nota3, 3); //potencia
		nota3 = nota1 % 2; //modulo
		
		*/
		
		
		
	}

}
