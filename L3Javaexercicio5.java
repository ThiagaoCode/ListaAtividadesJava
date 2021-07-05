package Familia28;

import java.util.Scanner;

/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class L3Javaexercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		do 
		{
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			somaNum = somaNum + num;
		
			
		}
		while(num!=0);
		
		System.out.println("\nA soma dos números digitados anteriormente foi: " + somaNum);

	}

}

