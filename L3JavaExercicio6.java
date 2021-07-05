package Familia28;

import java.util.Scanner;

/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/ 

public class L3JavaExercicio6 {

	public static void main(String[] args) {
		
		int x, cont=0, media=0, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\nDigite um número: ");
			x=leia.nextInt();
			
			if(x % 3 == 0) {
				cont++;
				soma= soma + x;
						
				
			}
		}while(x!=0);
		
		media=soma/cont;
		
		System.out.println("\nMédia dos números múltiplos de 3 é: " + media);

	}

}
