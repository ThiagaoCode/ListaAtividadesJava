package Familia28;

import java.util.Scanner;

/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. 
*/

public class L1JavaExercicio2 {
	
	public static void main(String[] args) {
		
		int totalDias,anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com total de dias vividos: ");
		totalDias = leia.nextInt();
		
		anos = totalDias/365;
		meses= (totalDias % 365) / 30;
		dias= (totalDias % 365) % 30;
		
		System.out.println("\nEu vivi: " + anos + " ano(s), " + meses + " mes(es)," + dias + " dia(s) de vida... ");
		
		
		
		
		
	}

}
