package Familia28;

import java.util.Scanner;

/*Entre com um numero e informe se esse numero 
e positivo, negativo ou zero.*/

public class Decisao1 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num>0) 
		{
			System.out.println("\n " + num + " é positivo!!!");
		}
		
		else if(num<0) 
		{
			System.out.println("\n " + num + " é negativo!!!");
		}
		
		else 
		{
			System.out.println("\n " + num + " é ZEROO!!!");
		}

	}

}
