package Familia28;

import java.util.Scanner;

/*
 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e
	P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
 */

public class L1JavaExercicio6 {
	public static void main(String[] args) {
		
		float x1,x2,y1,y2;
		double d;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite a coordenada X do P1: ");
		x1 = leia.nextFloat();
		
		System.out.println("\nDigite a coordenada Y do P1: ");
		y1 = leia.nextFloat();
		
		System.out.println("\nDigite a coordenada X do P2: ");
		x2 = leia.nextFloat();
		
		System.out.println("\nDigite a coordenada Y do P2: ");
		y2 = leia.nextFloat();
		
		d = Math.sqrt(((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
		
		System.out.println("\nDist�ncia entre os pontos � de: " + d + " cm. ");
		System.out.printf("\nDist�ncia entre os pontos � de: %.2f", d);
		
		
	}

}
