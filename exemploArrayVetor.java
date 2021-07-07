package Familia28;

import java.util.Scanner;

public class exemploArrayVetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45};
		
		float[] nota = new float[5];
		
		
		
		if (arrayDois.length > 8) {
			System.out.println("\nTamanho do ArrayDois - maior que 8!");
			
		} else {
			System.out.println("\nTamanho do ArrayDois - menor que 8!\"");
		}
		
		System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
		
		
		String[] cars = {"Volvo", "Forde", "Pajero"};
		
		for (String i : cars) {
			System.out.println(i);
			
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("\nEntre com uma nota: ");
			nota[i]=entrada.nextFloat();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("\nNota: " + i + 1 + " = " + nota[i]);
			}
			
		
		
		

	}

}
