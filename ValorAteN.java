/*
 * ValorAteN.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class ValorAteN {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		int x;
		
		System.out.print("Digite um numero positivo: ");
		x = entrada.nextInt();
		
		do {
			++num;
			System.out.print(num+" ");
		}while(num < x);
	}
}

