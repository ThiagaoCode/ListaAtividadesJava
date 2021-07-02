package Familia28;

import java.util.Scanner;

/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

public class L2JavaExercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
				
		
		System.out.println("\nOlá atleta, quantos anos você tem? ");
		idade = leia.nextInt();
		
		System.out.println("\n\t\tCATEGORIAS ");
		System.out.println("\n\tInfantil = 10 a 14 anos \n\tJuvenil = 15 a 17 anos\n\tAdultos = 18  a 25 anos ");
		
		if(idade >=10 && idade<=14) {
			System.out.println("\nVocê se encontra na categoria Infantil!");
		}
		
		else if(idade >=15 && idade<=17) {
			System.out.println("\nVocê se encontra na categoria Juvenil!");
		}
		
		else if(idade >=18 && idade<=25) {
			System.out.println("\nVocê se encontra na categoria Adulto!");
		}
		else {
			System.out.println("\nNão se desanime! Você já é um atleta vencedor!");
		}

	}

}
