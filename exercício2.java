package exercícios_de_comandos_condicionais;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		 
		
		Scanner leitor = new Scanner (System.in);
			
		int a, b, resultado;
		
		
			System.out.println("Escreva um número inteiro: ");
			a = leitor.nextInt();
			
			System.out.println("Escreva outro número inteiro: ");
			b = leitor.nextInt();
			
			resultado = a + b;
			
			System.out.println(" Soma: "+resultado);

			
			if( resultado > 10 )
				System.out.println(" O resultado é maior que 10!");

}
	}
