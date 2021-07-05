package Familia28;

import java.util.Scanner;

public class repeticaoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// entre com 5 valores e mostre o somatorio dos 5 valores lidos.
		
		float valor, soma=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x<=5; x++) {
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextFloat();
			
			soma = soma + valor;
		}
		
		System.out.println("\nSomatório dos valores: " + soma);
		

	}

}
