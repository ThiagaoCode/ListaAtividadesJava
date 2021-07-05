package Familia28;

import java.util.Scanner;

/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class L3JavaExercicio3 {

	public static void main(String[] args) {
		
		int idade=0, menos21=0, mais50=0, idadesGerais=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while(idade !=-99) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				menos21++;
			} 
			else if (idade > 50) {
				mais50++;
			}
			
			else {
				idadesGerais++;
			}
			
		}
		
		System.out.println("\nTotal de pessoas com menos que 25 anos: " + menos21);
		System.out.println("\nTotal de pessoas com mais que 50 anos: " + mais50);


	}

}
