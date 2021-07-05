package Familia28;
/* Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class L3JavaExercicio1 {

	public static void main(String[] args) {
		
		int x;
		for(x=1000; x<=1999; x++) {
			if(x % 11 == 5) {
				System.out.println("\n " + x + " é divisível por 11 e o resto dá 5" );
			}
		}

	}

}
