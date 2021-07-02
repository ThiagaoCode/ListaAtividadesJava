package Familia28;

import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class L2JavaExercicio4 {

	public static void main(String[] args) {

		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("\n" + num +  " é Par! " + "\nE sua raiz quadrada é: " + Math.sqrt(num));
			
		}
		
		else 
		{
			System.out.println("\n" + num +  " é Impar! " + "\nE sua potência é: " + Math.pow(num, 2));
			
		}
		

	}

}
