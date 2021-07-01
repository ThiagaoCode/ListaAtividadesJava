package Familia28;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */

public class L1JavaExercicio8 {

	public static void main(String[] args) {
		
		float total, imposto, distribuidora, custoFabrica;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite o valor de fábrica de um carro: ");
		custoFabrica = leia.nextFloat();
		
		imposto=(45*custoFabrica)/100;
		distribuidora=(28*custoFabrica)/100;
		total = custoFabrica + imposto + distribuidora;
		
		
		System.out.println("\nO valor do carro para o consumidor irá fechar em: " +  total + " mil reais.");
		System.out.println("\nO Valor dos impostos para o distribuidor será: " + distribuidora  + " mil reais.");
		System.out.println("\nO Valor dos impostos para o consumidor será: " + imposto + " mil reais.");

	}

}
