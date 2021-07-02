package Familia28;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class L2JavaExercicio1 {

	public static void main(String[] args) {

		int a, b, c, numMaior = 0, numAnterior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com outro número: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com mais um número: ");
		c = leia.nextInt();
		
		
		
		
		
		if(numMaior < a) 
		{
			numMaior = a;
			numAnterior = a;
			
		} 
		
		else if (numMaior < b) 
		{
			numMaior = b;
			numAnterior = b;
			
		}
		
		else 
		{
			numMaior = c;
			numAnterior = c;
		}
			
		
		
		
		
		
		System.out.println("\n " + numMaior + " é o maior numero!!!");


	}

}
