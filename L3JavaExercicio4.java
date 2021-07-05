package Familia28;

import java.util.Scanner;

/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

public class L3JavaExercicio4 {

	public static void main(String[] args) {
		
		int idade, identGenero, fatPsico, x=1;
		int contPC=0, contMN=0, contHA=0, contOC=0, contPN40=0, contPC18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=150) 
		{
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			System.out.println("\nEntre com a sua identidade de  genero --- 1-Feminino --- 2-Masculino --- 3-Outros ");
			identGenero=leia.nextInt();
			System.out.println("\nEntre com o fator psicológico --- 1-calma --- 2-nervosa --- 3-Agressiva ");
			fatPsico=leia.nextInt();
			
			if(fatPsico == 1) {
				contPC++;
			}
			if(identGenero == 1 && fatPsico == 2) {
				contMN++;
			}
			if(identGenero == 2 && fatPsico == 3) {
				contHA++;
			}
			if(identGenero == 3 && fatPsico == 1) {
				contOC++;
			}
			if(fatPsico == 2 && idade>40) {
				contPN40++;
			}
			if(fatPsico == 1 && idade<18) {
				contPC18++;
			}
			
			x++;
		}
		
		System.out.println("\nPessoas calmas: " + contPC);
		System.out.println("\nmulheres nervosas: " + contMN);
		System.out.println("\nhomens agressivos: " + contHA);
		System.out.println("\nOutros Calmos: " + contOC);
		System.out.println("\nPessoas nersosas com de 40 anos: " + contPN40);
		System.out.println("\nPessoas calmas com menos de 18 anos: " + contPC18);
		
		

	}

}
