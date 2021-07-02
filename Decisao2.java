package Familia28;

import java.util.Scanner;

/* pedir para o usuario digitas um numero de 1 a 12 e mostrar
 qual mes corresponde */

public class Decisao2 {

	public static void main(String[] args) {
		
		int mes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o numero do mês desejado (1 a 12)");
		mes = leia.nextInt();
		
		/*if(mes>=1 && mes<=12) 
		{
			
		}
		*/
		
		switch(mes) 
		{
		case 1:
			System.out.println("\nJaneiro");
			break;
		
		case 2:
			System.out.println("\nFevereiro");
			break;
			
		case 3:
			System.out.println("\nMarço");
			break;
		case 4:
			System.out.println("\nAbril");
			break;
		case 5:
			System.out.println("\nMaio");
			break;
		case 6:
			System.out.println("\nJunho");
			break;
		case 7:
			System.out.println("\nJulho");
			break;
		case 8:
			System.out.println("\nAgosto");
			break;
		case 9:
			System.out.println("\nSetembro");
			break;
		case 10:
			System.out.println("\nOutubro");
			break;
		case 11:
			System.out.println("\nNovembro");
			break;
		case 12:
			System.out.println("\nDezembro");
			break;
			default:
				System.out.println("\nMês invalido!!");
		}
		
		

	}

}
