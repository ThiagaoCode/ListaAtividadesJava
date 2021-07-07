package Familia28;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */

public class L4JavaExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetorzin = new int[6];
		int linha; 
		int somaPar=0, quantImpar=0;
		int x;
		
		for(linha =0; linha<6; linha++) {
		
				System.out.println("\nEntre com um número: ");
				vetorzin[linha] = leia.nextInt();
		}
		for(linha =0; linha<6; linha++) {
			if(vetorzin[linha] % 2 ==0) {
				System.out.println("\n" + vetorzin[linha] + " é Par!!!");
				somaPar = somaPar + vetorzin[linha];
				/*for(x=0; x<6; x++) {
					vetorzin[x] = leia.nextInt();
					
					somaPar = somaPar + vetorzin[x];
					
					System.out.println("\nA soma dos numeros pares é: " + somaPar);
				}*/
			}
			else {
				quantImpar++;
				
				System.out.println("\n" + vetorzin[linha] + " é Impar ");
				//System.out.println("\n" + vetorzin[linha] + " É Impar!!!");
				
				
				/*for(x=0; x<6; x++) {
					vetorzin[x] = leia.nextInt();
					
					somaImpar = somaImpar + vetorzin[x];
					
					System.out.println("\nA soma dos numeros pares é: ");
				}*/
			}
			
		}
		System.out.println("\nSoma dos números pares: " + somaPar);
		System.out.println("\nQuantidade de números impares: " + quantImpar);

	}

}
