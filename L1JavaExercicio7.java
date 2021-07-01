package Familia28;
/*7.  Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
calcula e mostra os valores de x e y. */

import java.util.Scanner;

public class L1JavaExercicio7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o A: ");
		a = leia.nextFloat();
		
		System.out.println("\nEntre com o B: ");
		b = leia.nextFloat();
		
		System.out.println("\nEntre com o C: ");
		c = leia.nextFloat();
		
		System.out.println("\nEntre com o D: ");
		d = leia.nextFloat();
		
		System.out.println("\nEntre com o E: ");
		e = leia.nextFloat();
		
		System.out.println("\nEntre com o F: ");
		f = leia.nextFloat();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		
		//System.out.println("\nO Valor de X é: " + x);
		System.out.printf("\nValor X é: %.2f", x);
		//7System.out.println("\nO Valor de Y é: " + y);
		System.out.printf("\nValor Y é : %.2f", y);
		
		
			
		



	}

}
