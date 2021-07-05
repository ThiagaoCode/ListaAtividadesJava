package Familia28;

import java.util.Scanner;
//entre com um valor para mostrar a tabuada deste valor.

public class repeticaoFacaEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada, res, x=1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da tabuada: ");
		tabuada = leia.nextInt();
		
		do 
		{
			res = tabuada * x;
			System.out.println("\n" + tabuada + " X " + x + " = " + res);
			x++;
		}
		while(x<=10);

	}

}
